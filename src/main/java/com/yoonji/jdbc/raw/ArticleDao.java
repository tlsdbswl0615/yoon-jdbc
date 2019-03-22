package com.yoonji.jdbc.raw;

import java.util.List;

public interface ArticleDao {
	/** 목록*/
	List<Article> listArticles();
	/** 조록*/
	Article getArticle(String articleId);
	/** 등*/
	void addArticle(Article article);
	
	void updateArticle(Article article);
	
	void deleteArticle(String articleId);

}
