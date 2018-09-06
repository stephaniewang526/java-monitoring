// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The `GetNotificationChannelVerificationCode` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.GetNotificationChannelVerificationCodeRequest}
 */
public  final class GetNotificationChannelVerificationCodeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)
    GetNotificationChannelVerificationCodeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetNotificationChannelVerificationCodeRequest.newBuilder() to construct.
  private GetNotificationChannelVerificationCodeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetNotificationChannelVerificationCodeRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetNotificationChannelVerificationCodeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (expireTime_ != null) {
              subBuilder = expireTime_.toBuilder();
            }
            expireTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(expireTime_);
              expireTime_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.v3.NotificationServiceProto.internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.NotificationServiceProto.internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.class, com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The notification channel for which a verification code is to be generated
   * and retrieved. This must name a channel that is already verified; if
   * the specified channel is not verified, the request will fail.
   * </pre>
   *
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
   * <pre>
   * The notification channel for which a verification code is to be generated
   * and retrieved. This must name a channel that is already verified; if
   * the specified channel is not verified, the request will fail.
   * </pre>
   *
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

  public static final int EXPIRE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp expireTime_;
  /**
   * <pre>
   * The desired expiration time. If specified, the API will guarantee that
   * the returned code will not be valid after the specified timestamp;
   * however, the API cannot guarantee that the returned code will be
   * valid for at least as long as the requested time (the API puts an upper
   * bound on the amount of time for which a code may be valid). If omitted,
   * a default expiration will be used, which may be less than the max
   * permissible expiration (so specifying an expiration may extend the
   * code's lifetime over omitting an expiration, even though the API does
   * impose an upper limit on the maximum expiration that is permitted).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  public boolean hasExpireTime() {
    return expireTime_ != null;
  }
  /**
   * <pre>
   * The desired expiration time. If specified, the API will guarantee that
   * the returned code will not be valid after the specified timestamp;
   * however, the API cannot guarantee that the returned code will be
   * valid for at least as long as the requested time (the API puts an upper
   * bound on the amount of time for which a code may be valid). If omitted,
   * a default expiration will be used, which may be less than the max
   * permissible expiration (so specifying an expiration may extend the
   * code's lifetime over omitting an expiration, even though the API does
   * impose an upper limit on the maximum expiration that is permitted).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  public com.google.protobuf.Timestamp getExpireTime() {
    return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
  }
  /**
   * <pre>
   * The desired expiration time. If specified, the API will guarantee that
   * the returned code will not be valid after the specified timestamp;
   * however, the API cannot guarantee that the returned code will be
   * valid for at least as long as the requested time (the API puts an upper
   * bound on the amount of time for which a code may be valid). If omitted,
   * a default expiration will be used, which may be less than the max
   * permissible expiration (so specifying an expiration may extend the
   * code's lifetime over omitting an expiration, even though the API does
   * impose an upper limit on the maximum expiration that is permitted).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
    return getExpireTime();
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
    if (expireTime_ != null) {
      output.writeMessage(2, getExpireTime());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (expireTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExpireTime());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest other = (com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (hasExpireTime() == other.hasExpireTime());
    if (hasExpireTime()) {
      result = result && getExpireTime()
          .equals(other.getExpireTime());
    }
    result = result && unknownFields.equals(other.unknownFields);
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
    if (hasExpireTime()) {
      hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpireTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest prototype) {
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
   * <pre>
   * The `GetNotificationChannelVerificationCode` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.GetNotificationChannelVerificationCodeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.NotificationServiceProto.internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.NotificationServiceProto.internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.class, com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.newBuilder()
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

      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.NotificationServiceProto.internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor;
    }

    public com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.getDefaultInstance();
    }

    public com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest build() {
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest buildPartial() {
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest result = new com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest(this);
      result.name_ = name_;
      if (expireTimeBuilder_ == null) {
        result.expireTime_ = expireTime_;
      } else {
        result.expireTime_ = expireTimeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest) {
        return mergeFrom((com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest other) {
      if (other == com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasExpireTime()) {
        mergeExpireTime(other.getExpireTime());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest) e.getUnfinishedMessage();
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
     * <pre>
     * The notification channel for which a verification code is to be generated
     * and retrieved. This must name a channel that is already verified; if
     * the specified channel is not verified, the request will fail.
     * </pre>
     *
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
     * <pre>
     * The notification channel for which a verification code is to be generated
     * and retrieved. This must name a channel that is already verified; if
     * the specified channel is not verified, the request will fail.
     * </pre>
     *
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
     * <pre>
     * The notification channel for which a verification code is to be generated
     * and retrieved. This must name a channel that is already verified; if
     * the specified channel is not verified, the request will fail.
     * </pre>
     *
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
     * <pre>
     * The notification channel for which a verification code is to be generated
     * and retrieved. This must name a channel that is already verified; if
     * the specified channel is not verified, the request will fail.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The notification channel for which a verification code is to be generated
     * and retrieved. This must name a channel that is already verified; if
     * the specified channel is not verified, the request will fail.
     * </pre>
     *
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

    private com.google.protobuf.Timestamp expireTime_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> expireTimeBuilder_;
    /**
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public boolean hasExpireTime() {
      return expireTimeBuilder_ != null || expireTime_ != null;
    }
    /**
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public com.google.protobuf.Timestamp getExpireTime() {
      if (expireTimeBuilder_ == null) {
        return expireTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
      } else {
        return expireTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder setExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expireTime_ = value;
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder setExpireTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expireTimeBuilder_ == null) {
        expireTime_ = builderForValue.build();
        onChanged();
      } else {
        expireTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder mergeExpireTime(com.google.protobuf.Timestamp value) {
      if (expireTimeBuilder_ == null) {
        if (expireTime_ != null) {
          expireTime_ =
            com.google.protobuf.Timestamp.newBuilder(expireTime_).mergeFrom(value).buildPartial();
        } else {
          expireTime_ = value;
        }
        onChanged();
      } else {
        expireTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public Builder clearExpireTime() {
      if (expireTimeBuilder_ == null) {
        expireTime_ = null;
        onChanged();
      } else {
        expireTime_ = null;
        expireTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpireTimeBuilder() {
      
      onChanged();
      return getExpireTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder() {
      if (expireTimeBuilder_ != null) {
        return expireTimeBuilder_.getMessageOrBuilder();
      } else {
        return expireTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : expireTime_;
      }
    }
    /**
     * <pre>
     * The desired expiration time. If specified, the API will guarantee that
     * the returned code will not be valid after the specified timestamp;
     * however, the API cannot guarantee that the returned code will be
     * valid for at least as long as the requested time (the API puts an upper
     * bound on the amount of time for which a code may be valid). If omitted,
     * a default expiration will be used, which may be less than the max
     * permissible expiration (so specifying an expiration may extend the
     * code's lifetime over omitting an expiration, even though the API does
     * impose an upper limit on the maximum expiration that is permitted).
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expire_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getExpireTimeFieldBuilder() {
      if (expireTimeBuilder_ == null) {
        expireTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getExpireTime(),
                getParentForChildren(),
                isClean());
        expireTime_ = null;
      }
      return expireTimeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.GetNotificationChannelVerificationCodeRequest)
  private static final com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest();
  }

  public static com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetNotificationChannelVerificationCodeRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetNotificationChannelVerificationCodeRequest>() {
    public GetNotificationChannelVerificationCodeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetNotificationChannelVerificationCodeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetNotificationChannelVerificationCodeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetNotificationChannelVerificationCodeRequest> getParserForType() {
    return PARSER;
  }

  public com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

