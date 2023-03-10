package fr.kira.formation.mongo.auteurs;

import fr.kira.formation.mongo.utils.CRUDService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurService extends CRUDService<Auteur> {

    public AuteurService(AuteurRepository auteurRepository) {
        super(auteurRepository);
    }
}
