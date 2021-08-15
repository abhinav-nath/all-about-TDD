package com.codecafe.tdd.mockito.basics.sender;

import com.codecafe.tdd.mockito.basics.client.EntertainmentChannel;
import com.codecafe.tdd.mockito.basics.client.OtherChannel;
import com.codecafe.tdd.mockito.basics.client.SportsChannel;
import com.codecafe.tdd.mockito.basics.database.ArticleDataAccess;
import com.codecafe.tdd.mockito.basics.model.Article;

/**
 * Work through today's articles and send them out to the right places
 */
public class ArticleDistributor {

	private SportsChannel sportsChannel;
	private EntertainmentChannel entertainmentChannel;
	private OtherChannel otherChannel;
	private ArticleDataAccess dataAccess;

	public ArticleDistributor(SportsChannel sportsChannel, EntertainmentChannel entertainmentChannel, OtherChannel otherChannel, ArticleDataAccess dataAccess) {
		this.sportsChannel = sportsChannel;
		this.entertainmentChannel = entertainmentChannel;
		this.otherChannel = otherChannel;
		this.dataAccess = dataAccess;
	}

	public void distributeTodays() {

		for (Article article : dataAccess.getTodaysArticles()) {

			switch (article.getType()) {
			case SPORTS:
				this.sportsChannel.accept(article);
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