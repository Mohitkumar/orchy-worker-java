package com.github.mohitkumar.orchy.worker;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Worker {
    private Function<Map<String,Object>, Map<String,Object>> fn;

    private String name;

    private int batchSize;

    private int pollInterval;

    private TimeUnit pollIntervalTimeUnit;

    private int retryCount;
    private int retryAfterSeconds;
    private int timeoutSeconds ;
    private RetryPolicy retryPolicy;

    private Worker(Function<Map<String, Object>, Map<String, Object>> fn, String name,
                   int batchSize, int pollInterval, TimeUnit pollIntervalTimeUnit) {
        this.fn = fn;
        this.name = name;
        this.batchSize = batchSize;
        this.pollInterval = pollInterval;
        this.pollIntervalTimeUnit = pollIntervalTimeUnit;
    }

    public Map<String, Object> execute(Map<String, Object> input){
        return fn.apply(input);
    }

    public String getName() {
        return name;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public int getPollInterval() {
        return pollInterval;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public int getRetryAfterSeconds() {
        return retryAfterSeconds;
    }

    public RetryPolicy getRetryPolicy() {
        return retryPolicy;
    }

    public int getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public TimeUnit getPollIntervalTimeUnit() {
        return pollIntervalTimeUnit;
    }

    public static Builder newBuilder(){
        return new Builder();
    }
    public static class Builder{
        private Worker worker;

        public Builder DefaultWorker(Function<Map<String, Object>, Map<String, Object>> fn, String name,
                                     int batchSize, int pollInterval, TimeUnit pollIntervalTimeUnit){
            this.worker = new Worker(fn,name,batchSize, pollInterval,pollIntervalTimeUnit);
            this.worker.retryCount = 3;
            this.worker.retryAfterSeconds = 5;
            this.worker.timeoutSeconds = 10;
            this.worker.retryPolicy = RetryPolicy.FIXED;
            return this;
        }

        public Builder withRetryCount(int count){
            this.worker.retryCount = count;
            return this;
        }
        public Builder withRetryInterval(int retryInterval){
            this.worker.retryAfterSeconds = retryInterval;
            return this;
        }

        public Builder withTimeout(int timeoutSecond){
            this.worker.timeoutSeconds = timeoutSecond;
            return this;
        }

        public Builder withRetryPolicy(RetryPolicy retryPolicy){
            this.worker.retryPolicy = retryPolicy;
            return this;
        }
        public Worker build(){
            return this.worker;
        }
    }
}
