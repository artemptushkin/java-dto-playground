package io.github.artemptushkin.example.controller;


import io.github.artemptushkin.example.inheritance.CreditCard;
import io.github.artemptushkin.example.service.CreditCardService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyController {
	private final CreditCardService creditCardService;

	public CreditCard getCreditCard() {
		return creditCardService.getCreditCard();
	}
}
