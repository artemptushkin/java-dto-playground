package io.github.artemptushkin.example.oop.interfaces;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SberCreditCardService implements CreditCardService {

	@Override
	public CreditCard getCreditCard() {
		System.out.println("Returning Sber credit card");
		return new CreditCard();
	}
}
