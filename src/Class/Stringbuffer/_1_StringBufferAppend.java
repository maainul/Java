package Class.Stringbuffer;

public class _1_StringBufferAppend {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Hello");
		stringBuffer.append(" Java");
		// The append() method concatenates the given argument with this string.
		System.out.println(stringBuffer);

	}

}

// Output : Hello Java