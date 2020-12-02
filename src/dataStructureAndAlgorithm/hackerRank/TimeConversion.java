package dataStructureAndAlgorithm.hackerRank;

// Time Conversion
/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid
Sample Input 0

07:05:45PMGiven a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example


Return '12:01:00'.


Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in  hour format
Returns

string: the time in  hour format
Input Format

A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints

All input times are valid
Sample Input 0

07:05:45PM
Sample Output 0

19:05:45
Sample Output 0

19:05:45
 */

public class TimeConversion {
    public static void main(String[] args) {
        String time = "07:05:45PM";
        String s = timeConversionMethod(time);
        System.out.println(s);
    }

    private static String timeConversionMethod(String time) {
        String splitStr[] = time.split(":");

        String hour = splitStr[0];
        String minute = splitStr[1];
        String second = splitStr[2].substring(0,2);

        String caser = splitStr[2].substring(2,4);

        if (caser.equals("AM")){
            if (hour.equals("12")){
                hour = "00";
            }
            // return (hour+":"+minute+":"+second);

        }else {
            if (!hour.equals("12")){
                int h = Integer.parseInt(hour);
                h = h + 12;
                hour = ""+h;
            }
            // return (hour+":"+minute+":"+second);

        }

        return (hour+":"+minute+":"+second);


    }
}
