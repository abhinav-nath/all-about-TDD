package com.codecafe.tdd.mockito.basics.sender;

import static com.codecafe.tdd.mockito.basics.model.ArticleType.POLITICS;
import static com.codecafe.tdd.mockito.basics.model.ArticleType.SPORT;
import static java.util.Arrays.asList;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.codecafe.tdd.mockito.basics.client.Channel;
import com.codecafe.tdd.mockito.basics.database.ArticleDataAccess;
import com.codecafe.tdd.mockito.basics.model.Article;

class ArticleDistributorTest {

	@Test
	void sportArticleGoesToSportChannel_PoliticsArticleGoesToPoliticsChannel() {

		Channel sportChannel = mock(Channel.class);
		Channel entertainmentChannel = mock(Channel.class);
		Channel otherChannel = mock(Channel.class);
		ArticleDataAccess dataAccess = mock(ArticleDataAccess.class);

		ArticleDistributor distributor = new ArticleDistributor(sportChannel, entertainmentChannel, otherChannel, dataAccess);

		// given this list of articles is returned from the DB
		List<Article> articles = asList(new Article("Sport is fun", SPORT), new Article("Politics is sad", POLITICS));

		when(dataAccess.getTodaysArticles()).thenReturn(articles);

		// when we distribute
		distributor.distributeTodays();

		// then one goes to SPORT and one goes to other
		verify(sportChannel).accept(any());
		verify(otherChannel).accept(any());
		verify(entertainmentChannel, never()).accept(any());
	}

}