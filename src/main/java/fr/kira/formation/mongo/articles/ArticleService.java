package fr.kira.formation.mongo.articles;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Article save(Article article) {
        article.setDateCreation(LocalDateTime.now());
        return articleRepository.save(article);
    }

    public Article findById(String id) {
        return articleRepository.findById(id).orElseThrow();
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    public void deleteById(String id) {
        articleRepository.deleteById(id);
    }
}
