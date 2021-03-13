package Class.Stringbuffer;

//The reverse() method of StringBuilder class reverses the current string.

class _5_StringBufferReverse {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.reverse();
		System.out.println(sb);// prints olleH
	}
}