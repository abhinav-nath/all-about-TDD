# Unit Testing

## TDD - Prepare / Act / Assert

* **Prepare** a basket with an item in it
  ```java
  Basket basket = new Basket(new Item("Apple"));
  ```

* **Act** : Add another item in it
  ```java
  basket.add(new Item("Orange"));
  ```

* **Assert** that the basket has two items
  ```java
  assertEquals(2, basket.getItemCount());
  ```
  
## or [Arrange / Act / Assert](http://wiki.c2.com/?ArrangeActAssert "Arrange Act Assert")

* **Arrange** : Setup your data and any necessary input that your test will use;
* **Act** : Do the actual work that the test will be testing;
* **Assert** : Check that what you expected really happened - or not;

## BDD - [Given / When / Then](https://martinfowler.com/bliki/GivenWhenThen.html "Given When Then")

* **Given** a basket with an item in it
  ```java
     Basket basket = new Basket(new Item("Apple"));
  ```

* **When** I add another item
  ```java
  basket.add(new Item("Orange"));
  ```

* **Then** the basket has two items
  ```java
  assertEquals(2, basket.getItemCount());
  ```

## General Approach of TDD

* Write tests first
* Work in small increments
* Deliberately stub or over simplify
* Grow the code around the tests
* Refactor continuosly to keep it clean and readable

## Benefits of TDD

* Only a tiny problem to solve at a time
* Code so far is always working ...
* ... and protected
* Feedback loop is quicker than running your app
* Easy to experiment
* Code ends up clearer because you are the user
