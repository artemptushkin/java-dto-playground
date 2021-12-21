package io.github.artemptushkin.example.stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ProductService {

	public void proceed(Stream<Product> productStream) {
		productStream
				.peek(product -> System.out.println("а я тоже пытаюсь перебрать стрим"))
				.close();
	}

	public void proceed(Supplier<Product> productSupplier) {
		System.out.println("I'm calculating....");
		System.out.println("I'm calculating....");
		System.out.println("I'm calculating....");
		System.out.println("I'm calculating....");
		System.out.println("I'm calculating....");
		System.out.println("I'm calculating....");
		System.out.println("I'm calculating....");
		System.out.println("I'm calculating....");
		System.out.println("I'm calculating....");
		System.out.println("I'm calculating....");

		Product product = productSupplier.get();
		System.out.println("я наконец получил продукт " + product.getName());
	}
}
