package io.github.artemptushkin.example.oop.interfaces;

public class MyController {
	private final CreditCardService creditCardService;

	public MyController(CreditCardService creditCardService) {
		System.out.println("I'm creating MyController based on " + creditCardService.getClass().getSimpleName() + " but I don't really care about the implementation, interface only!");
		this.creditCardService = creditCardService;
	}

	public CreditCard getCreditCard() {
		return creditCardService.getCreditCard(); //polymorphism
	}
}
