package com.codecafe.tdd.multicurrencymoney.model;

// Rupee is a "value" object
// meaning it only contains the amount
public class Rupee {

	private int amount;

	public Rupee(int amount) {
		this.amount = amount;
	}

	public Rupee times(int multiplier) {
		return new Rupee(this.amount *= multiplier);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Rupee) {
			if (((Rupee) obj).amount == this.amount)
				return true;
		}

		return false;
	}

}