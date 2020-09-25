package oopConcept.interfaceClass.defaultInterface;

public interface SharkFamily extends HasFins {

	public default double getLongestScales() {
		return 8;
	}

	public abstract int getNumberOfFins();

	// if you remove default then error will be happens
	public default boolean doFinsHaveScales() {
		return false;
	}

}
