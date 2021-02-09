package oopConcept.interfaceClass.MultipleInheritance;

/*
 * Interface can be inherited
 * Interface can extends another interface
 * Interface can't implements anothr interface
 * Interfaces can have multiple same method 
 * But
 * Have to be same method signature
 * 
 * If return type is not match then will not comple
 */
public class Bear implements Herviibore, Omnivore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eatMeat() {
		// TODO Auto-generated method stub

	}

	@Override
	public int eatPlants(int m) {
		// TODO Auto-generated method stub
		return 0;
	}

}
