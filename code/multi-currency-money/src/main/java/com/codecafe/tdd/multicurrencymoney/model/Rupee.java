package com.codecafe.tdd.multicurrencymoney.model;

// Rupee is a "value" object
// meaning it only contains the amount
public class Rupee extends Money {

	public Rupee(int amount) {
		this.amount = amount;
	}

	public Money times(int multiplier) {
		return new Rupee(this.amount *= multiplier);
	}

}