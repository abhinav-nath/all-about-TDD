package com.codecafe.tdd.mockito.basics.model;

/**
 * An article a client may be interested in
 */
public class Article {

	private String content;
	private ArticleType type;

	public Article(String content, ArticleType type) {
		this.content = content;
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ArticleType getType() {
		return type;
	}

	public void setType(ArticleType type) {
		this.type = type;
	}

}