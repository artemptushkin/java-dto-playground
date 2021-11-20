package io.github.artemptushkin.example;

import io.github.artemptushkin.example.controller.MyController;
import io.github.artemptushkin.example.service.SberCreditCardClient;
import io.github.artemptushkin.example.service.SberCreditCardService;

public class MyApplication {
	public static void main(String[] args) {
		MyController my = new MyController(
				new SberCreditCardService(new SberCreditCardClient())
		);
		my.getCreditCard();
	}
}
