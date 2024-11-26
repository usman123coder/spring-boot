package in.uk.binding;

import java.util.Arrays;
import java.util.Objects;

import lombok.Data;

@Data
public class Student1 {
	private String name;
	private String email;
	private String gender;
	private String course;
	private String[] timings;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(timings);
		result = prime * result + Objects.hash(course, email, gender, name);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return Objects.equals(course, other.course) && Objects.equals(email, other.email)
				&& Objects.equals(gender, other.gender) && Objects.equals(name, other.name)
				&& Arrays.equals(timings, other.timings);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String[] getTimings() {
		return timings;
	}
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", email=" + email + ", gender=" + gender + ", course=" + course
				+ ", timings=" + Arrays.toString(timings) + "]";
	}
}
