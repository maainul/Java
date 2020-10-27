/**
 * @Author Md. Mainul Hasan
 * 
 * 3:01:10 AM
 * 
 * Oct 24, 2020
 *
 */
package dateToMsConvertor;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class _2_ShortCutVersion_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println("Current Date time without Parse : " + dateTime);

		/*
		 * With this new Date/Time API, when using a date, you need to specify the Zone
		 * where the date/time will be used. For your case, seems that you want/need to
		 * use the default zone of your system. Check which zone you need to use for
		 * specific behaviour e.g. CET or America/Lima
		 */

		long millisSinceEpoch = LocalDateTime
				.parse(dateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")),
						DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"))
				.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

		System.out.println(millisSinceEpoch);
		
		
		//Java 8 - toEpochMilli() method of ZonedDateTime
	      System.out.println("Getting time in milliseconds in Java 8: " + 
	      ZonedDateTime.now().toInstant().toEpochMilli());

		
		

	}

}
