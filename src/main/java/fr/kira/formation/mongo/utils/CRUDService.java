package fr.kira.formation.mongo.utils;

import fr.kira.formation.mongo.personnes.Personne;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

/**
 * Classe de base pour les services contenant les méthodes CRUD.
 * @param <T> type du document.
 */
public abstract class CRUDService<T> {

    private final MongoRepository<T, String> repository;

    public CRUDService(MongoRepository<T, String> repository) {
        this.repository = repository;
    }

    /**
     * Sauvegarde le document dans sa collection MongoDB.
     * @param document à sauvegarder
     * @return le document sauvegardé.
     */
    public T save(T document){
        return this.repository.save(document);
    }

    /**
     * Retourne le document correspondant à l'identifiant id.
     * @param id de l'entité à retourner.
     * @return l'entité correspondante à l'id.
     */
    public T findById(String id){
        return this.repository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Document non trouvé")
        );
    }

    /**
     * Retourne la liste de tous les documents de la collection.
     * @return la liste de tous les documents de la collection.
     */
    public List<T> findAll() {
        return this.repository.findAll();
    }

    /**
     * Supprime le document correspondant à l'identifiant id.
     * @param id de l'entité à supprimer.
     */
    public void deleteById(String id) {
        this.repository.deleteById(id);
    }
}
