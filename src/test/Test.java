package test;

class Outer {
	int x = 10;
	int y = 20;

	class Inner {
		int x = 1000;

		public void m1() {

			System.out.println(this.x);
			System.out.println(Outer.this.x);

			System.out.println("Inner class");
		}

		class NestedInner {
			public void m11() {
				System.out.println("Nested Inner class");
			}
		}
	}
}

public class Test {
	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();
		Outer.Inner.NestedInner i2 = new Outer().new Inner().new NestedInner();
		i.m1();
		i2.m11();
	}
}
