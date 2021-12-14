package io.github.artemptushkin.example.sorting;

import java.time.ZonedDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User implements Comparable<User> {
	private String name;
	private String email;
	private ZonedDateTime birthday;
	private Integer id;

	/**
	 * если other больше, то вернуть > 0
	 * если больше 0, то будет первый
	 */
	@Override
	public int compareTo(User other) {
		int byId = this.id.compareTo(other.id);
		int byName = this.name.compareTo(other.name);

		if (byId == 0) {
			return byName;
		}
		return byId;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", id=" + id +
				'}';
	}
}
