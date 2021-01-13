package com.example.jwttest.dao;

import com.example.jwttest.entity.Article;

import java.util.List;

public interface ArticleDao {
    public List<Article> selectAll();
}
