package fr.kira.formation.mongo.auteurs;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurService {

    private final AuteurRepository auteurRepository;

    public AuteurService(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }

    public Auteur save(Auteur entity) {
        return auteurRepository.save(entity);
    }

    public Auteur findById(String s) {
        return auteurRepository.findByIdAndAuteurIsTrue(s).orElse(null);
    }

    public void deleteById(String s) {
        auteurRepository.deleteById(s);
    }

    public List<Auteur> findAll() {
        return auteurRepository.findAllByAuteurIsTrue();
    }
}
