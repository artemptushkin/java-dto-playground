package io.github.artemptushkin.example.service;

import io.github.artemptushkin.example.inheritance.CreditCard;

public interface CreditCardService {
	String DETAILS = "my text";

	CreditCard getCreditCard();

	public static void main(String[] args) {
		String details = CreditCardService.DETAILS;
	}
}
