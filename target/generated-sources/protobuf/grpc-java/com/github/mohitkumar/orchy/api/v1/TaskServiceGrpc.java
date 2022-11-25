package com.github.mohitkumar.orchy.api.v1;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: flow.proto")
public final class TaskServiceGrpc {

  private TaskServiceGrpc() {}

  public static final String SERVICE_NAME = "TaskService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.github.mohitkumar.orchy.api.v1.TaskDef,
      com.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse> METHOD_SAVE_TASK_DEF =
      io.grpc.MethodDescriptor.<com.github.mohitkumar.orchy.api.v1.TaskDef, com.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "TaskService", "SaveTaskDef"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.github.mohitkumar.orchy.api.v1.TaskDef.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.github.mohitkumar.orchy.api.v1.TaskPollRequest,
      com.github.mohitkumar.orchy.api.v1.Tasks> METHOD_POLL =
      io.grpc.MethodDescriptor.<com.github.mohitkumar.orchy.api.v1.TaskPollRequest, com.github.mohitkumar.orchy.api.v1.Tasks>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "TaskService", "Poll"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.github.mohitkumar.orchy.api.v1.TaskPollRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.github.mohitkumar.orchy.api.v1.Tasks.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.github.mohitkumar.orchy.api.v1.TaskResult,
      com.github.mohitkumar.orchy.api.v1.TaskResultPushResponse> METHOD_PUSH =
      io.grpc.MethodDescriptor.<com.github.mohitkumar.orchy.api.v1.TaskResult, com.github.mohitkumar.orchy.api.v1.TaskResultPushResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "TaskService", "Push"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.github.mohitkumar.orchy.api.v1.TaskResult.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.github.mohitkumar.orchy.api.v1.TaskResultPushResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.github.mohitkumar.orchy.api.v1.GetServersRequest,
      com.github.mohitkumar.orchy.api.v1.GetServersResponse> METHOD_GET_SERVERS =
      io.grpc.MethodDescriptor.<com.github.mohitkumar.orchy.api.v1.GetServersRequest, com.github.mohitkumar.orchy.api.v1.GetServersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "TaskService", "GetServers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.github.mohitkumar.orchy.api.v1.GetServersRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.github.mohitkumar.orchy.api.v1.GetServersResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskServiceStub newStub(io.grpc.Channel channel) {
    return new TaskServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TaskServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TaskServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TaskServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveTaskDef(com.github.mohitkumar.orchy.api.v1.TaskDef request,
        io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_TASK_DEF, responseObserver);
    }

    /**
     */
    public void poll(com.github.mohitkumar.orchy.api.v1.TaskPollRequest request,
        io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.Tasks> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_POLL, responseObserver);
    }

    /**
     */
    public void push(com.github.mohitkumar.orchy.api.v1.TaskResult request,
        io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.TaskResultPushResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PUSH, responseObserver);
    }

    /**
     */
    public void getServers(com.github.mohitkumar.orchy.api.v1.GetServersRequest request,
        io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.GetServersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SERVERS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAVE_TASK_DEF,
            asyncUnaryCall(
              new MethodHandlers<
                com.github.mohitkumar.orchy.api.v1.TaskDef,
                com.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse>(
                  this, METHODID_SAVE_TASK_DEF)))
          .addMethod(
            METHOD_POLL,
            asyncUnaryCall(
              new MethodHandlers<
                com.github.mohitkumar.orchy.api.v1.TaskPollRequest,
                com.github.mohitkumar.orchy.api.v1.Tasks>(
                  this, METHODID_POLL)))
          .addMethod(
            METHOD_PUSH,
            asyncUnaryCall(
              new MethodHandlers<
                com.github.mohitkumar.orchy.api.v1.TaskResult,
                com.github.mohitkumar.orchy.api.v1.TaskResultPushResponse>(
                  this, METHODID_PUSH)))
          .addMethod(
            METHOD_GET_SERVERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.github.mohitkumar.orchy.api.v1.GetServersRequest,
                com.github.mohitkumar.orchy.api.v1.GetServersResponse>(
                  this, METHODID_GET_SERVERS)))
          .build();
    }
  }

  /**
   */
  public static final class TaskServiceStub extends io.grpc.stub.AbstractStub<TaskServiceStub> {
    private TaskServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveTaskDef(com.github.mohitkumar.orchy.api.v1.TaskDef request,
        io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_TASK_DEF, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poll(com.github.mohitkumar.orchy.api.v1.TaskPollRequest request,
        io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.Tasks> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_POLL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void push(com.github.mohitkumar.orchy.api.v1.TaskResult request,
        io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.TaskResultPushResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PUSH, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getServers(com.github.mohitkumar.orchy.api.v1.GetServersRequest request,
        io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.GetServersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SERVERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TaskServiceBlockingStub extends io.grpc.stub.AbstractStub<TaskServiceBlockingStub> {
    private TaskServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse saveTaskDef(com.github.mohitkumar.orchy.api.v1.TaskDef request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_TASK_DEF, getCallOptions(), request);
    }

    /**
     */
    public com.github.mohitkumar.orchy.api.v1.Tasks poll(com.github.mohitkumar.orchy.api.v1.TaskPollRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_POLL, getCallOptions(), request);
    }

    /**
     */
    public com.github.mohitkumar.orchy.api.v1.TaskResultPushResponse push(com.github.mohitkumar.orchy.api.v1.TaskResult request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PUSH, getCallOptions(), request);
    }

    /**
     */
    public com.github.mohitkumar.orchy.api.v1.GetServersResponse getServers(com.github.mohitkumar.orchy.api.v1.GetServersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SERVERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TaskServiceFutureStub extends io.grpc.stub.AbstractStub<TaskServiceFutureStub> {
    private TaskServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse> saveTaskDef(
        com.github.mohitkumar.orchy.api.v1.TaskDef request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_TASK_DEF, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.mohitkumar.orchy.api.v1.Tasks> poll(
        com.github.mohitkumar.orchy.api.v1.TaskPollRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_POLL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.mohitkumar.orchy.api.v1.TaskResultPushResponse> push(
        com.github.mohitkumar.orchy.api.v1.TaskResult request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PUSH, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.mohitkumar.orchy.api.v1.GetServersResponse> getServers(
        com.github.mohitkumar.orchy.api.v1.GetServersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SERVERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_TASK_DEF = 0;
  private static final int METHODID_POLL = 1;
  private static final int METHODID_PUSH = 2;
  private static final int METHODID_GET_SERVERS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaskServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TaskServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_TASK_DEF:
          serviceImpl.saveTaskDef((com.github.mohitkumar.orchy.api.v1.TaskDef) request,
              (io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse>) responseObserver);
          break;
        case METHODID_POLL:
          serviceImpl.poll((com.github.mohitkumar.orchy.api.v1.TaskPollRequest) request,
              (io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.Tasks>) responseObserver);
          break;
        case METHODID_PUSH:
          serviceImpl.push((com.github.mohitkumar.orchy.api.v1.TaskResult) request,
              (io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.TaskResultPushResponse>) responseObserver);
          break;
        case METHODID_GET_SERVERS:
          serviceImpl.getServers((com.github.mohitkumar.orchy.api.v1.GetServersRequest) request,
              (io.grpc.stub.StreamObserver<com.github.mohitkumar.orchy.api.v1.GetServersResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class TaskServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.mohitkumar.orchy.api.v1.Orchy.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TaskServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskServiceDescriptorSupplier())
              .addMethod(METHOD_SAVE_TASK_DEF)
              .addMethod(METHOD_POLL)
              .addMethod(METHOD_PUSH)
              .addMethod(METHOD_GET_SERVERS)
              .build();
        }
      }
    }
    return result;
  }
}
