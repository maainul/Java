/**
 * @Author Md. Mainul Hasan
 * 
 * 3:46:36 AM
 * 
 * Oct 24, 2020
 *
 */
package dateToMsConvertor;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class _3_MilliSecondToDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long epoch = Instant.now().toEpochMilli();
		System.out.println(epoch);

		LocalDate ld = Instant.ofEpochMilli(epoch).atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println(ld);

		LocalDateTime ldt = Instant.ofEpochMilli(epoch).atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(ldt);

		long longDate = 1603558353511l;

		LocalDateTime newDate = Instant.ofEpochMilli(longDate).atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(newDate);

//		long longdd = 2147483607;
//
//		LocalDateTime myddDateTime = Instant.ofEpochMilli(longdd).atZone(ZoneId.systemDefault()).toLocalDateTime();
//		System.out.println(myddDateTime);

		
		System.out.println(Long.MAX_VALUE);
		
		
	}

}