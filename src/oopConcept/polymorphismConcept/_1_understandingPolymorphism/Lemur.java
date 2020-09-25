package oopConcept.polymorphismConcept._1_understandingPolymorphism;

public class Lemur extends Primate implements HasTail {

	public int age = 10;

	@Override
	public boolean isTailStriped() {
		return false;
	}

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		System.out.println(lemur.hasHair());
		System.out.println(lemur.isTailStriped());

	}

}
