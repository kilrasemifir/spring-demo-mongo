package fr.kira.formation.mongo.personnes;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personnes")
public class PersonneController {

    private final PersonneService personneService;

    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping
    public List<Personne> findAll() {
        return personneService.findAll();
    }

    @PostMapping
    public Personne save(@RequestBody Personne entity) {
        return personneService.save(entity);
    }

    @GetMapping("{id}")
    public Optional<Personne> findById(@PathVariable String s) {
        return personneService.findById(s);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String s) {
        personneService.deleteById(s);
    }
}
