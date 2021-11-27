package io.github.artemptushkin.example.oop.interfaces;

import java.util.List;

public class InterfacesExampleApplication {

	public static void main(String[] args) {

		System.out.println("============ EXAMPLE ===========");

		dependencyInjection(); //SOLID : D

		System.out.println("============ EXAMPLE ===========");

		polymorphism(); //OOP

		System.out.println("============ EXAMPLE ===========");

		inheritance(); //OOP
	}

	/**
	 * We depend on the abstraction (interface) and not the implementation, i.e. we don't change MyController
	 * See D letter in SOLID principles
	 */
	private static void dependencyInjection() {
		System.out.println("Dependency injection example\n");

		CreditCardService alfa = new AlfaBankCreditCardService();
		CreditCardService sber = new SberCreditCardService();

		MyController alfaController = new MyController(alfa);
		//OR
		MyController sberController = new MyController(sber);

		System.out.println("\nCalling my controller created with alfa service");
		alfaController.getCreditCard();

		System.out.println("\nCalling my controller created with sber service");
		sberController.getCreditCard();

		System.out.println("\nDependency injection example");
	}

	/**
	 * Polymorphism use case. We call "abstract" methods and the implementation defines the behaviour
	 */
	private static void polymorphism() {
		System.out.println("Polymorphism example\n");

		CreditCardService alfa = new AlfaBankCreditCardService();
		CreditCardService sber = new SberCreditCardService();

		List<CreditCardService> services = List.of(alfa, sber);
		doCallPolymorphList(services);

		System.out.println("\nPolymorphism example");
	}

	private static void doCallPolymorphList(List<CreditCardService> list) {
		for (CreditCardService service : list) {
			service.getCreditCard(); //polymorphism is here.
		}
	}

	/**
	 * Inheritance and methods overridden use case. We call the same methods of interface, it returns value from the implementation
	 */
	private static void inheritance() {
		System.out.println("Inheritance example\n");

		CreditCardService alfa = new AlfaBankCreditCardService();
		CreditCardService sber = new SberCreditCardService();

		System.out.println("Calling overridden #hello of alfa:\n" + alfa.hello());
		System.out.println("Calling not overridden #hello of sber:\n" + sber.hello());

		System.out.println("\nInheritance example");
	}
}
