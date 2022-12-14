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
    internal_static_Action_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Action_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Action_DataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Action_DataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Actions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Actions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActionResult_DataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActionResult_DataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActionDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActionDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActionDefinitionSaveResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActionDefinitionSaveResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActionPollRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActionPollRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActionResultPushResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActionResultPushResponse_fieldAccessorTable;
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
      "to\"\210\002\n\006Action\022\024\n\014workflowName\030\001 \001(\t\022\016\n\006f" +
      "lowId\030\002 \001(\t\022\037\n\004data\030\003 \003(\0132\021.Action.DataE" +
      "ntry\022\020\n\010actionId\030\004 \001(\005\022\022\n\nactionName\030\005 \001" +
      "(\t\022\022\n\nretryCount\030\006 \001(\005\022\032\n\004type\030\007 \001(\0162\014.A" +
      "ction.Type\032C\n\tDataEntry\022\013\n\003key\030\001 \001(\t\022%\n\005" +
      "value\030\002 \001(\0132\026.google.protobuf.Value:\0028\001\"" +
      "\034\n\004Type\022\n\n\006SYSTEM\020\000\022\010\n\004USER\020\001\"#\n\007Actions" +
      "\022\030\n\007actions\030\001 \003(\0132\007.Action\"\241\002\n\014ActionRes" +
      "ult\022\024\n\014workflowName\030\001 \001(\t\022\022\n\nactionName\030",
      "\002 \001(\t\022\016\n\006flowId\030\003 \001(\t\022\020\n\010actionId\030\004 \001(\005\022" +
      "%\n\004data\030\005 \003(\0132\027.ActionResult.DataEntry\022$" +
      "\n\006status\030\006 \001(\0162\024.ActionResult.Status\022\022\n\n" +
      "retryCount\030\007 \001(\005\032C\n\tDataEntry\022\013\n\003key\030\001 \001" +
      "(\t\022%\n\005value\030\002 \001(\0132\026.google.protobuf.Valu" +
      "e:\0028\001\"\037\n\006Status\022\013\n\007SUCCESS\020\000\022\010\n\004FAIL\020\001\"|" +
      "\n\020ActionDefinition\022\014\n\004name\030\001 \001(\t\022\022\n\nretr" +
      "yCount\030\002 \001(\005\022\031\n\021retryAfterSeconds\030\003 \001(\005\022" +
      "\023\n\013retryPolicy\030\004 \001(\t\022\026\n\016timeoutSeconds\030\005" +
      " \001(\005\".\n\034ActionDefinitionSaveResponse\022\016\n\006",
      "status\030\001 \001(\010\":\n\021ActionPollRequest\022\022\n\nact" +
      "ionType\030\001 \001(\t\022\021\n\tbatchSize\030\002 \001(\005\"*\n\030Acti" +
      "onResultPushResponse\022\016\n\006status\030\001 \001(\010\"&\n\006" +
      "Server\022\n\n\002id\030\001 \001(\t\022\020\n\010rpc_addr\030\002 \001(\t\"\023\n\021" +
      "GetServersRequest\".\n\022GetServersResponse\022" +
      "\030\n\007servers\030\001 \003(\0132\007.Server2\360\001\n\rActionServ" +
      "ice\022J\n\024SaveActionDefinition\022\021.ActionDefi" +
      "nition\032\035.ActionDefinitionSaveResponse\"\000\022" +
      "&\n\004Poll\022\022.ActionPollRequest\032\010.Actions\"\000\022" +
      "2\n\004Push\022\r.ActionResult\032\031.ActionResultPus",
      "hResponse\"\000\0227\n\nGetServers\022\022.GetServersRe" +
      "quest\032\023.GetServersResponse\"\000B2\n!io.githu" +
      "b.mohitkumar.orchy.api.v1B\005OrchyP\001\242\002\003ORC" +
      "b\006proto3"
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
    internal_static_Action_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Action_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Action_descriptor,
        new java.lang.String[] { "WorkflowName", "FlowId", "Data", "ActionId", "ActionName", "RetryCount", "Type", });
    internal_static_Action_DataEntry_descriptor =
      internal_static_Action_descriptor.getNestedTypes().get(0);
    internal_static_Action_DataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Action_DataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_Actions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Actions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Actions_descriptor,
        new java.lang.String[] { "Actions", });
    internal_static_ActionResult_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ActionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActionResult_descriptor,
        new java.lang.String[] { "WorkflowName", "ActionName", "FlowId", "ActionId", "Data", "Status", "RetryCount", });
    internal_static_ActionResult_DataEntry_descriptor =
      internal_static_ActionResult_descriptor.getNestedTypes().get(0);
    internal_static_ActionResult_DataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActionResult_DataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_ActionDefinition_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ActionDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActionDefinition_descriptor,
        new java.lang.String[] { "Name", "RetryCount", "RetryAfterSeconds", "RetryPolicy", "TimeoutSeconds", });
    internal_static_ActionDefinitionSaveResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ActionDefinitionSaveResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActionDefinitionSaveResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_ActionPollRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ActionPollRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActionPollRequest_descriptor,
        new java.lang.String[] { "ActionType", "BatchSize", });
    internal_static_ActionResultPushResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ActionResultPushResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActionResultPushResponse_descriptor,
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
