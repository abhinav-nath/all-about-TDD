package com.codecafe.tdd.multicurrencymoney.model;

public class Sum implements Expression {

	public Money augend;
	public Money addend;

	public Sum(Money augend, Money addend) {
		this.augend = augend;
		this.addend = addend;
	}
	
	public Money reduce(String toCurrency) {
		int amount = augend.amount + addend.amount;
		return new Money(amount, toCurrency);
	}

}