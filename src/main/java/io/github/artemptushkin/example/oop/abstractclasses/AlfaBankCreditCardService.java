package io.github.artemptushkin.example.oop.abstractclasses;

import io.github.artemptushkin.example.oop.interfaces.CreditCard;

public class AlfaBankCreditCardService extends AbstractCreditCardService {

	public AlfaBankCreditCardService(AuthService authService) {
		super(authService);
	}

	@Override
	protected CreditCard doGetCreditCard() {
		System.out.println("Returning Alfa credit card");
		return new CreditCard();
	}
}
