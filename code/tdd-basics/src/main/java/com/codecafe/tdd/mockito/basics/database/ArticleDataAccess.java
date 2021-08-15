package com.codecafe.tdd.mockito.basics.database;

import java.util.List;

import com.codecafe.tdd.mockito.basics.model.Article;

public interface ArticleDataAccess {

	/**
	 * @return all the articles from today
	 */
	public List<Article> getTodaysArticles();

}