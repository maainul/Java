package javastrings;

public class StringBufferReplace {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Hello");
		stringBuffer.replace(1, 3, "java");
		System.out.println(stringBuffer);

	}

}

// Output : Hjavalo
