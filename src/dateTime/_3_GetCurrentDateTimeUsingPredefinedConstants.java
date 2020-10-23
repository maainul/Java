/**
 * @Author Md. Mainul Hasan
 * 
 * 1:29:59 AM
 * 
 * Oct 24, 2020
 *
 */
package dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _3_GetCurrentDateTimeUsingPredefinedConstants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		String formatedString = current.format(formatter);

		System.out.println("Current date is :" + formatedString);

	}

}
