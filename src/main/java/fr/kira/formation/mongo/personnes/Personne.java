package fr.kira.formation.mongo.personnes;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Data
@Document(collection = "personnes")
public class Personne {
    @Id
    private String id;
    private String nom;
    private String prenom;
    /**
     * Pour stocker des informations supplémentaires.
     */
    private Map<String, Object> infos = new HashMap<>();
}
