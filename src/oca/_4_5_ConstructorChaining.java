package oca;

public class _4_5_ConstructorChaining {

	private int numTeeth, weight, numWhiskers;

	public _4_5_ConstructorChaining(int weight) {
		this(weight, 16);
	}

	public _4_5_ConstructorChaining(int weight, int numTeeth) {
		this(weight, numTeeth, 6);
	}

	public _4_5_ConstructorChaining(int weight, int numTeeth, int numWhiskers) {
		this.weight = weight;
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
	}

	private void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);

	}

	public static void main(String[] args) {
		_4_5_ConstructorChaining obj = new _4_5_ConstructorChaining(15);
		obj.print();
	}
}
// 15 16 6