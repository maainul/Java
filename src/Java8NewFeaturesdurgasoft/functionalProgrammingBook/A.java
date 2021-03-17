package Java8NewFeaturesdurgasoft.functionalProgrammingBook;
interface A{
	 void m1(int a, int b);
}

class TestC{
	public static void main(String[] args) {
		A aa = (a,b)-> System.out.println(a + b);
		aa.m1(10,20);
		//System.out.println(aa);

	}
}