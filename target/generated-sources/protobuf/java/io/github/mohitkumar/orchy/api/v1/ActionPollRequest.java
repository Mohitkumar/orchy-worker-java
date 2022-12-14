// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: flow.proto

package io.github.mohitkumar.orchy.api.v1;

/**
 * Protobuf type {@code ActionPollRequest}
 */
public  final class ActionPollRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ActionPollRequest)
    ActionPollRequestOrBuilder {
  // Use ActionPollRequest.newBuilder() to construct.
  private ActionPollRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ActionPollRequest() {
    actionType_ = "";
    batchSize_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ActionPollRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            actionType_ = s;
            break;
          }
          case 16: {

            batchSize_ = input.readInt32();
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
    return io.github.mohitkumar.orchy.api.v1.Orchy.internal_static_ActionPollRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.github.mohitkumar.orchy.api.v1.Orchy.internal_static_ActionPollRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.github.mohitkumar.orchy.api.v1.ActionPollRequest.class, io.github.mohitkumar.orchy.api.v1.ActionPollRequest.Builder.class);
  }

  public static final int ACTIONTYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object actionType_;
  /**
   * <code>string actionType = 1;</code>
   */
  public java.lang.String getActionType() {
    java.lang.Object ref = actionType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      actionType_ = s;
      return s;
    }
  }
  /**
   * <code>string actionType = 1;</code>
   */
  public com.google.protobuf.ByteString
      getActionTypeBytes() {
    java.lang.Object ref = actionType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      actionType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BATCHSIZE_FIELD_NUMBER = 2;
  private int batchSize_;
  /**
   * <code>int32 batchSize = 2;</code>
   */
  public int getBatchSize() {
    return batchSize_;
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
    if (!getActionTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, actionType_);
    }
    if (batchSize_ != 0) {
      output.writeInt32(2, batchSize_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getActionTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, actionType_);
    }
    if (batchSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, batchSize_);
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
    if (!(obj instanceof io.github.mohitkumar.orchy.api.v1.ActionPollRequest)) {
      return super.equals(obj);
    }
    io.github.mohitkumar.orchy.api.v1.ActionPollRequest other = (io.github.mohitkumar.orchy.api.v1.ActionPollRequest) obj;

    boolean result = true;
    result = result && getActionType()
        .equals(other.getActionType());
    result = result && (getBatchSize()
        == other.getBatchSize());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACTIONTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getActionType().hashCode();
    hash = (37 * hash) + BATCHSIZE_FIELD_NUMBER;
    hash = (53 * hash) + getBatchSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest parseFrom(
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
  public static Builder newBuilder(io.github.mohitkumar.orchy.api.v1.ActionPollRequest prototype) {
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
   * Protobuf type {@code ActionPollRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ActionPollRequest)
      io.github.mohitkumar.orchy.api.v1.ActionPollRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.mohitkumar.orchy.api.v1.Orchy.internal_static_ActionPollRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.mohitkumar.orchy.api.v1.Orchy.internal_static_ActionPollRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.mohitkumar.orchy.api.v1.ActionPollRequest.class, io.github.mohitkumar.orchy.api.v1.ActionPollRequest.Builder.class);
    }

    // Construct using io.github.mohitkumar.orchy.api.v1.ActionPollRequest.newBuilder()
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
      actionType_ = "";

      batchSize_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.github.mohitkumar.orchy.api.v1.Orchy.internal_static_ActionPollRequest_descriptor;
    }

    public io.github.mohitkumar.orchy.api.v1.ActionPollRequest getDefaultInstanceForType() {
      return io.github.mohitkumar.orchy.api.v1.ActionPollRequest.getDefaultInstance();
    }

    public io.github.mohitkumar.orchy.api.v1.ActionPollRequest build() {
      io.github.mohitkumar.orchy.api.v1.ActionPollRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.github.mohitkumar.orchy.api.v1.ActionPollRequest buildPartial() {
      io.github.mohitkumar.orchy.api.v1.ActionPollRequest result = new io.github.mohitkumar.orchy.api.v1.ActionPollRequest(this);
      result.actionType_ = actionType_;
      result.batchSize_ = batchSize_;
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
      if (other instanceof io.github.mohitkumar.orchy.api.v1.ActionPollRequest) {
        return mergeFrom((io.github.mohitkumar.orchy.api.v1.ActionPollRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.github.mohitkumar.orchy.api.v1.ActionPollRequest other) {
      if (other == io.github.mohitkumar.orchy.api.v1.ActionPollRequest.getDefaultInstance()) return this;
      if (!other.getActionType().isEmpty()) {
        actionType_ = other.actionType_;
        onChanged();
      }
      if (other.getBatchSize() != 0) {
        setBatchSize(other.getBatchSize());
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
      io.github.mohitkumar.orchy.api.v1.ActionPollRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.github.mohitkumar.orchy.api.v1.ActionPollRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object actionType_ = "";
    /**
     * <code>string actionType = 1;</code>
     */
    public java.lang.String getActionType() {
      java.lang.Object ref = actionType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        actionType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string actionType = 1;</code>
     */
    public com.google.protobuf.ByteString
        getActionTypeBytes() {
      java.lang.Object ref = actionType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        actionType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string actionType = 1;</code>
     */
    public Builder setActionType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      actionType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string actionType = 1;</code>
     */
    public Builder clearActionType() {
      
      actionType_ = getDefaultInstance().getActionType();
      onChanged();
      return this;
    }
    /**
     * <code>string actionType = 1;</code>
     */
    public Builder setActionTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      actionType_ = value;
      onChanged();
      return this;
    }

    private int batchSize_ ;
    /**
     * <code>int32 batchSize = 2;</code>
     */
    public int getBatchSize() {
      return batchSize_;
    }
    /**
     * <code>int32 batchSize = 2;</code>
     */
    public Builder setBatchSize(int value) {
      
      batchSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 batchSize = 2;</code>
     */
    public Builder clearBatchSize() {
      
      batchSize_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ActionPollRequest)
  }

  // @@protoc_insertion_point(class_scope:ActionPollRequest)
  private static final io.github.mohitkumar.orchy.api.v1.ActionPollRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.github.mohitkumar.orchy.api.v1.ActionPollRequest();
  }

  public static io.github.mohitkumar.orchy.api.v1.ActionPollRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ActionPollRequest>
      PARSER = new com.google.protobuf.AbstractParser<ActionPollRequest>() {
    public ActionPollRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActionPollRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ActionPollRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ActionPollRequest> getParserForType() {
    return PARSER;
  }

  public io.github.mohitkumar.orchy.api.v1.ActionPollRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

