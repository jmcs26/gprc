// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet/greet.proto

package com.proto.greet;

/**
 * Protobuf type {@code greet.Greeting}
 */
public  final class Greeting extends
    com.google.protobuf.GeneratedMessageLite<
        Greeting, Greeting.Builder> implements
    // @@protoc_insertion_point(message_implements:greet.Greeting)
    GreetingOrBuilder {
  private Greeting() {
    firstName_ = "";
    lastName_ = "";
  }
  public static final int FIRST_NAME_FIELD_NUMBER = 1;
  private java.lang.String firstName_;
  /**
   * <code>string first_name = 1;</code>
   * @return The firstName.
   */
  @java.lang.Override
  public java.lang.String getFirstName() {
    return firstName_;
  }
  /**
   * <code>string first_name = 1;</code>
   * @return The bytes for firstName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFirstNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(firstName_);
  }
  /**
   * <code>string first_name = 1;</code>
   * @param value The firstName to set.
   */
  private void setFirstName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    firstName_ = value;
  }
  /**
   * <code>string first_name = 1;</code>
   */
  private void clearFirstName() {
    
    firstName_ = getDefaultInstance().getFirstName();
  }
  /**
   * <code>string first_name = 1;</code>
   * @param value The bytes for firstName to set.
   */
  private void setFirstNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    firstName_ = value.toStringUtf8();
    
  }

  public static final int LAST_NAME_FIELD_NUMBER = 2;
  private java.lang.String lastName_;
  /**
   * <code>string last_name = 2;</code>
   * @return The lastName.
   */
  @java.lang.Override
  public java.lang.String getLastName() {
    return lastName_;
  }
  /**
   * <code>string last_name = 2;</code>
   * @return The bytes for lastName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLastNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(lastName_);
  }
  /**
   * <code>string last_name = 2;</code>
   * @param value The lastName to set.
   */
  private void setLastName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    lastName_ = value;
  }
  /**
   * <code>string last_name = 2;</code>
   */
  private void clearLastName() {
    
    lastName_ = getDefaultInstance().getLastName();
  }
  /**
   * <code>string last_name = 2;</code>
   * @param value The bytes for lastName to set.
   */
  private void setLastNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    lastName_ = value.toStringUtf8();
    
  }

  public static com.proto.greet.Greeting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.greet.Greeting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.greet.Greeting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.greet.Greeting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.greet.Greeting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.greet.Greeting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.greet.Greeting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.greet.Greeting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.greet.Greeting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.greet.Greeting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.greet.Greeting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.greet.Greeting parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.greet.Greeting prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code greet.Greeting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.greet.Greeting, Builder> implements
      // @@protoc_insertion_point(builder_implements:greet.Greeting)
      com.proto.greet.GreetingOrBuilder {
    // Construct using com.proto.greet.Greeting.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string first_name = 1;</code>
     * @return The firstName.
     */
    @java.lang.Override
    public java.lang.String getFirstName() {
      return instance.getFirstName();
    }
    /**
     * <code>string first_name = 1;</code>
     * @return The bytes for firstName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      return instance.getFirstNameBytes();
    }
    /**
     * <code>string first_name = 1;</code>
     * @param value The firstName to set.
     * @return This builder for chaining.
     */
    public Builder setFirstName(
        java.lang.String value) {
      copyOnWrite();
      instance.setFirstName(value);
      return this;
    }
    /**
     * <code>string first_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirstName() {
      copyOnWrite();
      instance.clearFirstName();
      return this;
    }
    /**
     * <code>string first_name = 1;</code>
     * @param value The bytes for firstName to set.
     * @return This builder for chaining.
     */
    public Builder setFirstNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFirstNameBytes(value);
      return this;
    }

    /**
     * <code>string last_name = 2;</code>
     * @return The lastName.
     */
    @java.lang.Override
    public java.lang.String getLastName() {
      return instance.getLastName();
    }
    /**
     * <code>string last_name = 2;</code>
     * @return The bytes for lastName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      return instance.getLastNameBytes();
    }
    /**
     * <code>string last_name = 2;</code>
     * @param value The lastName to set.
     * @return This builder for chaining.
     */
    public Builder setLastName(
        java.lang.String value) {
      copyOnWrite();
      instance.setLastName(value);
      return this;
    }
    /**
     * <code>string last_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastName() {
      copyOnWrite();
      instance.clearLastName();
      return this;
    }
    /**
     * <code>string last_name = 2;</code>
     * @param value The bytes for lastName to set.
     * @return This builder for chaining.
     */
    public Builder setLastNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setLastNameBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:greet.Greeting)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.greet.Greeting();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "firstName_",
            "lastName_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.proto.greet.Greeting> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.greet.Greeting.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.greet.Greeting>(
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


  // @@protoc_insertion_point(class_scope:greet.Greeting)
  private static final com.proto.greet.Greeting DEFAULT_INSTANCE;
  static {
    Greeting defaultInstance = new Greeting();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Greeting.class, defaultInstance);
  }

  public static com.proto.greet.Greeting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Greeting> PARSER;

  public static com.google.protobuf.Parser<Greeting> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

