// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: screen_message.proto

package com.github.grpc.pcbook.pb;

public final class ScreenMessage {
  private ScreenMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcpcbook_Screen_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcpcbook_Screen_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcpcbook_Screen_Resolution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcpcbook_Screen_Resolution_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024screen_message.proto\022\ngrpcpcbook\"\341\001\n\006S" +
      "creen\022\021\n\tsize_inch\030\001 \001(\002\0221\n\nresolution\030\002" +
      " \001(\0132\035.grpcpcbook.Screen.Resolution\022\'\n\005p" +
      "anel\030\003 \001(\0162\030.grpcpcbook.Screen.Panel\022\022\n\n" +
      "multitouch\030\004 \001(\010\032+\n\nResolution\022\r\n\005width\030" +
      "\001 \001(\r\022\016\n\006height\030\002 \001(\004\"\'\n\005Panel\022\013\n\007UNKNOW" +
      "N\020\000\022\007\n\003IPS\020\001\022\010\n\004OLED\020\002B#\n\031com.github.grp" +
      "c.pcbook.pbP\001Z\004./pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_grpcpcbook_Screen_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpcpcbook_Screen_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcpcbook_Screen_descriptor,
        new java.lang.String[] { "SizeInch", "Resolution", "Panel", "Multitouch", });
    internal_static_grpcpcbook_Screen_Resolution_descriptor =
      internal_static_grpcpcbook_Screen_descriptor.getNestedTypes().get(0);
    internal_static_grpcpcbook_Screen_Resolution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcpcbook_Screen_Resolution_descriptor,
        new java.lang.String[] { "Width", "Height", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
