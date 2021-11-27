package io.github.artemptushkin.example.service.decorator;

public class ImageServiceImplDecorator implements ImageService {
	private final ImageService decorated;
	private final AuthService authService;

	public ImageServiceImplDecorator(AuthService authService, ImageService decorated) {
		this.decorated = decorated;
		this.authService = authService;
	}

	@Override
	public MyImage getImage() {
		authService.auth();
		return decorated.getImage();
	}
}
