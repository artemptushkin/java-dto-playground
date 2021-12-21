package io.github.artemptushkin.example.stream;

import java.time.ZonedDateTime;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class StationView {
	String name;
	ZonedDateTime createdAt;
}
