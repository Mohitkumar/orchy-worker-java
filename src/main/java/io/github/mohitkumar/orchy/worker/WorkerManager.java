package io.github.mohitkumar.orchy.worker;

import io.github.mohitkumar.orchy.api.v1.TaskDef;
import io.github.mohitkumar.orchy.client.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerManager {

    private Map<Worker, Integer> workers = new HashMap<>();

    private String serverHost;

    private int serverPort;

    private List<Poller> pollers = new ArrayList<>();

    private Client client;

    public WorkerManager(String serverHost, int serverPort) {
        this.serverHost = serverHost;
        this.serverPort = serverPort;
        client = new Client(serverHost, serverPort);
    }

    public void registerWorker(Worker worker, int threadCount){
        TaskDef taskDef = TaskDef.newBuilder()
                .setName(worker.getName())
                .setRetryCount(worker.getRetryCount())
                .setRetryAfterSeconds(worker.getRetryAfterSeconds())
                .setRetryPolicy(worker.getRetryPolicy().name())
                .setTimeoutSeconds(worker.getTimeoutSeconds())
                .build();
        client.getClient().saveTaskDef(taskDef);
        workers.put(worker, threadCount);
    }

    public void start(){
        for (Map.Entry<Worker, Integer> entry : workers.entrySet()) {
            Poller poller = new Poller(entry.getKey(), new Client(serverHost, serverPort), entry.getValue());
            pollers.add(poller);
            poller.start();
        }
    }

    public void stop(){
        for (Poller poller : pollers) {
            poller.stop();
        }
    }
}
