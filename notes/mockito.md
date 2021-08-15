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