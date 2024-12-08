package ma.projet.grpc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.projet.grpc.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String> {
    List<Compte> findByType(String type);
}
