package io.github.artemptushkin.example.mutable;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static io.github.artemptushkin.test.util.TestHelper.readFromFile;
import static org.junit.jupiter.api.Assertions.*;

class CatSerializationTest {
	private ObjectMapper objectMapper;

	@BeforeEach
	void setup() {
		this.objectMapper = new ObjectMapper();
	}

	@Test
	void itSerializes() throws Exception {
		Cat user = Cat
				.builder()
				.description("Cats rule!")
				.id(1L)
				.lives(9)
				.build();

		String expectedJson = readFromFile("cat-serialize.json");

		String actualJson = objectMapper.writeValueAsString(user);

		JSONAssert.assertEquals(expectedJson, actualJson, true);
	}

	@Test
	void itDeserializes() throws Exception {
		String inputJson = readFromFile("cat-deserialize.json");

		Cat actual = objectMapper.readValue(inputJson, Cat.class);

		assertEquals("Cats rule!", actual.getDescription());
		assertEquals(1L, actual.getId());
		assertEquals(9, actual.getLives());
	}
}