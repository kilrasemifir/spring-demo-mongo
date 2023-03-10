package fr.kira.formation.mongo.articles;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping
    public Article save(@RequestBody Article article) {
        return articleService.save(article);
    }

    @GetMapping("{id}")
    public Article findById(@PathVariable String id) {
        return articleService.findById(id);
    }

    @GetMapping
    public List<Article> findAll() {
        return articleService.findAll();
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        articleService.deleteById(id);
    }
}
