package io.github.mohitkumar.orchy.example;

import io.github.mohitkumar.orchy.worker.Worker;
import io.github.mohitkumar.orchy.worker.WorkerManager;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Map<String, Object>, Map<String, Object>> addDataFn= (Map<String, Object> input) ->{
            input.put("newKey",22);
            return input;
        };
        Function<Map<String, Object>, Map<String, Object>> printFn= (Map<String, Object> input) ->{
            System.out.println(input);
            return input;
        };
        Function<Map<String, Object>, Map<String, Object>> enhanceDataFn= (Map<String, Object> input) ->{
            input.put("key", "prefix_"+input.get("key"));
            return input;
        };
        Worker worker1 = Worker
                .newBuilder()
                .DefaultWorker(addDataFn,"add-data-worker", 2,10, TimeUnit.MICROSECONDS).build();
        Worker worker2 = Worker
                .newBuilder()
                .DefaultWorker(printFn,"print-worker", 2,10,TimeUnit.MICROSECONDS).build();

        Worker worker3 = Worker
                .newBuilder()
                .DefaultWorker(enhanceDataFn,"enhanceData", 2,10,TimeUnit.MICROSECONDS).build();
        WorkerManager manager = new WorkerManager("localhost",8099);
        manager.registerWorker(worker1,1);
        manager.registerWorker(worker2,1);
        manager.registerWorker(worker3,1);
        manager.start();
    }
}
