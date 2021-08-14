package com.codecafe.tdd.multicurrencymoney.model;

public abstract class Money {

	protected int amount;

	public abstract Money times(int multiplier);

	// factory methods - start
	public static Money dollar(int amount) {
		return new Dollar(amount);
	}

	public static Money rupee(int amount) {
		return new Rupee(amount);
	}
	// factory methods - end

	@Override
	public boolean equals(Object obj) {
		return getClass().equals(obj.getClass()) && this.amount == ((Money) obj).amount;
	}

}