package io.github.artemptushkin.example.oop.interfaces;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AlfaBankCreditCardService implements CreditCardService {

	@Override
	public CreditCard getCreditCard() {
		System.out.println("Returning Alfa credit card");
		return new CreditCard();
	}

	@Override //inheritance is here
	public String hello() {
		return "[IMPLEMENTATION] Hello from Alfa Bank";
	}

	/**
	 * method belongs to the implementation only, i.e. not overridden
	 */
	public void getMortgage() {
		System.out.println("Ипотека от альфабанка");
	}
}
