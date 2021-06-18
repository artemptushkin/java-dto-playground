package io.github.artemptushkin.example.compositefield;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static io.github.artemptushkin.test.util.TestHelper.readFromFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserSerializationTest {
	private ObjectMapper objectMapper;

	@BeforeEach
	void setup() {
		this.objectMapper = new ObjectMapper();
	}

	@Test
	void itSerializes() throws Exception {
		User user = User
				.builder()
				.name("John")
				.document(Document
						.builder()
						.id(1L)
						.name("the name")
						.build())
				.build();

		String expectedJson = readFromFile("user-serialize.json");

		String actualJson = objectMapper.writeValueAsString(user);

		JSONAssert.assertEquals(expectedJson, actualJson, true);
	}

	@Test
	void itDeserializes() throws Exception {
		String inputJson = readFromFile("user-deserialize.json");

		User actual = objectMapper.readValue(inputJson, User.class);

		assertEquals("John", actual.getName());
		assertNotNull(actual.getDocument());
		assertEquals(1L, actual.getDocument().getId());
		assertEquals("the name", actual.getDocument().getName());
	}
}