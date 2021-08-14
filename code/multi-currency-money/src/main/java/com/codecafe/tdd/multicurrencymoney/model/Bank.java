package com.codecafe.tdd.multicurrencymoney.model;

public class Bank {

	// reduce an operation to a specified currency
	public Money reduce(Expression source, String toCurrency) {
		return source.reduce(toCurrency);
	}

}