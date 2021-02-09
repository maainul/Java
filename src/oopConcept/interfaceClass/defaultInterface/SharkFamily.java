package oopConcept.interfaceClass.defaultInterface;

public interface SharkFamily extends HasFins {

	@Override
	public default double getLongestScales() {
		return 8;
	}

	@Override
	public abstract int getNumberOfFins();

	// if you remove default then error will be happens
	@Override
	public default boolean doFinsHaveScales() {
		return false;
	}

}
