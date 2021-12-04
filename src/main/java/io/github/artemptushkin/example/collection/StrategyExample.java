package io.github.artemptushkin.example.collection;

import java.util.Map;

public class StrategyExample {

	static Map<CardType, Service> cardTypeServiceMap = Map.of(
		CardType.DEBIT, new DebitCardService(),
		CardType.CREDIT, new CreditCardService()
	); //STRATEGY

	public static void main(String[] args) {
		resolve(CardType.CREDIT);
		resolve(CardType.DEBIT);
	}

	static class DebitCardService implements Service {
		@Override
		public void doAction() {
			System.out.println("I'm debit");
		}
	}

	static class CreditCardService implements Service {
		@Override
		public void doAction() {
			System.out.println("I'm credit");
		}
	}

	static interface Service { //STRATEGY interface

		void doAction();
	}

	private static void resolve(CardType cardType) {
		cardTypeServiceMap.get(cardType).doAction();
	}

	enum CardType {
		CREDIT, DEBIT
	}
}
