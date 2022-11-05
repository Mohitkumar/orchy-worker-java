// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: flow.proto

package com.orchy.api.v1;

/**
 * Protobuf type {@code TaskDef}
 */
public  final class TaskDef extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TaskDef)
    TaskDefOrBuilder {
  // Use TaskDef.newBuilder() to construct.
  private TaskDef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskDef() {
    name_ = "";
    retryCount_ = 0;
    retryAfterSeconds_ = 0;
    retryPolicy_ = "";
    timeoutSeconds_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TaskDef(
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

            name_ = s;
            break;
          }
          case 16: {

            retryCount_ = input.readInt32();
            break;
          }
          case 24: {

            retryAfterSeconds_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            retryPolicy_ = s;
            break;
          }
          case 40: {

            timeoutSeconds_ = input.readInt32();
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
    return com.orchy.api.v1.Orchy.internal_static_TaskDef_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.orchy.api.v1.Orchy.internal_static_TaskDef_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.orchy.api.v1.TaskDef.class, com.orchy.api.v1.TaskDef.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RETRYCOUNT_FIELD_NUMBER = 2;
  private int retryCount_;
  /**
   * <code>int32 retryCount = 2;</code>
   */
  public int getRetryCount() {
    return retryCount_;
  }

  public static final int RETRYAFTERSECONDS_FIELD_NUMBER = 3;
  private int retryAfterSeconds_;
  /**
   * <code>int32 retryAfterSeconds = 3;</code>
   */
  public int getRetryAfterSeconds() {
    return retryAfterSeconds_;
  }

  public static final int RETRYPOLICY_FIELD_NUMBER = 4;
  private volatile java.lang.Object retryPolicy_;
  /**
   * <code>string retryPolicy = 4;</code>
   */
  public java.lang.String getRetryPolicy() {
    java.lang.Object ref = retryPolicy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      retryPolicy_ = s;
      return s;
    }
  }
  /**
   * <code>string retryPolicy = 4;</code>
   */
  public com.google.protobuf.ByteString
      getRetryPolicyBytes() {
    java.lang.Object ref = retryPolicy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      retryPolicy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMEOUTSECONDS_FIELD_NUMBER = 5;
  private int timeoutSeconds_;
  /**
   * <code>int32 timeoutSeconds = 5;</code>
   */
  public int getTimeoutSeconds() {
    return timeoutSeconds_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (retryCount_ != 0) {
      output.writeInt32(2, retryCount_);
    }
    if (retryAfterSeconds_ != 0) {
      output.writeInt32(3, retryAfterSeconds_);
    }
    if (!getRetryPolicyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, retryPolicy_);
    }
    if (timeoutSeconds_ != 0) {
      output.writeInt32(5, timeoutSeconds_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (retryCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, retryCount_);
    }
    if (retryAfterSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, retryAfterSeconds_);
    }
    if (!getRetryPolicyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, retryPolicy_);
    }
    if (timeoutSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, timeoutSeconds_);
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
    if (!(obj instanceof com.orchy.api.v1.TaskDef)) {
      return super.equals(obj);
    }
    com.orchy.api.v1.TaskDef other = (com.orchy.api.v1.TaskDef) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (getRetryCount()
        == other.getRetryCount());
    result = result && (getRetryAfterSeconds()
        == other.getRetryAfterSeconds());
    result = result && getRetryPolicy()
        .equals(other.getRetryPolicy());
    result = result && (getTimeoutSeconds()
        == other.getTimeoutSeconds());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + RETRYCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getRetryCount();
    hash = (37 * hash) + RETRYAFTERSECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getRetryAfterSeconds();
    hash = (37 * hash) + RETRYPOLICY_FIELD_NUMBER;
    hash = (53 * hash) + getRetryPolicy().hashCode();
    hash = (37 * hash) + TIMEOUTSECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getTimeoutSeconds();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.orchy.api.v1.TaskDef parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.orchy.api.v1.TaskDef parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.orchy.api.v1.TaskDef parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.orchy.api.v1.TaskDef parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.orchy.api.v1.TaskDef parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.orchy.api.v1.TaskDef parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.orchy.api.v1.TaskDef parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.orchy.api.v1.TaskDef parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.orchy.api.v1.TaskDef parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.orchy.api.v1.TaskDef parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.orchy.api.v1.TaskDef parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.orchy.api.v1.TaskDef parseFrom(
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
  public static Builder newBuilder(com.orchy.api.v1.TaskDef prototype) {
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
   * Protobuf type {@code TaskDef}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TaskDef)
      com.orchy.api.v1.TaskDefOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.orchy.api.v1.Orchy.internal_static_TaskDef_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.orchy.api.v1.Orchy.internal_static_TaskDef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.orchy.api.v1.TaskDef.class, com.orchy.api.v1.TaskDef.Builder.class);
    }

    // Construct using com.orchy.api.v1.TaskDef.newBuilder()
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
      name_ = "";

      retryCount_ = 0;

      retryAfterSeconds_ = 0;

      retryPolicy_ = "";

      timeoutSeconds_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.orchy.api.v1.Orchy.internal_static_TaskDef_descriptor;
    }

    public com.orchy.api.v1.TaskDef getDefaultInstanceForType() {
      return com.orchy.api.v1.TaskDef.getDefaultInstance();
    }

    public com.orchy.api.v1.TaskDef build() {
      com.orchy.api.v1.TaskDef result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.orchy.api.v1.TaskDef buildPartial() {
      com.orchy.api.v1.TaskDef result = new com.orchy.api.v1.TaskDef(this);
      result.name_ = name_;
      result.retryCount_ = retryCount_;
      result.retryAfterSeconds_ = retryAfterSeconds_;
      result.retryPolicy_ = retryPolicy_;
      result.timeoutSeconds_ = timeoutSeconds_;
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
      if (other instanceof com.orchy.api.v1.TaskDef) {
        return mergeFrom((com.orchy.api.v1.TaskDef)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.orchy.api.v1.TaskDef other) {
      if (other == com.orchy.api.v1.TaskDef.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getRetryCount() != 0) {
        setRetryCount(other.getRetryCount());
      }
      if (other.getRetryAfterSeconds() != 0) {
        setRetryAfterSeconds(other.getRetryAfterSeconds());
      }
      if (!other.getRetryPolicy().isEmpty()) {
        retryPolicy_ = other.retryPolicy_;
        onChanged();
      }
      if (other.getTimeoutSeconds() != 0) {
        setTimeoutSeconds(other.getTimeoutSeconds());
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
      com.orchy.api.v1.TaskDef parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.orchy.api.v1.TaskDef) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int retryCount_ ;
    /**
     * <code>int32 retryCount = 2;</code>
     */
    public int getRetryCount() {
      return retryCount_;
    }
    /**
     * <code>int32 retryCount = 2;</code>
     */
    public Builder setRetryCount(int value) {
      
      retryCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 retryCount = 2;</code>
     */
    public Builder clearRetryCount() {
      
      retryCount_ = 0;
      onChanged();
      return this;
    }

    private int retryAfterSeconds_ ;
    /**
     * <code>int32 retryAfterSeconds = 3;</code>
     */
    public int getRetryAfterSeconds() {
      return retryAfterSeconds_;
    }
    /**
     * <code>int32 retryAfterSeconds = 3;</code>
     */
    public Builder setRetryAfterSeconds(int value) {
      
      retryAfterSeconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 retryAfterSeconds = 3;</code>
     */
    public Builder clearRetryAfterSeconds() {
      
      retryAfterSeconds_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object retryPolicy_ = "";
    /**
     * <code>string retryPolicy = 4;</code>
     */
    public java.lang.String getRetryPolicy() {
      java.lang.Object ref = retryPolicy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        retryPolicy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string retryPolicy = 4;</code>
     */
    public com.google.protobuf.ByteString
        getRetryPolicyBytes() {
      java.lang.Object ref = retryPolicy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        retryPolicy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string retryPolicy = 4;</code>
     */
    public Builder setRetryPolicy(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      retryPolicy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string retryPolicy = 4;</code>
     */
    public Builder clearRetryPolicy() {
      
      retryPolicy_ = getDefaultInstance().getRetryPolicy();
      onChanged();
      return this;
    }
    /**
     * <code>string retryPolicy = 4;</code>
     */
    public Builder setRetryPolicyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      retryPolicy_ = value;
      onChanged();
      return this;
    }

    private int timeoutSeconds_ ;
    /**
     * <code>int32 timeoutSeconds = 5;</code>
     */
    public int getTimeoutSeconds() {
      return timeoutSeconds_;
    }
    /**
     * <code>int32 timeoutSeconds = 5;</code>
     */
    public Builder setTimeoutSeconds(int value) {
      
      timeoutSeconds_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 timeoutSeconds = 5;</code>
     */
    public Builder clearTimeoutSeconds() {
      
      timeoutSeconds_ = 0;
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


    // @@protoc_insertion_point(builder_scope:TaskDef)
  }

  // @@protoc_insertion_point(class_scope:TaskDef)
  private static final com.orchy.api.v1.TaskDef DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.orchy.api.v1.TaskDef();
  }

  public static com.orchy.api.v1.TaskDef getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskDef>
      PARSER = new com.google.protobuf.AbstractParser<TaskDef>() {
    public TaskDef parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TaskDef(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskDef> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskDef> getParserForType() {
    return PARSER;
  }

  public com.orchy.api.v1.TaskDef getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

