/**
 * @Author Md. Mainul Hasan
 * 
 * 1:33:10 AM
 * 
 * Oct 24, 2020
 *
 */
package dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _4_GetCurrentDateTimeInLocalizedStyle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LocalDateTime curenTime = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		String formateedString = curenTime.format(formatter);
		
		System.out.println("Current Date is :" + formateedString);

	}

}
