package com.codecafe.tdd.multicurrencymoney.model;

// Dollar is a "value" object
// meaning it only contains the amount
public class Dollar extends Money {

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Money times(int multiplier) {
		return new Dollar(this.amount *= multiplier);
	}

}