package io.github.artemptushkin.example.oop.interfaces.decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

	@Override
	public MyImage getImage() {
		return new MyImage();
	}
}
