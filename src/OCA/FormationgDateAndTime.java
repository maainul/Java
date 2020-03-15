package OCA;

import java.time.LocalDate;

public class FormationgDateAndTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 3, 15);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfYear ());
		

	}

}
