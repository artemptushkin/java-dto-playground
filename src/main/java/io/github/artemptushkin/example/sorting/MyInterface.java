package io.github.artemptushkin.example.sorting;

public interface MyInterface {
	default String hello() {
		return "default hello";
	}
	void setName(String name);
}
