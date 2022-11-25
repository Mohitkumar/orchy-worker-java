// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: flow.proto

package io.github.mohitkumar.orchy.api.v1;

public final class Orchy {
  private Orchy() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Task_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Task_DataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Task_DataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Tasks_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Tasks_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TaskResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TaskResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TaskResult_DataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TaskResult_DataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TaskDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TaskDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TaskDefSaveResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TaskDefSaveResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TaskPollRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TaskPollRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TaskResultPushResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TaskResultPushResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Server_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Server_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetServersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetServersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetServersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetServersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nflow.proto\032\034google/protobuf/struct.pro" +
      "to\"\310\001\n\004Task\022\024\n\014workflowName\030\001 \001(\t\022\016\n\006flo" +
      "wId\030\002 \001(\t\022\035\n\004data\030\003 \003(\0132\017.Task.DataEntry" +
      "\022\020\n\010actionId\030\004 \001(\005\022\020\n\010taskName\030\005 \001(\t\022\022\n\n" +
      "retryCount\030\006 \001(\005\032C\n\tDataEntry\022\013\n\003key\030\001 \001" +
      "(\t\022%\n\005value\030\002 \001(\0132\026.google.protobuf.Valu" +
      "e:\0028\001\"\035\n\005Tasks\022\024\n\005tasks\030\001 \003(\0132\005.Task\"\231\002\n" +
      "\nTaskResult\022\024\n\014workflowName\030\001 \001(\t\022\020\n\010tas" +
      "kName\030\002 \001(\t\022\016\n\006flowId\030\003 \001(\t\022\020\n\010actionId\030" +
      "\004 \001(\005\022#\n\004data\030\005 \003(\0132\025.TaskResult.DataEnt",
      "ry\022\"\n\006status\030\006 \001(\0162\022.TaskResult.Status\022\022" +
      "\n\nretryCount\030\007 \001(\005\032C\n\tDataEntry\022\013\n\003key\030\001" +
      " \001(\t\022%\n\005value\030\002 \001(\0132\026.google.protobuf.Va" +
      "lue:\0028\001\"\037\n\006Status\022\013\n\007SUCCESS\020\000\022\010\n\004FAIL\020\001" +
      "\"s\n\007TaskDef\022\014\n\004name\030\001 \001(\t\022\022\n\nretryCount\030" +
      "\002 \001(\005\022\031\n\021retryAfterSeconds\030\003 \001(\005\022\023\n\013retr" +
      "yPolicy\030\004 \001(\t\022\026\n\016timeoutSeconds\030\005 \001(\005\"%\n" +
      "\023TaskDefSaveResponse\022\016\n\006status\030\001 \001(\010\"6\n\017" +
      "TaskPollRequest\022\020\n\010taskType\030\001 \001(\t\022\021\n\tbat" +
      "chSize\030\002 \001(\005\"(\n\026TaskResultPushResponse\022\016",
      "\n\006status\030\001 \001(\010\"&\n\006Server\022\n\n\002id\030\001 \001(\t\022\020\n\010" +
      "rpc_addr\030\002 \001(\t\"\023\n\021GetServersRequest\".\n\022G" +
      "etServersResponse\022\030\n\007servers\030\001 \003(\0132\007.Ser" +
      "ver2\313\001\n\013TaskService\022/\n\013SaveTaskDef\022\010.Tas" +
      "kDef\032\024.TaskDefSaveResponse\"\000\022\"\n\004Poll\022\020.T" +
      "askPollRequest\032\006.Tasks\"\000\022.\n\004Push\022\013.TaskR" +
      "esult\032\027.TaskResultPushResponse\"\000\0227\n\nGetS" +
      "ervers\022\022.GetServersRequest\032\023.GetServersR" +
      "esponse\"\000B2\n!io.github.mohitkumar.orchy." +
      "api.v1B\005OrchyP\001\242\002\003ORCb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        }, assigner);
    internal_static_Task_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Task_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Task_descriptor,
        new java.lang.String[] { "WorkflowName", "FlowId", "Data", "ActionId", "TaskName", "RetryCount", });
    internal_static_Task_DataEntry_descriptor =
      internal_static_Task_descriptor.getNestedTypes().get(0);
    internal_static_Task_DataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Task_DataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_Tasks_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Tasks_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Tasks_descriptor,
        new java.lang.String[] { "Tasks", });
    internal_static_TaskResult_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_TaskResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TaskResult_descriptor,
        new java.lang.String[] { "WorkflowName", "TaskName", "FlowId", "ActionId", "Data", "Status", "RetryCount", });
    internal_static_TaskResult_DataEntry_descriptor =
      internal_static_TaskResult_descriptor.getNestedTypes().get(0);
    internal_static_TaskResult_DataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TaskResult_DataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_TaskDef_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_TaskDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TaskDef_descriptor,
        new java.lang.String[] { "Name", "RetryCount", "RetryAfterSeconds", "RetryPolicy", "TimeoutSeconds", });
    internal_static_TaskDefSaveResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_TaskDefSaveResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TaskDefSaveResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_TaskPollRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_TaskPollRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TaskPollRequest_descriptor,
        new java.lang.String[] { "TaskType", "BatchSize", });
    internal_static_TaskResultPushResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_TaskResultPushResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TaskResultPushResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_Server_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_Server_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Server_descriptor,
        new java.lang.String[] { "Id", "RpcAddr", });
    internal_static_GetServersRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_GetServersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetServersRequest_descriptor,
        new java.lang.String[] { });
    internal_static_GetServersResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_GetServersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetServersResponse_descriptor,
        new java.lang.String[] { "Servers", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}