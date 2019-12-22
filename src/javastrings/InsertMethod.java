package javastrings;

public class InsertMethod {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Hello");
		stringBuffer.insert(1, "Java");
		//The append() method concatenates the given argument with this string.
		System.out.println(stringBuffer);
	}
}

// Output : HJavaello

