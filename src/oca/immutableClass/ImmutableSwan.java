package oca.immutableClass;

public class ImmutableSwan {
	private int numberOfEggs;

	public int getNumberOfEggs() {
		return numberOfEggs;
	}

	public ImmutableSwan(int numberOfEggs) {
		if (numberOfEggs >= 0) {
			this.numberOfEggs = numberOfEggs;
		}
	}

	public void display() {
		System.out.println(numberOfEggs);
	}

	public static void main(String args[]) {
		ImmutableSwan obj = new ImmutableSwan(-5);
		obj.display();
	}
}
