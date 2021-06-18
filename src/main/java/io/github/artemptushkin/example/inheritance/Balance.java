package io.github.artemptushkin.example.inheritance;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Balance {
	Long id;
	BigDecimal value;
}
