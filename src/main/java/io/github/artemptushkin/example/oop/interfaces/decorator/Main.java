package io.github.artemptushkin.example.oop.interfaces.decorator;

public class Main {
	public static void main(String[] args) {
		ImageService imageService = new ImageServiceImpl();
		AuthService authService = new AuthService();

		ImageController imageController = new ImageController(new ImageServiceImplDecorator(authService, imageService));
	}
}
