package oca;

public class App {

	public static void main(String[] args) {
		String s = "mohammad";
		s.concat("hasan");
		System.out.println(s);
		// create another reference variable so it will print
		// mohammad anik
		s = s.concat(" anik");
		System.out.println(s);

		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2); // 12
		String st = "anik";
		System.out.println(st.substring(0,3)); // ani
		System.out.println(st.substring(3));//k
		System.out.println(st.substring(1,3));//ni
	}

}
