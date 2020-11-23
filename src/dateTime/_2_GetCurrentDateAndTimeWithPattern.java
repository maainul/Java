/**
 * @Author Md. Mainul Hasan
 * 
 * 1:26:21 AM
 * 
 * Oct 24, 2020
 *
 */
package dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _2_GetCurrentDateAndTimeWithPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LocalDateTime currenTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedString = currenTime.format(formatter);
		
		System.out.println("Current date time is :" + formattedString);
	}

}
