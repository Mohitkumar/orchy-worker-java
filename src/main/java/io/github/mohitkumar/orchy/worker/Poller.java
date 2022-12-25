package io.github.mohitkumar.orchy.worker;

import com.google.protobuf.Value;
import io.github.mohitkumar.orchy.api.v1.*;
import io.github.mohitkumar.orchy.client.Client;
import io.github.mohitkumar.orchy.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

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
        scheduledExecutorService.scheduleAtFixedRate(new PollerWorker(),0,
                worker.getPollInterval(), worker.getPollIntervalTimeUnit());
    }

    public void stop(){

    }

    private class PollerWorker implements Runnable{

        ActionPollRequest request = ActionPollRequest
                .newBuilder()
                .setActionType(Poller.this.workerName)
                .setBatchSize(Poller.this.worker.getBatchSize()).build();

        @Override
        public void run() {
            LOGGER.debug("polling worker {}",Poller.this.workerName);
            try{
                Actions actions = Poller.this.client.getClient().poll(request);
                LOGGER.debug("found actions size {}", actions.getActionsList().size());
                List<Action> actionsList = actions.getActionsList();
                for (Action action : actionsList) {
                    Map<String, Value> dataMap = action.getDataMap();
                    Map<String, Object> map = Util.convert(dataMap);
                    ActionResult result;
                    try{
                        Map<String, Object> output = Poller.this.worker.execute(map);
                        result = ActionResult.newBuilder()
                                .setWorkflowName(action.getWorkflowName())
                                .setFlowId(action.getFlowId())
                                .setActionId(action.getActionId())
                                .setActionName(action.getActionName())
                                .setStatus(ActionResult.Status.SUCCESS)
                                .setRetryCount(action.getRetryCount())
                                .putAllData(Util.convertRev(output))
                                .build();
                    }catch (Exception e){
                        e.printStackTrace();
                        result = ActionResult.newBuilder()
                                .setWorkflowName(action.getWorkflowName())
                                .setFlowId(action.getFlowId())
                                .setActionId(action.getActionId())
                                .setActionName(action.getActionName())
                                .setRetryCount(action.getRetryCount())
                                .setStatus(ActionResult.Status.FAIL)
                                .build();
                    }
                    sendResponse(result);
                }
            }catch (Exception e){

            }
        }
        private void sendResponse(ActionResult result){
            try{
                ActionResultPushResponse response = Poller.this.client.getClient().push(result);
                boolean status = response.getStatus();
                LOGGER.info("task result submit status {}",status);
                if(!status){
                    //retry
                }
            }catch (Exception e){
                LOGGER.error("error sending response",e);
                //retry
            }
        }
    }


}
