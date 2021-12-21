package io.github.artemptushkin.example.stream;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MyApplication {

	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		Product product1 = Product
				.builder()
				.name("Product 1")
				.createdAt(now.minusHours(6))
				.type(Type.CARD)
				.build();
		Product product2 = Product
				.builder()
				.name("Product 2")
				.createdAt(now.minusHours(3))
				.type(Type.CARD)
				.build();
		Product product3 = Product
				.builder()
				.name("Product 3")
				.createdAt(now)
				.type(Type.STATION)
				.build();
		List<Product> products = List.of(product1, product2, product3);

		ProductGroup productGroup = products
				.stream()
				.collect(Collectors.collectingAndThen(Collectors.toList(), ProductGroup::new));

		Map<Type, List<Product>> productsPerType = products
				.stream()
				.collect(Collectors.groupingBy(product -> product.getType()));

		Map<Type, Product> map = new HashMap<>();
		map.put(Type.CARD, product1);
		map.put(Type.CARD, product2);
		map.put(Type.STATION, product3);

		map
				.entrySet()
				.stream()
				.forEach(entry -> System.out.println("Получил продукт типа " + entry.getKey() + " с именем " + entry.getValue().getName()));
	}

	public static void main1(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		Product product1 = Product
				.builder()
				.name("Product 1")
				.createdAt(now.minusHours(6))
				.type(Type.CARD)
				.build();
		Product product2 = Product
				.builder()
				.name("Product 2")
				.createdAt(now.minusHours(3))
				.type(Type.CARD)
				.build();
		Product product3 = Product
				.builder()
				.name("Product 3")
				.createdAt(now)
				.type(Type.STATION)
				.build();
		ProductService productService = new ProductService();

		List<Product> products = List.of(product1, product2, product3);

		List<StationView> stationProducts = products
				.stream()
				.filter(product -> {
					System.out.println("Filtering...");
					return product.getType() == Type.STATION;
				})
				.map(product -> StationView
						.builder()
						.name(product.getName())
						.createdAt(product.getCreatedAt())
						.build())
				.peek(product -> System.out.println("Mapping is finished"))
				.collect(Collectors.toList());

		System.out.println(stationProducts);
		//----

		Supplier<Product> productSupplier = () -> {
			System.out.println("я сапплайер, готов вернуть продукт");
			return product1;
		};

		productService.proceed(productSupplier);
	}
}
