package io.github.artemptushkin.example.inheritance;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class CreditCard extends Card {
	BigDecimal rate;

	@ConstructorProperties({"name", "status", "balance", "rate"})
	public CreditCard(String name, Status status, Balance balance, BigDecimal rate) {
		super(name, status, balance);
		this.rate = rate;
	}
}
