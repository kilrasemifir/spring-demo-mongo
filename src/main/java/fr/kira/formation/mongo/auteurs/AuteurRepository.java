package fr.kira.formation.mongo.auteurs;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface AuteurRepository extends MongoRepository<Auteur, String> {

    List<Auteur> findAllByAuteurIsTrue();
    Optional<Auteur> findByIdAndAuteurIsTrue(String id);

}
