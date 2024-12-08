package ma.projet.grpc.controllers;


import java.util.stream.Collectors;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import ma.projet.grpc.services.CompteService;
import ma.projet.grpc.stubs.Compte;
import ma.projet.grpc.stubs.CompteServiceGrpc;
import ma.projet.grpc.stubs.DeleteCompteByIdRequest;
import ma.projet.grpc.stubs.GetAllComptesRequest;
import ma.projet.grpc.stubs.GetAllComptesResponse;
import ma.projet.grpc.stubs.GetCompteByTypeRequest;
import ma.projet.grpc.stubs.GetCompteByTypeResponse;
import ma.projet.grpc.stubs.SaveCompteRequest;
import ma.projet.grpc.stubs.SaveCompteResponse;
import ma.projet.grpc.stubs.TypeCompte;
import ma.projet.grpc.stubs.UpdateCompteRequest;
import ma.projet.grpc.stubs.UpdateCompteResponse;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CompteServiceImpl extends CompteServiceGrpc.CompteServiceImplBase {

    private final CompteService compteService;

    public CompteServiceImpl(CompteService compteService) {
        this.compteService = compteService;
    }

    @Override
    public void allComptes(GetAllComptesRequest request, StreamObserver<GetAllComptesResponse> responseObserver) {
        GetAllComptesResponse.Builder responseBuilder = GetAllComptesResponse.newBuilder();
        var comptes = compteService.findAllComptes().stream()
                .map(compte -> Compte.newBuilder()
                        .setId(compte.getId())
                        .setSolde(compte.getSolde())
                        .setDateCreation(compte.getDateCreation())
                        .setType(TypeCompte.valueOf(compte.getType()))
                        .build())
                .collect(Collectors.toList());
        responseObserver.onNext(responseBuilder.addAllComptes(comptes).build());
        responseObserver.onCompleted();
    }

    // @Override
    // public void compteById(GetCompteByIdRequest request, StreamObserver<GetCompteByIdResponse> responseObserver) {
    //     Compte compte = compteDB.get(request.getId());
    //     if (compte != null) {
    //         responseObserver.onNext(GetCompteByIdResponse.newBuilder().setCompte(compte).build());
    //     } else {
    //         responseObserver.onError(new Throwable("Compte non trouvé"));
    //     }
    //     responseObserver.onCompleted();
    // }

    // @Override
    // public void totalSolde(GetTotalSoldeRequest request, StreamObserver<GetTotalSoldeResponse> responseObserver) {
    //     int count = compteDB.size();
    //     float sum = 0;
    //     for (Compte compte : compteDB.values()) {
    //         sum += compte.getSolde();
    //     }
    //     float average = count > 0 ? sum / count : 0;

    //     SoldeStats stats = SoldeStats.newBuilder()
    //             .setCount(count)
    //             .setSum(sum)
    //             .setAverage(average)
    //             .build();

    //     responseObserver.onNext(GetTotalSoldeResponse.newBuilder().setStats(stats).build());
    //     responseObserver.onCompleted();
    // }

    @Override
    public void saveCompte(SaveCompteRequest request, StreamObserver<SaveCompteResponse> responseObserver) {
        var comptesReq = request.getCompte();
        var compte = new ma.projet.grpc.entities.Compte();
        compte.setSolde(comptesReq.getSolde());
        compte.setDateCreation(comptesReq.getDateCreation());
        compte.setType(comptesReq.getType().name());

        var savedCompte = compteService.saveCompte(compte);
        var grpcCompte = Compte.newBuilder()
                .setId(savedCompte.getId())
                .setSolde(savedCompte.getSolde())
                .setDateCreation(savedCompte.getDateCreation())
                .setType(TypeCompte.valueOf(savedCompte.getType()))
                .build();
        
        responseObserver.onNext(SaveCompteResponse.newBuilder().setCompte(grpcCompte).build());
        responseObserver.onCompleted();
    }
    
    @Override
    public void deleteCompte(DeleteCompteByIdRequest request, StreamObserver<com.google.protobuf.Empty> responseObserver) {
        compteService.deleteCompte(request.getId());
        responseObserver.onNext(com.google.protobuf.Empty.newBuilder().build());
    }

    @Override
    public void updateCompte(UpdateCompteRequest request, StreamObserver<UpdateCompteResponse> responseObserver) {
        var comptesReq = request.getCompte();
        var compte = new ma.projet.grpc.entities.Compte();
        compte.setSolde(comptesReq.getSolde());
        compte.setDateCreation(comptesReq.getDateCreation());
        compte.setType(comptesReq.getType().name());

        var updatedCompte = compteService.updateCompte(request.getId(), compte);
        var grpcCompte = Compte.newBuilder()
                .setId(updatedCompte.getId())
                .setSolde(updatedCompte.getSolde())
                .setDateCreation(updatedCompte.getDateCreation())
                .setType(TypeCompte.valueOf(updatedCompte.getType()))
                .build();
        
        responseObserver.onNext(UpdateCompteResponse.newBuilder().setCompte(grpcCompte).build());
    }

    @Override
    public void compteByType(GetCompteByTypeRequest request, StreamObserver<GetCompteByTypeResponse> responseObserver) {
        GetCompteByTypeResponse.Builder responseBuilder = GetCompteByTypeResponse.newBuilder();
        var comptes = compteService.findComptesByType(request.getType().name()).stream()
                .map(compte -> Compte.newBuilder()
                        .setId(compte.getId())
                        .setSolde(compte.getSolde())
                        .setDateCreation(compte.getDateCreation())
                        .setType(TypeCompte.valueOf(compte.getType()))
                        .build())
                .collect(Collectors.toList());
        responseObserver.onNext(responseBuilder.addAllComptes(comptes).build());
        responseObserver.onCompleted();
    }

}