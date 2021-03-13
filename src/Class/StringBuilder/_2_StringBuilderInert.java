package Class.StringBuilder;

// The StringBuilder insert() method inserts the given string with this string at the given position.
public class _2_StringBuilderInert {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hello");
		sb.insert(1, "Java");
		System.out.println(sb);
	}
}
// Output : HJavaello
