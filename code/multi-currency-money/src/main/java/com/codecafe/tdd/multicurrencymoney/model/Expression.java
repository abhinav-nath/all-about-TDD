package com.codecafe.tdd.multicurrencymoney.model;

// Augend - first value in an addition operation. The 3 in 3 + 6.
// Addend - second value in an addition operation. The 6 in 3 + 6.
public interface Expression {

	public Money reduce(String toCurrency);

}