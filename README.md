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

## BDD - Given / When / Then

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