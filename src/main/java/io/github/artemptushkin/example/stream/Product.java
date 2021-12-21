package io.github.artemptushkin.example.stream;

import java.time.ZonedDateTime;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Product {
	String name;
	Type type;
	ZonedDateTime createdAt;
}
