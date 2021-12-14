package io.github.artemptushkin.example.sorting;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	//todo test collection
	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		User user1 = User
				.builder()
				.name("John")
				.email("john@gmail.com")
				.id(1)
				.birthday(now.minusDays(1))
				.build();
		User user2 = User
				.builder()
				.name("Jack")
				.id(1)
				.email("john@gmail.com")
				.birthday(now.minusDays(3))
				.build();
		User user3 = User
				.builder()
				.name("Marta")
				.id(2)
				.email("john@gmail.com")
				.birthday(now.minusDays(2))
				.build();

		/*Set<User> users = new TreeSet<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);

		System.out.println(users);*/

		//======== Comparator
		Comparator<User> comparator = new Comparator<>() {
			@Override
			public int compare(User o1, User o2) {
				int byId = o1.getId().compareTo(o2.getId());
				int byName = o1.getName().compareTo(o2.getName());

				if (byId == 0) {
					return byName;
				}
				return byId;
			}
		};
		Set<User> users = new TreeSet<>(comparator);
		users.add(user2);
		users.add(user1);
		users.add(user3);

		//=====
		Set<User> otherUsers = new TreeSet<>(comparator);
		otherUsers.add(user2);
		otherUsers.add(user3);
		otherUsers.add(user1);

		System.out.println(users.equals(otherUsers));

		List<User> userList1 = new ArrayList<>();
		userList1.add(user2);
		userList1.add(user3);
		userList1.add(user1);

		List<User> userList2 = new ArrayList<>();
		userList2.add(user2);
		userList2.add(user3);
		userList2.add(user1);

		System.out.println(userList1.equals(userList2));

	}
}
