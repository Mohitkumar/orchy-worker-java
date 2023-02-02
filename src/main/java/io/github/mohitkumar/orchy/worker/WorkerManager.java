package io.github.mohitkumar.orchy.worker;

import io.github.mohitkumar.orchy.api.v1.ActionDefinition;
import io.github.mohitkumar.orchy.client.Client;
import io.github.mohitkumar.orchy.client.ClientManager;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerManager {

    private Map<Worker, Integer> workers = new HashMap<>();

    private String serverHost;

    private int serverPort;

    private List<Poller> pollers = new ArrayList<>();

    private ClientManager clientManager;

    private Client client;

    public WorkerManager(String serverHost, int serverPort) {
        this.serverHost = serverHost;
        this.serverPort = serverPort;
        clientManager = new ClientManager(serverHost, serverPort);
        client = clientManager.newClient();
    }

    public void registerWorker(Worker worker, int threadCount){
        ActionDefinition actionDefinition = ActionDefinition.newBuilder()
                .setName(worker.getName())
                .setRetryCount(worker.getRetryCount())
                .setRetryAfterSeconds(worker.getRetryAfterSeconds())
                .setRetryPolicy(worker.getRetryPolicy().name())
                .setTimeoutSeconds(worker.getTimeoutSeconds())
                .build();
        client.getClient().saveActionDefinition(actionDefinition);
        workers.put(worker, threadCount);
    }

    public void start(){
        for (Map.Entry<Worker, Integer> entry : workers.entrySet()) {
            Poller poller = new Poller(entry.getKey(), clientManager.newClient(), entry.getValue());
            pollers.add(poller);
            for(int i = 0; i< entry.getValue(); i++){
                poller.start();
            }
        }
        clientManager.start();
    }

    public void stop(){
        for (Poller poller : pollers) {
            poller.stop();
        }
        clientManager.stop();
    }
}
