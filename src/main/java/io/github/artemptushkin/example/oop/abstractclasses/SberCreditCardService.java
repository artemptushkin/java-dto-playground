package io.github.artemptushkin.example.oop.abstractclasses;

import io.github.artemptushkin.example.oop.interfaces.CreditCard;

public class SberCreditCardService extends AbstractCreditCardService {

	public SberCreditCardService(AuthService authService) {
		super(authService);
	}

	@Override
	protected CreditCard doGetCreditCard() {
		System.out.println("Returning Sber credit card");
		return new CreditCard();
	}
}
