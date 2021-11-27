package io.github.artemptushkin.example.service.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

	@Override
	public MyImage getImage() {
		return new MyImage();
	}
}
