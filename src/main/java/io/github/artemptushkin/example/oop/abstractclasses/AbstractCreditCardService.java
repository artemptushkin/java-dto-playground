package io.github.artemptushkin.example.oop.abstractclasses;

import io.github.artemptushkin.example.oop.interfaces.CreditCard;

public abstract class AbstractCreditCardService implements CreditCardService { //abstraction. this class can have only the definition of the properties (abstract) and not the implementation
	private final AuthService authService; //encapsulation, we have control over the field, and it belongs in this class only. We can either expose it with getter or not

	protected AbstractCreditCardService(AuthService authService) {
		this.authService = authService;
	}

	@Override
	public final CreditCard getCreditCard() { //making this 'final' we prevent it to be overridden in the child class. see that this wasn't final in the interface
		System.out.println("Calling auth from the abstract class before accessing the card...");
		authService.auth();
		System.out.println("calling doGetCreditCard that depends on the implementation: " + this.getClass().getSimpleName());
		return doGetCreditCard();
	}

	protected abstract CreditCard doGetCreditCard(); //abstraction. This is an abstract property
}
