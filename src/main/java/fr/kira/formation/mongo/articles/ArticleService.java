package fr.kira.formation.mongo.articles;

import fr.kira.formation.mongo.utils.CRUDService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ArticleService extends CRUDService<Article> {

    public ArticleService(ArticleRepository articleRepository) {
        super(articleRepository);
    }

    /**
     * Ajoute un commentaire à un article.
     * @param id de l'article
     * @param commentaire à ajouter
     * @return le commentaire ajouté.
     */
    public Commentaire postNouveauCommentaire(String id, Commentaire commentaire) {
        Article article = this.findById(id);
        article.getCommentaires().add(commentaire);
        this.save(article);
        return commentaire;
    }
}
