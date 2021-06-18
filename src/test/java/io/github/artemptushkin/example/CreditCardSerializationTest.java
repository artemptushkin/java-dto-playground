package io.github.artemptushkin.example;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static io.github.artemptushkin.example.Status.ACTIVE;
import static io.github.artemptushkin.test.util.TestHelper.readFromFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CreditCardSerializationTest {

	private ObjectMapper objectMapper;

	@BeforeEach
	void setup() {
		this.objectMapper = new ObjectMapper();
	}

	@Test
	void itSerializes() throws Exception {
		CreditCard creditCard = CreditCard
				.builder()
				.name("The credit card")
				.rate(new BigDecimal("5.0"))
				.status(ACTIVE)
				.balance(Balance
						.builder()
						.id(1L)
						.value(new BigDecimal("1000.0"))
						.build())
				.build();

		String expectedJson = readFromFile("credit-card-serialize.json");

		String actualJson = objectMapper.writeValueAsString(creditCard);

		JSONAssert.assertEquals(expectedJson, actualJson, true);
	}

	@Test
	void itDeserializes() throws Exception {
		String inputJson = readFromFile("credit-card-deserialize.json");

		CreditCard actual = objectMapper.readValue(inputJson, CreditCard.class);

		assertEquals(new BigDecimal("5.0"), actual.getRate());
		assertEquals("The credit card", actual.getName());
		assertSame(ACTIVE, actual.getStatus());
		assertNotNull(actual.getBalance());
		assertEquals(1L, actual.getBalance().getId());
		assertEquals(new BigDecimal("1000.0"), actual.getBalance().getValue());
	}
}
