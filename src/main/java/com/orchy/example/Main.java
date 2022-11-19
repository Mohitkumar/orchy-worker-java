package com.orchy.example;

import com.orchy.worker.Worker;
import com.orchy.worker.WorkerManager;

import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Map<String, Object>, Map<String, Object>> addDataFn= (Map<String, Object> input) ->{
            System.out.println(input);
            input.put("newKey",22);
            return input;
        };
        Function<Map<String, Object>, Map<String, Object>> printFn= (Map<String, Object> input) ->{
            System.out.println(input);
            return input;
        };
        Worker worker1 = Worker
                .newBuilder()
                .DefaultWorker(addDataFn,"add-data-worker", 2,1).build();
        Worker worker2 = Worker
                .newBuilder()
                .DefaultWorker(printFn,"print-worker", 2,1).build();
        WorkerManager manager = new WorkerManager("localhost",8099);
        manager.registerWorker(worker1,1);
        manager.registerWorker(worker2,1);
        manager.start();
    }
}
