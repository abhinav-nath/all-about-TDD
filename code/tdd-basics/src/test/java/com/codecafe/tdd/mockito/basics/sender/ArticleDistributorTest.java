package com.codecafe.tdd.mockito.basics.sender;

import static com.codecafe.tdd.mockito.basics.model.ArticleType.POLITICS;
import static com.codecafe.tdd.mockito.basics.model.ArticleType.SPORTS;
import static java.util.Arrays.asList;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.codecafe.tdd.mockito.basics.client.EntertainmentChannel;
import com.codecafe.tdd.mockito.basics.client.OtherChannel;
import com.codecafe.tdd.mockito.basics.client.SportsChannel;
import com.codecafe.tdd.mockito.basics.database.ArticleDataAccess;
import com.codecafe.tdd.mockito.basics.model.Article;

@ExtendWith(MockitoExtension.class)
class ArticleDistributorTest {

	@Mock
	private SportsChannel sportsChannel;

	@Mock
	private EntertainmentChannel entertainmentChannel;

	@Mock
	private OtherChannel otherChannel;

	@Mock
	private ArticleDataAccess dataAccess;

	@InjectMocks
	private ArticleDistributor distributor;

	@Test
	public void sportArticleGoesToSportChannel_PoliticsArticleGoesToPoliticsChannel() {

		// given this list of articles is returned from the DB
		List<Article> articles = asList(new Article("Sports is fun", SPORTS), new Article("Politics is sad", POLITICS));

		when(dataAccess.getTodaysArticles()).thenReturn(articles);

		// when we distribute
		distributor.distributeTodays();

		// then one goes to SPORT and one goes to other
		verify(sportsChannel).accept(any());
		verify(otherChannel).accept(any());
		verify(entertainmentChannel, never()).accept(any());
	}

}