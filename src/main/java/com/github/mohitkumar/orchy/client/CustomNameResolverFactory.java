package com.github.mohitkumar.orchy.client;

import com.github.mohitkumar.orchy.api.v1.GetServersRequest;
import com.github.mohitkumar.orchy.api.v1.GetServersResponse;
import com.github.mohitkumar.orchy.api.v1.Server;
import com.github.mohitkumar.orchy.api.v1.TaskServiceGrpc;
import io.grpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomNameResolverFactory extends NameResolver.Factory {

    private Logger LOGGER = LoggerFactory.getLogger(CustomNameResolverFactory.class);

    List<EquivalentAddressGroup> addresses = new ArrayList<>();

    private ManagedChannel managedChannel;

    public CustomNameResolverFactory(String host, int port) {
        managedChannel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext().build();
        GetServersRequest request  = GetServersRequest.newBuilder().build();
        GetServersResponse servers = TaskServiceGrpc.newBlockingStub(managedChannel).getServers(request);
        List<com.github.mohitkumar.orchy.api.v1.Server> serversList = servers.getServersList();
        LOGGER.info("connecting to cluster nodes={}", servers);
        for (com.github.mohitkumar.orchy.api.v1.Server server : serversList) {
            String rpcAddr = server.getRpcAddr();
            String[] split = rpcAddr.split(":");
            String hostName = split[0];
            int portN = Integer.parseInt(split[1]);
            addresses.add(new EquivalentAddressGroup(new InetSocketAddress(hostName, portN)));
        }
    }

    @Nullable
    @Override
    public NameResolver newNameResolver(URI uri, Attributes attributes) {

        return new NameResolver() {
            private NameResolver.Listener listener;

            @Override
            public String getServiceAuthority() {
                return "fakeAuthority";
            }

            @Override
            public void start(Listener listener) {
                this.listener = listener;
                listener.onAddresses(addresses, Attributes.EMPTY);
            }

            @Override
            public void refresh() {
                List<EquivalentAddressGroup> addresses = new ArrayList<>();
                GetServersRequest request  = GetServersRequest.newBuilder().build();
                GetServersResponse servers = TaskServiceGrpc.newBlockingStub(managedChannel).getServers(request);
                List<com.github.mohitkumar.orchy.api.v1.Server> serversList = servers.getServersList();
                for (Server server : serversList) {
                    String rpcAddr = server.getRpcAddr();
                    String[] split = rpcAddr.split(":");
                    String hostName = split[0];
                    int portN = Integer.parseInt(split[1]);
                    addresses.add(new EquivalentAddressGroup(new InetSocketAddress(hostName, portN)));
                }
                Collections.shuffle(addresses);
                this.listener.onAddresses(addresses, Attributes.EMPTY);
            }

            public void shutdown() {
            }
        };
    }

    @Override
    public String getDefaultScheme() {
        return "orchy";
    }
}