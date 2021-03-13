/**
 * @Author Md. Mainul Hasan
 * 
 * 9:42:21 PM
 * 
 * Oct 27, 2020
 *
 */
package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class _1507_FormateDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//				Output: "2052-10-20"
		String date = "6th Jun 1933";
		String resultString = reformatDate(date);
		System.out.println(resultString);

		String dateString = "5th Jun 1933";
		String reString = usingHash(dateString);
		System.out.println(reString);
	}

	public static String reformatDate(String date) {

		// "6th Jun 1933"

		String[] splitString = date.split("\\s+");

		String dayString = "";

		if (splitString[0].length() <= 3) {
			dayString = "0" + date.substring(0, 1);
		} else {
			dayString = date.substring(0, 2);
		}

		String month = splitString[1];

		String monthString = "";

		// Input: date = "20th Oct 2052"

		switch (month) {
		case "Jan":
			monthString = "01";
			break;
		case "Feb":
			monthString = "02";
			break;
		case "Mar":
			monthString = "03";
			break;
		case "Apr":
			monthString = "04";
			break;
		case "May":
			monthString = "05";
			break;
		case "Jun":
			monthString = "06";
			break;
		case "Jul":
			monthString = "07";
			break;

		case "Aug":
			monthString = "08";
			break;

		case "Sept":
			monthString = "09";
			break;
		case "Oct":
			monthString = "10";
			break;
		case "Nov":
			monthString = "11";
			break;
		case "Dec":
			monthString = "12";
			break;
		}

		StringBuilder sBuilder = new StringBuilder();

		sBuilder.append(splitString[2] + "-" + monthString + "-" + dayString);

		return sBuilder.toString();

	}

	public static String usingHash(String date) {
		Map<String, String> month = new HashMap<>();

		month.put("Jan", "01");
		month.put("Feb", "02");
		month.put("Mar", "03");
		month.put("Apr", "04");
		month.put("May", "05");
		month.put("Jun", "06");
		month.put("Jul", "07");
		month.put("Aug", "08");
		month.put("Sep", "09");
		month.put("Oct", "10");
		month.put("Nov", "11");
		month.put("Dec", "12");

		String[] splitString = date.split("\\s+");

		String dayString = "";

		if (splitString[0].length() <= 3) {

			dayString = "0" + date.substring(0, 1);
		} else {

			dayString = date.substring(0, 2);
		}

		String monthString = month.get(splitString[1]);

		StringBuilder sBuilder = new StringBuilder();

		sBuilder.append(splitString[2] + "-" + monthString + "-" + dayString);

		return sBuilder.toString();
	}

}
