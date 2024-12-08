package ma.projet.grpc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.repositories.CompteRepository;

@Service
public class CompteService {
    private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public List<Compte> findAllComptes() {
        return compteRepository.findAll();
    }

    public Compte findCompteById(String id) {
        return compteRepository.findById(id).orElse(null);
    }

    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }
    
    public void deleteCompte(String id) {
        compteRepository.deleteById(id);
    }

    public Compte updateCompte(String id, Compte compte) {
        Compte existingCompte = compteRepository.findById(id).orElse(null);
        if (existingCompte != null) {
            existingCompte.setSolde(compte.getSolde());
            existingCompte.setDateCreation(compte.getDateCreation());
            existingCompte.setType(compte.getType());
            return compteRepository.save(existingCompte);
        }
        return null;
    }

    public List<Compte> findComptesByType(String type) {
        return compteRepository.findByType(type);
    }
}
