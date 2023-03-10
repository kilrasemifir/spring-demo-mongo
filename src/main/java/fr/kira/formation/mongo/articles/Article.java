package fr.kira.formation.mongo.articles;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document // Annotation pour dire a spring que c'est une entité MongoDB
public class Article {
    @Id
    private String id;
    private String titre;
    private String contenu;
    private LocalDateTime dateCreation;
    private List<Commentaire> commentaires = new ArrayList<>();
}
