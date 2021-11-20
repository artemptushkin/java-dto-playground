package io.github.artemptushkin.example.service;

import io.github.artemptushkin.example.inheritance.CreditCard;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AlfaBankCreditCardService implements CreditCardService {
	private final AlfaBankCreditCardClient client;

	@Override
	public CreditCard getCreditCard() {
		return null;
	}
}
