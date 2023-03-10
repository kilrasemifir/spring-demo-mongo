package fr.kira.formation.mongo.articles;

import fr.kira.formation.mongo.personnes.Personne;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Représente un article de blog avec ses commentaires.
 * Un article est un document MongoDB de la collection "articles".
 */
@Data
@Document // Annotation pour dire a spring que c'est une entité MongoDB
public class Article {
    /**
     * Id de l'article.
     */
    @Id
    private String id;
    /**
     * Titre de l'article.
     */
    private String titre;
    /**
     * Contenu de l'article.
     */
    private String contenu;
    /**
     * Date de création de l'article.
     */
    private LocalDateTime dateCreation;
    /**
     * Liste des auteurs de l'article.
     * On utilise l'annotation @DBRef pour dire a Spring que c'est une référence vers un autre document.
     */
    @DBRef
    private List<Personne> auteurs = new ArrayList<>();
    /**
     * Liste des commentaires de l'article.
     */
    private List<Commentaire> commentaires = new ArrayList<>();
}
