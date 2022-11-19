package com.orchy.worker;

import com.google.protobuf.Value;
import com.orchy.api.v1.*;
import com.orchy.client.Client;
import com.orchy.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Poller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Poller.class);

    private ScheduledExecutorService scheduledExecutorService;

    private Worker worker;

    private String workerName;

    private Client client;

    public Poller(Worker worker, Client client, int threads) {
        this.worker = worker;
        this.client = client;
        this.workerName = this.worker.getName();
        scheduledExecutorService = Executors.newScheduledThreadPool(threads);
    }

    public void start(){
        scheduledExecutorService.scheduleAtFixedRate(new PollerWorker(),0,worker.getPollInterval(), TimeUnit.SECONDS);
    }

    public void stop(){

    }

    private class PollerWorker implements Runnable{

        TaskPollRequest request = TaskPollRequest
                .newBuilder()
                .setTaskType(Poller.this.workerName)
                .setBatchSize(Poller.this.worker.getBatchSize()).build();

        @Override
        public void run() {
            LOGGER.debug("polling worker {}",Poller.this.workerName);
            try{
                Tasks tasks = Poller.this.client.getClient().poll(request);
                LOGGER.debug("found task size {}", tasks.getTasksList().size());
                List<Task> tasksList = tasks.getTasksList();
                for (Task task : tasksList) {
                    Map<String, Value> dataMap = task.getDataMap();
                    Map<String, Object> map = Util.convert(dataMap);
                    TaskResult result;
                    try{
                        Map<String, Object> output = Poller.this.worker.execute(map);
                        result = TaskResult.newBuilder()
                                .setWorkflowName(task.getWorkflowName())
                                .setFlowId(task.getFlowId())
                                .setActionId(task.getActionId())
                                .setTaskName(task.getTaskName())
                                .setStatus(TaskResult.Status.SUCCESS)
                                .setRetryCount(task.getRetryCount())
                                .putAllData(Util.convertRev(output))
                                .build();
                    }catch (Exception e){
                        e.printStackTrace();
                        result = TaskResult.newBuilder()
                                .setWorkflowName(task.getWorkflowName())
                                .setFlowId(task.getFlowId())
                                .setActionId(task.getActionId())
                                .setTaskName(task.getTaskName())
                                .setRetryCount(task.getRetryCount())
                                .setStatus(TaskResult.Status.FAIL)
                                .build();
                    }
                    sendResponse(result);
                }
            }catch (Exception e){

            }
        }
        private void sendResponse(TaskResult result){
            try{
                TaskResultPushResponse response = Poller.this.client.getClient().push(result);
                boolean status = response.getStatus();
                LOGGER.debug("task result submit status {}",status);
                if(!status){
                    //retry
                }
            }catch (Exception e){
                //retry
            }
        }
    }


}
