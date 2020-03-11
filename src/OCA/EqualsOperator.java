package OCA;

public class EqualsOperator {

	public static void main(String[] args) {
		String str = "Mainul";
		String str2 = "Hasan";
		String str3 = "Hasan";
		String str4 = "ABC";
		System.out.println(str== str2); // false
		System.out.println(str2== str3); // true
		
		String s1 = new String("Mainul");
		String s2 = new String("Hasan");
		String s3 = new String("Mainul");
		String s4 = new String("ABC");
		
		System.out.println(str== s1); // false 
		System.out.println(str2== s2); // false
		System.out.println(str== str2); // false
		System.out.println(s1== s3); // false
		System.out.println(str.equals(s1)); //true
		System.out.println(str.equals(s2)); // false
		System.out.println(str2.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true
		System.out.println(str4 == s4); //false
		System.out.println(str4.equals(s4)); // true

	}

}
