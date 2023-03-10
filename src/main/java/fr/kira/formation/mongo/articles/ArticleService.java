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

}
