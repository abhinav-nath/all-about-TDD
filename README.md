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