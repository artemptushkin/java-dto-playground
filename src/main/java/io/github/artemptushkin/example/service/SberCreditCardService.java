package io.github.artemptushkin.example.service;

import io.github.artemptushkin.example.inheritance.CreditCard;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SberCreditCardService implements CreditCardService {
	private final SberCreditCardClient client;

	@Override
	public CreditCard getCreditCard() {
		return null;
	}
}
