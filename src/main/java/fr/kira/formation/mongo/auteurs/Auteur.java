package fr.kira.formation.mongo.auteurs;

import fr.kira.formation.mongo.personnes.Personne;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "personnes")
public class Auteur extends Personne {

    private String pseudonyme;

}
