package com.codecafe.tdd.mockito.basics.sender;

import com.codecafe.tdd.mockito.basics.client.Channel;
import com.codecafe.tdd.mockito.basics.database.ArticleDataAccess;
import com.codecafe.tdd.mockito.basics.model.Article;

/**
 * Work through today's articles and send them out to the right places
 */
public class ArticleDistributor {

	private Channel sportChannel;
	private Channel entertainmentChannel;
	private Channel otherChannel;
	private ArticleDataAccess dataAccess;

	public ArticleDistributor(Channel sportChannel, Channel entertainmentChannel, Channel otherChannel, ArticleDataAccess dataAccess) {
		this.sportChannel = sportChannel;
		this.entertainmentChannel = entertainmentChannel;
		this.otherChannel = otherChannel;
		this.dataAccess = dataAccess;
	}

	public void distributeTodays() {

		for (Article article : dataAccess.getTodaysArticles()) {

			switch (article.getType()) {
			case SPORT:
				this.sportChannel.accept(article);
				break;
			case ENTERTAINMENT:
				this.entertainmentChannel.accept(article);
				break;
			default:
				this.otherChannel.accept(article);
			}

		}

	}

}