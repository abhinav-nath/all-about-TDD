package com.codecafe.tdd.multicurrencymoney.model;

// Rupee is a "value" object
// meaning it only contains the amount
public class Rupee extends Money {

	public Rupee(int amount, String currency) {
		super(amount, currency);
	}

}