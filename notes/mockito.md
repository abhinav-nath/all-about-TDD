# Mockito

Mockito simulates the Interfaces for which we haven't received the implementations yet.

We can write unit tests for dummy implementation using Mockito.

```java
Channel sportChannel = mock(Channel.class);
Channel entertainmentChannel = mock(Channel.class);
Channel otherChannel = mock(Channel.class);
ArticleDataAccess dataAccess = mock(ArticleDataAccess.class);
```

`verify()` checks whether sportChannel was called using `any()` channel

```java
verify(sportChannel).accept(any());
verify(otherChannel).accept(any());
verify(entertainmentChannel, never()).accept(any());
```

Instead of calling the `mock()` method to mock objects, we should do like this:

```java
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
	
	...
	...
	...
}
```