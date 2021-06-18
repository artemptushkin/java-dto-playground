package io.github.artemptushkin.test.util;

import java.nio.charset.StandardCharsets;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.apache.commons.io.IOUtils;

@UtilityClass
public class TestHelper {
	@SneakyThrows
	public static String readFromFile(String filePath) {
		return IOUtils.toString(
				TestHelper.class.getClassLoader().getResourceAsStream(filePath), StandardCharsets.UTF_8
		);
	}
}
