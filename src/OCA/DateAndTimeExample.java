package OCA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTimeExample {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date);
		date = date.plusDays(2);
		System.out.println(date);
		date = date.plusWeeks(1);
		System.out.println(date);
		date = date.plusMonths(1);
		System.out.println(date);
		date = date.plusYears(6);
		System.out.println(date);
		
		LocalDate daate = LocalDate.of(2010, Month.JANUARY, 1);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime datetime = LocalDateTime.of(daate, time);
		System.out.println(datetime);
		datetime = datetime.minusDays(1);
		System.out.println(datetime);
		datetime = datetime.minusHours(10);
		System.out.println(datetime);
		datetime = datetime.minusSeconds(10);
		System.out.println(datetime);
		System.out.println(datetime);
		System.out.println(datetime);
		System.out.println(datetime);
		
		LocalDate datee = LocalDate.of(2020, Month.JANUARY,20);
		datee.plusDays(10);
		System.out.println(datee);
		

	}

}
