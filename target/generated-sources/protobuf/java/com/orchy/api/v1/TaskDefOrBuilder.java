// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: flow.proto

package com.orchy.api.v1;

public interface TaskDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TaskDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 retryCount = 2;</code>
   */
  int getRetryCount();

  /**
   * <code>int32 retryAfterSeconds = 3;</code>
   */
  int getRetryAfterSeconds();

  /**
   * <code>string retryPolicy = 4;</code>
   */
  java.lang.String getRetryPolicy();
  /**
   * <code>string retryPolicy = 4;</code>
   */
  com.google.protobuf.ByteString
      getRetryPolicyBytes();

  /**
   * <code>int32 timeoutSeconds = 5;</code>
   */
  int getTimeoutSeconds();
}
