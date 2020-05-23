package OCA;

public class _3_StringEquality {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");

		System.out.println(one);
		System.out.println(two);
		System.out.println(three);

		System.out.println(one == two);
		System.out.println(one == three);
		System.out.println("---------------");
		String x = "Hello world";
		String y = "Hello world";
		System.out.println(x==y);
		System.out.println(x.equals(y));
		
		System.out.println("---------------");
		String x2 = "Hello world";
		String y2 = "  Hello world".trim();
		System.out.println(x2==y2);
		System.out.println(x2.equals(y2));
		
		
		System.out.println("---------------");
		StringBuilder x3 = new StringBuilder("Hello world");
		String y3 = "Hello world";
		//System.out.println(x3==y3);
		System.out.println(x3.equals(y3));
		
		_3_StringEquality t1 = new _3_StringEquality();
		_3_StringEquality t2 = new _3_StringEquality();
		_3_StringEquality t3 = t1;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println();
		
		
	 }

}
/*
a

a
false
true
---------------
true
true
---------------
false
true
---------------
false

*/