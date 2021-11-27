package io.github.artemptushkin.example.service.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImageController {
	private final ImageService imageService;

	public MyImage getMyImage() {
		return imageService.getImage();
	}
}
