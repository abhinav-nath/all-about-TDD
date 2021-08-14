package com.codecafe.tdd.multicurrencymoney;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.codecafe.tdd.multicurrencymoney.model.Dollar;
import com.codecafe.tdd.multicurrencymoney.model.Rupee;

public class MoneyTest {

	@Test
	void testDollarMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(new Dollar(10), product);

		Dollar three = new Dollar(3);
		product = three.times(10);
		assertEquals(new Dollar(30), product);
	}

	@Test
	void testDollarEquality() {
		assertEquals(new Dollar(5), new Dollar(5));
		assertNotEquals(new Dollar(10), new Dollar(20));
	}

	@Test
	void testRupeeMultiplication() {
		Rupee five = new Rupee(5);
		Rupee product = five.times(2);
		assertEquals(new Rupee(10), product);

		Rupee three = new Rupee(3);
		product = three.times(10);
		assertEquals(new Rupee(30), product);
	}

}