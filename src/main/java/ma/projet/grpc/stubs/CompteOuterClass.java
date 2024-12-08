// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compte.proto

package ma.projet.grpc.stubs;

public final class CompteOuterClass {
  private CompteOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Compte_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Compte_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CompteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CompteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SoldeStats_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SoldeStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllComptesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllComptesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllComptesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllComptesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetCompteByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetCompteByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetCompteByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetCompteByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetCompteByTypeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetCompteByTypeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetCompteByTypeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetCompteByTypeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteCompteByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteCompteByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteCompteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteCompteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetTotalSoldeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetTotalSoldeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetTotalSoldeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetTotalSoldeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveCompteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveCompteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveCompteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveCompteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateCompteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateCompteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateCompteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateCompteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014compte.proto\032\033google/protobuf/empty.pr" +
      "oto\"T\n\006Compte\022\n\n\002id\030\001 \001(\t\022\r\n\005solde\030\002 \001(\002" +
      "\022\024\n\014dateCreation\030\003 \001(\t\022\031\n\004type\030\004 \001(\0162\013.T" +
      "ypeCompte\"O\n\rCompteRequest\022\r\n\005solde\030\001 \001(" +
      "\002\022\024\n\014dateCreation\030\002 \001(\t\022\031\n\004type\030\003 \001(\0162\013." +
      "TypeCompte\"9\n\nSoldeStats\022\r\n\005count\030\001 \001(\005\022" +
      "\013\n\003sum\030\002 \001(\002\022\017\n\007average\030\003 \001(\002\"\026\n\024GetAllC" +
      "omptesRequest\"1\n\025GetAllComptesResponse\022\030" +
      "\n\007comptes\030\001 \003(\0132\007.Compte\"\"\n\024GetCompteByI" +
      "dRequest\022\n\n\002id\030\001 \001(\t\"0\n\025GetCompteByIdRes" +
      "ponse\022\027\n\006compte\030\001 \001(\0132\007.Compte\"3\n\026GetCom" +
      "pteByTypeRequest\022\031\n\004type\030\001 \001(\0162\013.TypeCom" +
      "pte\"3\n\027GetCompteByTypeResponse\022\030\n\007compte" +
      "s\030\001 \003(\0132\007.Compte\"%\n\027DeleteCompteByIdRequ" +
      "est\022\n\n\002id\030\001 \001(\t\"=\n\024DeleteCompteResponse\022" +
      "%\n\005empty\030\001 \001(\0132\026.google.protobuf.Empty\"\026" +
      "\n\024GetTotalSoldeRequest\"3\n\025GetTotalSoldeR" +
      "esponse\022\032\n\005stats\030\001 \001(\0132\013.SoldeStats\"3\n\021S" +
      "aveCompteRequest\022\036\n\006compte\030\001 \001(\0132\016.Compt" +
      "eRequest\"-\n\022SaveCompteResponse\022\027\n\006compte" +
      "\030\001 \001(\0132\007.Compte\"A\n\023UpdateCompteRequest\022\n" +
      "\n\002id\030\001 \001(\t\022\036\n\006compte\030\002 \001(\0132\016.CompteReque" +
      "st\"/\n\024UpdateCompteResponse\022\027\n\006compte\030\001 \001" +
      "(\0132\007.Compte*&\n\nTypeCompte\022\013\n\007COURANT\020\000\022\013" +
      "\n\007EPARGNE\020\0012\277\003\n\rCompteService\022;\n\nAllComp" +
      "tes\022\025.GetAllComptesRequest\032\026.GetAllCompt" +
      "esResponse\022;\n\nCompteById\022\025.GetCompteById" +
      "Request\032\026.GetCompteByIdResponse\022;\n\nTotal" +
      "Solde\022\025.GetTotalSoldeRequest\032\026.GetTotalS" +
      "oldeResponse\0225\n\nSaveCompte\022\022.SaveCompteR" +
      "equest\032\023.SaveCompteResponse\022@\n\014DeleteCom" +
      "pte\022\030.DeleteCompteByIdRequest\032\026.google.p" +
      "rotobuf.Empty\022A\n\014CompteByType\022\027.GetCompt" +
      "eByTypeRequest\032\030.GetCompteByTypeResponse" +
      "\022;\n\014UpdateCompte\022\024.UpdateCompteRequest\032\025" +
      ".UpdateCompteResponseB\030\n\024ma.projet.grpc." +
      "stubsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_Compte_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Compte_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Compte_descriptor,
        new java.lang.String[] { "Id", "Solde", "DateCreation", "Type", });
    internal_static_CompteRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CompteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CompteRequest_descriptor,
        new java.lang.String[] { "Solde", "DateCreation", "Type", });
    internal_static_SoldeStats_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SoldeStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SoldeStats_descriptor,
        new java.lang.String[] { "Count", "Sum", "Average", });
    internal_static_GetAllComptesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetAllComptesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllComptesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_GetAllComptesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_GetAllComptesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllComptesResponse_descriptor,
        new java.lang.String[] { "Comptes", });
    internal_static_GetCompteByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_GetCompteByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetCompteByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_GetCompteByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_GetCompteByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetCompteByIdResponse_descriptor,
        new java.lang.String[] { "Compte", });
    internal_static_GetCompteByTypeRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_GetCompteByTypeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetCompteByTypeRequest_descriptor,
        new java.lang.String[] { "Type", });
    internal_static_GetCompteByTypeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_GetCompteByTypeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetCompteByTypeResponse_descriptor,
        new java.lang.String[] { "Comptes", });
    internal_static_DeleteCompteByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_DeleteCompteByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteCompteByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_DeleteCompteResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_DeleteCompteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteCompteResponse_descriptor,
        new java.lang.String[] { "Empty", });
    internal_static_GetTotalSoldeRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_GetTotalSoldeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetTotalSoldeRequest_descriptor,
        new java.lang.String[] { });
    internal_static_GetTotalSoldeResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_GetTotalSoldeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetTotalSoldeResponse_descriptor,
        new java.lang.String[] { "Stats", });
    internal_static_SaveCompteRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_SaveCompteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveCompteRequest_descriptor,
        new java.lang.String[] { "Compte", });
    internal_static_SaveCompteResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_SaveCompteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveCompteResponse_descriptor,
        new java.lang.String[] { "Compte", });
    internal_static_UpdateCompteRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_UpdateCompteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateCompteRequest_descriptor,
        new java.lang.String[] { "Id", "Compte", });
    internal_static_UpdateCompteResponse_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_UpdateCompteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateCompteResponse_descriptor,
        new java.lang.String[] { "Compte", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}