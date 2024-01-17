package com.example.first.domain.article;

import com.example.first.domain.article.Article;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Id> {
}
