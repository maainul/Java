package test;

public class Main {

	static int x = 10;
	static int y = 20;

	public static void m1() {
		final int z = 50;
		class Inner {
			public void sum() {
				System.out.println(x);
				System.out.println(z);
				System.out.println(y);
			}
		}
		Inner i = new Inner();
		i.sum();
	}

	public static void main(String[] args) {
		Main main = new Main();
		Main.m1();
	}
}
