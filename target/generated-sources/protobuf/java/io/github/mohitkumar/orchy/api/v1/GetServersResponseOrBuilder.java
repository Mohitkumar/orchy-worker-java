// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: flow.proto

package io.github.mohitkumar.orchy.api.v1;

public interface GetServersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetServersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Server servers = 1;</code>
   */
  java.util.List<io.github.mohitkumar.orchy.api.v1.Server> 
      getServersList();
  /**
   * <code>repeated .Server servers = 1;</code>
   */
  io.github.mohitkumar.orchy.api.v1.Server getServers(int index);
  /**
   * <code>repeated .Server servers = 1;</code>
   */
  int getServersCount();
  /**
   * <code>repeated .Server servers = 1;</code>
   */
  java.util.List<? extends io.github.mohitkumar.orchy.api.v1.ServerOrBuilder> 
      getServersOrBuilderList();
  /**
   * <code>repeated .Server servers = 1;</code>
   */
  io.github.mohitkumar.orchy.api.v1.ServerOrBuilder getServersOrBuilder(
      int index);
}