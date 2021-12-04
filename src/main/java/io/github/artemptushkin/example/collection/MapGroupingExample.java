package io.github.artemptushkin.example.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapGroupingExample {

	public static void main(String[] args) {
		List<String> cats = List.of("1-васька", "2-john", "2-michael", "3-artem");

		Map<Integer, List<String>> map = new HashMap<>();

		for (String catValue : cats) {
			Integer value = Integer.valueOf(catValue.substring(0, 1));
			String rightPart = catValue.substring(2);

			List<String> currentStrings = map.get(value); //текущие строки
			if (currentStrings == null) {
				currentStrings = new ArrayList<>();
			}
			currentStrings.add(rightPart); //добавляем новый элемент в существующий или новый список

			map.put(value, currentStrings);
		}

		for (Map.Entry<Integer, List<String>> e : map.entrySet()) {
			System.out.println(e);
		}
	}
}
