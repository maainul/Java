package javastrings.Class.String;


public class _15_StringGetBytes {

	public static void main(String[] args) {
		String s1 = "ABCDEFG";
		byte[] barr = s1.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
		}
		
		String s2 = new String(barr);
		System.out.println(s2);

	}

}
/*
 * 65 
 * 66 
 * 67 
 * 68 
 * 69 
 * 70 
 * 71 
 * ABCDEFG
 */

