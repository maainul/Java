package feExamQuestion.March_2015;

import java.util.Date;

public class Person {
	private String lastName;
	private String firstName;
	private char middleInitial;
	private Date birthdate;

	public Person(String lastName, String firstName, char middleInitial, Date birthdate) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.birthdate = birthdate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", middleInitial=" + middleInitial
				+ ", birthdate=" + birthdate + "]";
	}

}
