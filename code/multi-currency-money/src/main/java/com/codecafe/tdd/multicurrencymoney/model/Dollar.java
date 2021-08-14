package com.codecafe.tdd.multicurrencymoney.model;

// Dollar is a "value" object
// meaning it only contains the amount
public class Dollar {

	private int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		return new Dollar(this.amount *= multiplier);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Dollar) {
			if (((Dollar) obj).amount == this.amount)
				return true;
		}

		return false;
	}

}