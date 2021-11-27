package io.github.artemptushkin.example.service.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImageService {
	private final AuthService authService;

	public MyImage getImage() {
		authService.auth();
		return new MyImage();
	}
}
