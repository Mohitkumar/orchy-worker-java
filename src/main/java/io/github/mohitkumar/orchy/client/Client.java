package io.github.mohitkumar.orchy.client;

import io.github.mohitkumar.orchy.api.v1.TaskServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.NameResolver;
import io.grpc.util.RoundRobinLoadBalancerFactory;

public class Client {

    private TaskServiceGrpc.TaskServiceBlockingStub stub;

    private TaskServiceGrpc.TaskServiceFutureStub asyncStub;

    public Client(String host, int port) {
        NameResolver.Factory factory = new CustomNameResolverFactory(host,port);
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forTarget("orchy")
                .nameResolverFactory(factory)
                .loadBalancerFactory(RoundRobinLoadBalancerFactory.getInstance())
                .usePlaintext().build();
        stub = TaskServiceGrpc.newBlockingStub(managedChannel);
        asyncStub = TaskServiceGrpc.newFutureStub(managedChannel);
    }

    public TaskServiceGrpc.TaskServiceBlockingStub getClient(){
        return stub;
    }

    public TaskServiceGrpc.TaskServiceFutureStub getAsyncClient(){
        return asyncStub;
    }
}
