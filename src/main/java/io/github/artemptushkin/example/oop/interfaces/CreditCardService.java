package io.github.artemptushkin.example.oop.interfaces;


public interface CreditCardService {
	String CREDIT_CARD_CONSTANT = "I'm static field (constant) of the interface";

 	CreditCard getCreditCard();

	default String hello() {
		return "[INTERFACE] hello from the interface";
	}
}
