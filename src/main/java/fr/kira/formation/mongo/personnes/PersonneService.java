package fr.kira.formation.mongo.personnes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneService {

    private final PersonneRepository personneRepository;

    public PersonneService(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    public List<Personne> findAll() {
        return personneRepository.findAll();
    }

    public Personne save(Personne entity) {
        return personneRepository.save(entity);
    }

    public Optional<Personne> findById(String s) {
        return personneRepository.findById(s);
    }

    public void deleteById(String s) {
        personneRepository.deleteById(s);
    }
}
