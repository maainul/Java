package constructor.ocaBook.constructorOverloading;

public class Hamstar {
	private int weight;
	private String color;

//	public Hamstar(int weight) {
//		this.setWeight(weight);
//	}

//	public Hamstar(int weight, String color) {
//		// TODO Auto-generated constructor stub
//		this.setWeight(weight);
//		this.setColor(color);
//
//	}

	public Hamstar(int weight, String color) {
		this.weight = weight;
		this.color = color;
	}

	public Hamstar(int weight) {
		this.weight = weight;
		this.color = "red";
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
//	public void setColor(String color) {
//		this.color = color;
//	}
}
