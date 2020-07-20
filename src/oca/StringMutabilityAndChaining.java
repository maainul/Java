package oca;

public class StringMutabilityAndChaining {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Start");
		sb.append("+middle");

		System.out.println(sb);

		StringBuilder same = sb.append("+end");
		System.out.println(same);

		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g");

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		StringBuilder firstName = new StringBuilder("mainul");
		StringBuilder secondName = firstName.append(" Hasan");

		secondName.append(" Anik");

		System.out.println(firstName);
	} 

}
