/**
 * @Author Md. Mainul Hasan
 * 
 * 3:27:42 AM
 * 
 * Oct 24, 2020
 *
 */
package dateToMsConvertor.convertStringToDate;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class _1_ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		System.out.println(date);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String string = date.format(formatter);

		System.out.println(string);

		LocalDate localDate = LocalDate.parse(string, formatter);

		System.out.println(localDate);

	}

}
