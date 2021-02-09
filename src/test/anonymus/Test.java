package test.anonymus;

class Popcorn {
	public void tast() {
		System.out.println("salty");
	}
}

public class Test {
	public static void main(String[] args) {
		Popcorn p = new Popcorn();
		p.tast();

		Popcorn p1 = new Popcorn() {
			@Override
			public void tast() {
				System.out.println("sweet");
			}
		};
		p1.tast();

		Popcorn p2 = new Popcorn() {
			@Override
			public void tast() {
				System.out.println("sour");
			}
		};
		p2.tast();

		System.out.println(p.getClass().getName());
		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());

	}
}
