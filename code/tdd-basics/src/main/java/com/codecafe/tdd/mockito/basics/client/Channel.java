package com.codecafe.tdd.mockito.basics.client;

import com.codecafe.tdd.mockito.basics.model.Article;

/*
 * A target for relevant articles
 */

public interface Channel {

	/**
	 * Call this to send an article to its destination
	 * 
	 * @param article the article to send
	 */
	public void accept(Article article);

}