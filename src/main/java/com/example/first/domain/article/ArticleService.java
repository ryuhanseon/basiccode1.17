package com.example.first.domain.article;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {
private  final ArticleRepository articleRepository;

public void create(String subject,String content){
    Article article=  Article.builder()
            .subject(subject)
            .content(content)
            .build();

    this.articleRepository.save(article);
}

}
