// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: flow.proto

package io.github.mohitkumar.orchy.api.v1;

/**
 * Protobuf type {@code TaskDefSaveResponse}
 */
public  final class TaskDefSaveResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TaskDefSaveResponse)
    TaskDefSaveResponseOrBuilder {
  // Use TaskDefSaveResponse.newBuilder() to construct.
  private TaskDefSaveResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskDefSaveResponse() {
    status_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TaskDefSaveResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            status_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.github.mohitkumar.orchy.api.v1.Orchy.internal_static_TaskDefSaveResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.github.mohitkumar.orchy.api.v1.Orchy.internal_static_TaskDefSaveResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse.class, io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private boolean status_;
  /**
   * <code>bool status = 1;</code>
   */
  public boolean getStatus() {
    return status_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != false) {
      output.writeBool(1, status_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, status_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse)) {
      return super.equals(obj);
    }
    io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse other = (io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse) obj;

    boolean result = true;
    result = result && (getStatus()
        == other.getStatus());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStatus());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code TaskDefSaveResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TaskDefSaveResponse)
      io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.mohitkumar.orchy.api.v1.Orchy.internal_static_TaskDefSaveResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.mohitkumar.orchy.api.v1.Orchy.internal_static_TaskDefSaveResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse.class, io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse.Builder.class);
    }

    // Construct using io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      status_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.github.mohitkumar.orchy.api.v1.Orchy.internal_static_TaskDefSaveResponse_descriptor;
    }

    public io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse getDefaultInstanceForType() {
      return io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse.getDefaultInstance();
    }

    public io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse build() {
      io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse buildPartial() {
      io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse result = new io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse(this);
      result.status_ = status_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse) {
        return mergeFrom((io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse other) {
      if (other == io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse.getDefaultInstance()) return this;
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean status_ ;
    /**
     * <code>bool status = 1;</code>
     */
    public boolean getStatus() {
      return status_;
    }
    /**
     * <code>bool status = 1;</code>
     */
    public Builder setStatus(boolean value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:TaskDefSaveResponse)
  }

  // @@protoc_insertion_point(class_scope:TaskDefSaveResponse)
  private static final io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse();
  }

  public static io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskDefSaveResponse>
      PARSER = new com.google.protobuf.AbstractParser<TaskDefSaveResponse>() {
    public TaskDefSaveResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TaskDefSaveResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskDefSaveResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskDefSaveResponse> getParserForType() {
    return PARSER;
  }

  public io.github.mohitkumar.orchy.api.v1.TaskDefSaveResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
