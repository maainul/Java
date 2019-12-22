package javastrings;

public class StringBufferDelete {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Hello");
		stringBuffer.delete(1, 3);
		System.out.println(stringBuffer);
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.capacity());
	}

}
/*
 * Output : 
 * Hlo 
 * olH 
 * 21
 */
