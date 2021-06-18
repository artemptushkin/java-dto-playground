package io.github.artemptushkin.example.inheritance;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class DebitCard extends Card {
	BigDecimal cashBackRate;
}
