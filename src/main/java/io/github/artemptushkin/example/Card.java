package io.github.artemptushkin.example;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.experimental.SuperBuilder;

@Value
@NonFinal
@SuperBuilder
@RequiredArgsConstructor
public class Card {
	String name;
	Status status;
	Balance balance;
}
