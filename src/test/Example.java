package test;

public class Example {
	int i = 10;
	static int j = 20;

	public static void m1() {
		int k = 30;
		final int m = 30;

		class Inner {
			public void m2() {
				// System.out.println(i);
				System.out.println(j);
				System.out.println(k);
				System.out.println(m);

			}
		}

		Inner i = new Inner();
		i.m2();
	}

	public static void main(String[] args) {
		Example example = new Example();
		Example.m1();

	}
}
