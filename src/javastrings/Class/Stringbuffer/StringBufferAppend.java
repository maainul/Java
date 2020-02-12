package javastrings.Class.Stringbuffer;

public class StringBufferAppend {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Hello");
		stringBuffer.append("Java");
		//The append() method concatenates the given argument with this string.
		System.out.println(stringBuffer);

	}

}

// Output : HelloJava