package com.codecafe.tdd.multicurrencymoney.model;

public class Money {

	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public String currency() {
		return this.currency;
	}

	public Money times(int multiplier) {
		return new Money(this.amount *= multiplier, this.currency);
	}

	// factory methods - start
	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money rupee(int amount) {
		return new Money(amount, "INR");
	}
	// factory methods - end

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Money) {
			if (this.amount == ((Money) obj).amount && this.currency == ((Money) obj).currency)
				return true;
		}

		return false;
	}

}