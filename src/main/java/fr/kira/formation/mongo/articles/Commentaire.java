package fr.kira.formation.mongo.articles;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Commentaire {
    private String titre;
    private String contenu;
    private LocalDateTime dateCreation = LocalDateTime.now();
}
