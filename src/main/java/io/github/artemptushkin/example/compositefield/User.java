package io.github.artemptushkin.example.compositefield;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class User {
	String name;
	Document document;
}
