// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_service.proto

package com.github.grpc.pcbook.pb;

public final class LaptopServiceOuterClass {
  private LaptopServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcpcbook_CreateLaptopRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcpcbook_CreateLaptopRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpcpcbook_CreateLaptopResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpcpcbook_CreateLaptopResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024laptop_service.proto\022\ngrpcpcbook\032\024lapt" +
      "op_message.proto\"9\n\023CreateLaptopRequest\022" +
      "\"\n\006laptop\030\001 \001(\0132\022.grpcpcbook.Laptop\"\"\n\024C" +
      "reateLaptopResponse\022\n\n\002id\030\001 \001(\t2d\n\rLapto" +
      "pService\022S\n\014CreateLaptop\022\037.grpcpcbook.Cr" +
      "eateLaptopRequest\032 .grpcpcbook.CreateLap" +
      "topResponse\"\000B#\n\031com.github.grpc.pcbook." +
      "pbP\001Z\004./pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.github.grpc.pcbook.pb.LaptopMessage.getDescriptor(),
        });
    internal_static_grpcpcbook_CreateLaptopRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpcpcbook_CreateLaptopRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcpcbook_CreateLaptopRequest_descriptor,
        new java.lang.String[] { "Laptop", });
    internal_static_grpcpcbook_CreateLaptopResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpcpcbook_CreateLaptopResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpcpcbook_CreateLaptopResponse_descriptor,
        new java.lang.String[] { "Id", });
    com.github.grpc.pcbook.pb.LaptopMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}