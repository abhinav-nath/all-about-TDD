package com.codecafe.tdd.multicurrencymoney;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.codecafe.tdd.multicurrencymoney.model.Money;

public class MoneyTest {

	@Test
	void testDollarMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));

		Money three = Money.dollar(3);
		assertEquals(Money.dollar(30), three.times(10));
	}

	@Test
	void testDollarEquality() {
		assertEquals(Money.dollar(5), Money.dollar(5));
		assertNotEquals(Money.dollar(10), Money.dollar(20));
	}

	@Test
	void testDollarAndRupeeEquality() {
		assertNotEquals(Money.dollar(10), Money.rupee(10));
	}

	@Test
	void testRupeeEquality() {
		assertEquals(Money.rupee(5), Money.rupee(5));
		assertNotEquals(Money.rupee(10), Money.rupee(20));
	}

	@Test
	void testRupeeMultiplication() {
		Money five = Money.rupee(5);
		assertEquals(Money.rupee(10), five.times(2));

		Money three = Money.rupee(3);
		assertEquals(Money.rupee(30), three.times(10));
	}

}