package io.github.mohitkumar.orchy.api.v1;

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
public final class ActionServiceGrpc {

  private ActionServiceGrpc() {}

  public static final String SERVICE_NAME = "ActionService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.github.mohitkumar.orchy.api.v1.ActionDefinition,
      io.github.mohitkumar.orchy.api.v1.ActionDefinitionSaveResponse> METHOD_SAVE_ACTION_DEFINITION =
      io.grpc.MethodDescriptor.<io.github.mohitkumar.orchy.api.v1.ActionDefinition, io.github.mohitkumar.orchy.api.v1.ActionDefinitionSaveResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ActionService", "SaveActionDefinition"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.github.mohitkumar.orchy.api.v1.ActionDefinition.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.github.mohitkumar.orchy.api.v1.ActionDefinitionSaveResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.github.mohitkumar.orchy.api.v1.ActionPollRequest,
      io.github.mohitkumar.orchy.api.v1.Actions> METHOD_POLL =
      io.grpc.MethodDescriptor.<io.github.mohitkumar.orchy.api.v1.ActionPollRequest, io.github.mohitkumar.orchy.api.v1.Actions>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ActionService", "Poll"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.github.mohitkumar.orchy.api.v1.ActionPollRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.github.mohitkumar.orchy.api.v1.Actions.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.github.mohitkumar.orchy.api.v1.ActionResult,
      io.github.mohitkumar.orchy.api.v1.ActionResultPushResponse> METHOD_PUSH =
      io.grpc.MethodDescriptor.<io.github.mohitkumar.orchy.api.v1.ActionResult, io.github.mohitkumar.orchy.api.v1.ActionResultPushResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ActionService", "Push"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.github.mohitkumar.orchy.api.v1.ActionResult.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.github.mohitkumar.orchy.api.v1.ActionResultPushResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.github.mohitkumar.orchy.api.v1.GetServersRequest,
      io.github.mohitkumar.orchy.api.v1.GetServersResponse> METHOD_GET_SERVERS =
      io.grpc.MethodDescriptor.<io.github.mohitkumar.orchy.api.v1.GetServersRequest, io.github.mohitkumar.orchy.api.v1.GetServersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ActionService", "GetServers"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.github.mohitkumar.orchy.api.v1.GetServersRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.github.mohitkumar.orchy.api.v1.GetServersResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ActionServiceStub newStub(io.grpc.Channel channel) {
    return new ActionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ActionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ActionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ActionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ActionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ActionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveActionDefinition(io.github.mohitkumar.orchy.api.v1.ActionDefinition request,
        io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.ActionDefinitionSaveResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_ACTION_DEFINITION, responseObserver);
    }

    /**
     */
    public void poll(io.github.mohitkumar.orchy.api.v1.ActionPollRequest request,
        io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.Actions> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_POLL, responseObserver);
    }

    /**
     */
    public void push(io.github.mohitkumar.orchy.api.v1.ActionResult request,
        io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.ActionResultPushResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PUSH, responseObserver);
    }

    /**
     */
    public void getServers(io.github.mohitkumar.orchy.api.v1.GetServersRequest request,
        io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.GetServersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SERVERS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAVE_ACTION_DEFINITION,
            asyncUnaryCall(
              new MethodHandlers<
                io.github.mohitkumar.orchy.api.v1.ActionDefinition,
                io.github.mohitkumar.orchy.api.v1.ActionDefinitionSaveResponse>(
                  this, METHODID_SAVE_ACTION_DEFINITION)))
          .addMethod(
            METHOD_POLL,
            asyncUnaryCall(
              new MethodHandlers<
                io.github.mohitkumar.orchy.api.v1.ActionPollRequest,
                io.github.mohitkumar.orchy.api.v1.Actions>(
                  this, METHODID_POLL)))
          .addMethod(
            METHOD_PUSH,
            asyncUnaryCall(
              new MethodHandlers<
                io.github.mohitkumar.orchy.api.v1.ActionResult,
                io.github.mohitkumar.orchy.api.v1.ActionResultPushResponse>(
                  this, METHODID_PUSH)))
          .addMethod(
            METHOD_GET_SERVERS,
            asyncUnaryCall(
              new MethodHandlers<
                io.github.mohitkumar.orchy.api.v1.GetServersRequest,
                io.github.mohitkumar.orchy.api.v1.GetServersResponse>(
                  this, METHODID_GET_SERVERS)))
          .build();
    }
  }

  /**
   */
  public static final class ActionServiceStub extends io.grpc.stub.AbstractStub<ActionServiceStub> {
    private ActionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ActionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ActionServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveActionDefinition(io.github.mohitkumar.orchy.api.v1.ActionDefinition request,
        io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.ActionDefinitionSaveResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_ACTION_DEFINITION, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void poll(io.github.mohitkumar.orchy.api.v1.ActionPollRequest request,
        io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.Actions> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_POLL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void push(io.github.mohitkumar.orchy.api.v1.ActionResult request,
        io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.ActionResultPushResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PUSH, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getServers(io.github.mohitkumar.orchy.api.v1.GetServersRequest request,
        io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.GetServersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SERVERS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ActionServiceBlockingStub extends io.grpc.stub.AbstractStub<ActionServiceBlockingStub> {
    private ActionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ActionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ActionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.github.mohitkumar.orchy.api.v1.ActionDefinitionSaveResponse saveActionDefinition(io.github.mohitkumar.orchy.api.v1.ActionDefinition request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_ACTION_DEFINITION, getCallOptions(), request);
    }

    /**
     */
    public io.github.mohitkumar.orchy.api.v1.Actions poll(io.github.mohitkumar.orchy.api.v1.ActionPollRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_POLL, getCallOptions(), request);
    }

    /**
     */
    public io.github.mohitkumar.orchy.api.v1.ActionResultPushResponse push(io.github.mohitkumar.orchy.api.v1.ActionResult request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PUSH, getCallOptions(), request);
    }

    /**
     */
    public io.github.mohitkumar.orchy.api.v1.GetServersResponse getServers(io.github.mohitkumar.orchy.api.v1.GetServersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SERVERS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ActionServiceFutureStub extends io.grpc.stub.AbstractStub<ActionServiceFutureStub> {
    private ActionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ActionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ActionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.mohitkumar.orchy.api.v1.ActionDefinitionSaveResponse> saveActionDefinition(
        io.github.mohitkumar.orchy.api.v1.ActionDefinition request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_ACTION_DEFINITION, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.mohitkumar.orchy.api.v1.Actions> poll(
        io.github.mohitkumar.orchy.api.v1.ActionPollRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_POLL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.mohitkumar.orchy.api.v1.ActionResultPushResponse> push(
        io.github.mohitkumar.orchy.api.v1.ActionResult request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PUSH, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.github.mohitkumar.orchy.api.v1.GetServersResponse> getServers(
        io.github.mohitkumar.orchy.api.v1.GetServersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SERVERS, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_ACTION_DEFINITION = 0;
  private static final int METHODID_POLL = 1;
  private static final int METHODID_PUSH = 2;
  private static final int METHODID_GET_SERVERS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ActionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ActionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_ACTION_DEFINITION:
          serviceImpl.saveActionDefinition((io.github.mohitkumar.orchy.api.v1.ActionDefinition) request,
              (io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.ActionDefinitionSaveResponse>) responseObserver);
          break;
        case METHODID_POLL:
          serviceImpl.poll((io.github.mohitkumar.orchy.api.v1.ActionPollRequest) request,
              (io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.Actions>) responseObserver);
          break;
        case METHODID_PUSH:
          serviceImpl.push((io.github.mohitkumar.orchy.api.v1.ActionResult) request,
              (io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.ActionResultPushResponse>) responseObserver);
          break;
        case METHODID_GET_SERVERS:
          serviceImpl.getServers((io.github.mohitkumar.orchy.api.v1.GetServersRequest) request,
              (io.grpc.stub.StreamObserver<io.github.mohitkumar.orchy.api.v1.GetServersResponse>) responseObserver);
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

  private static final class ActionServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.github.mohitkumar.orchy.api.v1.Orchy.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ActionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ActionServiceDescriptorSupplier())
              .addMethod(METHOD_SAVE_ACTION_DEFINITION)
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
