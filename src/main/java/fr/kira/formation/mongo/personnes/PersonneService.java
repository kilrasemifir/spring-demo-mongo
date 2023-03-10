package fr.kira.formation.mongo.personnes;

import fr.kira.formation.mongo.utils.CRUDService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonneService extends CRUDService<Personne> {
    public PersonneService(PersonneRepository personneRepository) {
        super(personneRepository);
    }
}
