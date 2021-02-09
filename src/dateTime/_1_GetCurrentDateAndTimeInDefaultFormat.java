/**
 * @Author Md. Mainul Hasan
 * 
 * 1:24:05 AM
 * 
 * Oct 24, 2020
 *
 */
package dateTime;

import java.time.LocalDateTime;

public class _1_GetCurrentDateAndTimeInDefaultFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current Date and time is :" + current);

	}

}
