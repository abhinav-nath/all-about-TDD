package com.codecafe.tdd.multicurrencymoney.model;

public abstract class Money {

	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public String currency() {
		return this.currency;
	}

	public abstract Money times(int multiplier);

	// factory methods - start
	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public static Money rupee(int amount) {
		return new Rupee(amount, "INR");
	}
	// factory methods - end

	@Override
	public boolean equals(Object obj) {
		return getClass().equals(obj.getClass()) && this.amount == ((Money) obj).amount;
	}

}