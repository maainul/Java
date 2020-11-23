package constructor.ocaBook.constructorchaining;

public class Mouse {

	private int numOfTeeth;
	private int numOfWhisker;
	private int weight;

	public Mouse(int weight) {
		this(weight, 16);
	}

	public Mouse(int weight, int numOfWhisker) {
		this(20, numOfWhisker, weight);
	}

	public Mouse(int numOfTeeth, int numOfWhisker, int weight) {

		this.numOfTeeth = numOfTeeth;
		this.numOfWhisker = numOfWhisker;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Mouse [numOfTeeth=" + numOfTeeth + ", numOfWhisker=" + numOfWhisker + ", weight=" + weight + "]";
	}

	public static void main(String[] args) {
		Mouse mouse = new Mouse(10);
		System.out.println(mouse.toString());

	}

}
