package oca;

class Swan {
	private int numEggs;

	public int getNumberEggs() {
		return numEggs;
	}

	public void setNumberEggs(int numEggs) {
		if (numEggs >= 0) {
			this.numEggs = numEggs;
		}
	}

}

public class _4_6_EncapslatingData {

	public static void main(String[] args) {
		Swan obj = new Swan();
		obj.setNumberEggs(10);
		int eggs = obj.getNumberEggs();
		System.out.println(eggs);
	}
}
