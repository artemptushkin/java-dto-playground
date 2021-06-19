package io.github.artemptushkin.example.mutable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class Animal {
	private Long id;
	private String description;
}
