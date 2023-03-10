package fr.kira.formation.mongo.personnes;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonneRepository extends MongoRepository<Personne, String> {
}
