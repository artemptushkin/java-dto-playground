package io.github.artemptushkin.example.stream;

import java.util.function.Predicate;

public class StationPredicate implements Predicate<Product> {
	@Override
	public boolean test(Product product) {
		return product.getType() == Type.STATION;
	}
}
