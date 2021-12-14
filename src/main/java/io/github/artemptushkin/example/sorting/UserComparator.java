package io.github.artemptushkin.example.sorting;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
	@Override
	public int compare(User o1, User o2) {
		int byId = o1.getId().compareTo(o2.getId());
		int byName = o1.getName().compareTo(o2.getName());

		if (byId == 0) {
			return byName;
		}
		return byId;
	}
}
