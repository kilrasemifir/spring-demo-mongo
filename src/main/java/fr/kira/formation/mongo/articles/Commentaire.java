package fr.kira.formation.mongo.articles;

import lombok.Data;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;

@Data
public class Commentaire {
    private String id = ObjectId.get().toHexString();
    private String titre;
    private String contenu;
    private LocalDateTime dateCreation = LocalDateTime.now();
}
