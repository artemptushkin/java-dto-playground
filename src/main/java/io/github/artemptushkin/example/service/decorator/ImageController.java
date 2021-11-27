package io.github.artemptushkin.example.service.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImageController {
	private final ImageService imageServiceImpl;

	public MyImage getMyImage() {
		return imageServiceImpl.getImage();
	}
}
