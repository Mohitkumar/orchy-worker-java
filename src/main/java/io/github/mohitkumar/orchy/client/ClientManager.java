package io.github.mohitkumar.orchy.client;

import io.github.mohitkumar.orchy.api.v1.ActionServiceGrpc;
import io.github.mohitkumar.orchy.api.v1.GetServersRequest;
import io.github.mohitkumar.orchy.api.v1.GetServersResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ClientManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientManager.class);

    private List<Client> clients = new ArrayList<>();

    private ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    private ManagedChannel managedChannel;

    private Set<ServerAddress> servers = new HashSet<>();

    public ClientManager(String host, int port) {
        managedChannel = ManagedChannelBuilder
                .forAddress(host,port)
                .usePlaintext().build();
    }

    public void start(){
        executor.scheduleAtFixedRate(() ->{
            Set<ServerAddress> newServers = getServers();
            if(!newServers.equals(servers)){
                for (Client client : clients) {
                    System.out.println("refreshing client" + client);
                    client.refresh(newServers);
                    System.out.println("after refresh");
                }
                servers = newServers;
            }

        },0, 5, TimeUnit.SECONDS);
    }

    public void stop(){
        executor.shutdown();
        try {
            // Wait a while for existing tasks to terminate
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                // Cancel currently executing tasks forcefully
                executor.shutdownNow();
            }
        } catch (InterruptedException ex) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
    public Client newClient(){
        Client client = new Client(getServers());
        clients.add(client);
        return client;
    }

    private Set<ServerAddress> getServers(){
        Set<ServerAddress> addresses = new HashSet<>();
        GetServersRequest request  = GetServersRequest.newBuilder().build();
        GetServersResponse servers = ActionServiceGrpc
                .newBlockingStub(managedChannel)
                .getServers(request);
        List<io.github.mohitkumar.orchy.api.v1.Server> serversList = servers.getServersList();
        LOGGER.info("connecting to cluster nodes={}", servers);
        for (io.github.mohitkumar.orchy.api.v1.Server server : serversList) {
            String rpcAddr = server.getRpcAddr();
            String[] split = rpcAddr.split(":");
            String hostName = split[0];
            int portN = Integer.parseInt(split[1]);
            addresses.add(new ServerAddress(hostName, portN));
        }
        return addresses;
    }

}
