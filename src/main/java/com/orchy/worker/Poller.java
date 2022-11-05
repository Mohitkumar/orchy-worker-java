package com.orchy.worker;

import com.google.protobuf.Value;
import com.orchy.api.v1.*;
import com.orchy.client.Client;
import com.orchy.util.Util;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Poller {

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

        @Override
        public void run() {
            TaskPollRequest request = TaskPollRequest
                    .newBuilder()
                    .setTaskType(Poller.this.workerName)
                    .setBatchSize(Poller.this.worker.getBatchSize()).build();
            try{
                Tasks tasks = Poller.this.client.getClient().poll(request);
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
                                .build();
                    }catch (Exception e){
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
                if(!status){
                    //retry
                }
            }catch (Exception e){
                //retry
            }
        }
    }


}
