// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet/greet.proto

package com.proto.greet;

/**
 * Protobuf type {@code greet.GreetRequest}
 */
public  final class GreetRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GreetRequest, GreetRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:greet.GreetRequest)
    GreetRequestOrBuilder {
  private GreetRequest() {
  }
  public static final int GREETING_FIELD_NUMBER = 1;
  private com.proto.greet.Greeting greeting_;
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  @java.lang.Override
  public boolean hasGreeting() {
    return greeting_ != null;
  }
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  @java.lang.Override
  public com.proto.greet.Greeting getGreeting() {
    return greeting_ == null ? com.proto.greet.Greeting.getDefaultInstance() : greeting_;
  }
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  private void setGreeting(com.proto.greet.Greeting value) {
    value.getClass();
  greeting_ = value;
    
    }
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeGreeting(com.proto.greet.Greeting value) {
    value.getClass();
  if (greeting_ != null &&
        greeting_ != com.proto.greet.Greeting.getDefaultInstance()) {
      greeting_ =
        com.proto.greet.Greeting.newBuilder(greeting_).mergeFrom(value).buildPartial();
    } else {
      greeting_ = value;
    }
    
  }
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  private void clearGreeting() {  greeting_ = null;
    
  }

  public static com.proto.greet.GreetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.greet.GreetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.greet.GreetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.greet.GreetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.greet.GreetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.greet.GreetRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.greet.GreetRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code greet.GreetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.greet.GreetRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:greet.GreetRequest)
      com.proto.greet.GreetRequestOrBuilder {
    // Construct using com.proto.greet.GreetRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    @java.lang.Override
    public boolean hasGreeting() {
      return instance.hasGreeting();
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    @java.lang.Override
    public com.proto.greet.Greeting getGreeting() {
      return instance.getGreeting();
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder setGreeting(com.proto.greet.Greeting value) {
      copyOnWrite();
      instance.setGreeting(value);
      return this;
      }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder setGreeting(
        com.proto.greet.Greeting.Builder builderForValue) {
      copyOnWrite();
      instance.setGreeting(builderForValue.build());
      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder mergeGreeting(com.proto.greet.Greeting value) {
      copyOnWrite();
      instance.mergeGreeting(value);
      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder clearGreeting() {  copyOnWrite();
      instance.clearGreeting();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:greet.GreetRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.greet.GreetRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "greeting_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.proto.greet.GreetRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.greet.GreetRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.greet.GreetRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:greet.GreetRequest)
  private static final com.proto.greet.GreetRequest DEFAULT_INSTANCE;
  static {
    GreetRequest defaultInstance = new GreetRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GreetRequest.class, defaultInstance);
  }

  public static com.proto.greet.GreetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GreetRequest> PARSER;

  public static com.google.protobuf.Parser<GreetRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

