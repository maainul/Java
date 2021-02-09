/**
 * @Author Md. Mainul Hasan
 * 
 * 12:58:37 AM
 * 
 * Oct 24, 2020
 *
 */
package dateToMsConvertor;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class _1_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();

		String pattern = "yyyy/MM/dd HH:mm:ss";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

		String myDate = dateTime.format(formatter);

		System.out.println("Current Date is: " + myDate);

		/*
		 * With this new Date/Time API, when using a date, you need to specify the Zone
		 * where the date/time will be used. For your case, seems that you want/need to
		 * use the default zone of your system. Check which zone you need to use for
		 * specific behaviour e.g. CET or America/Lima
		 */

		long millisSinceEpoch = LocalDateTime.parse(myDate, formatter).atZone(ZoneId.systemDefault()).toInstant()
				.toEpochMilli();

		System.out.println(millisSinceEpoch);

	}

}
