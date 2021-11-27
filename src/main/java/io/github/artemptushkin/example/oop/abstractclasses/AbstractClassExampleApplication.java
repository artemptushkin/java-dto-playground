package io.github.artemptushkin.example.oop.abstractclasses;

public class AbstractClassExampleApplication {

	public static void main(String[] args) {
		System.out.println("============ EXAMPLE ===========");

		AuthService authService = new AuthService();

		CreditCardService alfa = new AlfaBankCreditCardService(authService);
		CreditCardService sber = new SberCreditCardService(authService);

		alfa.getCreditCard();
		System.out.println("\n");
		sber.getCreditCard();
	}
}
