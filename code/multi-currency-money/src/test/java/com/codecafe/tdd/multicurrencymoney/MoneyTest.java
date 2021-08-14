package com.codecafe.tdd.multicurrencymoney;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.codecafe.tdd.multicurrencymoney.model.Bank;
import com.codecafe.tdd.multicurrencymoney.model.Expression;
import com.codecafe.tdd.multicurrencymoney.model.Money;

public class MoneyTest {

	@Test
	void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));

		Money three = Money.dollar(3);
		assertEquals(Money.dollar(30), three.times(10));
	}

	@Test
	void testEquality() {
		assertEquals(Money.dollar(5), Money.dollar(5));
		assertNotEquals(Money.dollar(10), Money.dollar(20));

		assertEquals(Money.rupee(5), Money.rupee(5));
		assertNotEquals(Money.dollar(10), Money.rupee(10));
	}

	@Test
	void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("INR", Money.rupee(1).currency());
	}

	@Test
	void testSimpleAddition() {
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);
	}

}