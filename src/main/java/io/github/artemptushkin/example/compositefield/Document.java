package io.github.artemptushkin.example.compositefield;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Document {
	Long id;
	String name;
}
