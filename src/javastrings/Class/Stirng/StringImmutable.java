package javastrings.Class.Stirng;

public class StringImmutable {

	public static void main(String[] args) {
	    String s = "mohammad "; //concat() method appends the string at the end  
	    s.concat("hasan"); ////will print mohammad because strings are immutable objects  
		System.out.println(s);
		s = s.concat("anik");
		System.out.println(s); // it is changing because it create another refereance variable.
	}

}
