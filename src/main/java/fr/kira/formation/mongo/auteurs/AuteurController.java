package fr.kira.formation.mongo.auteurs;

import fr.kira.formation.mongo.articles.Commentaire;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auteurs")
public class AuteurController {

    private final AuteurService auteurService;

    public AuteurController(AuteurService auteurService) {
        this.auteurService = auteurService;
    }

    @GetMapping
    public Iterable<Auteur> findAll() {
        return auteurService.findAll();
    }

    @GetMapping("{id}")
    public Auteur findById(@PathVariable String s) {
        return auteurService.findById(s);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String s) {
        auteurService.deleteById(s);
    }

    @PostMapping
    public Auteur save(@RequestBody Auteur entity) {
        return auteurService.save(entity);
    }


}
