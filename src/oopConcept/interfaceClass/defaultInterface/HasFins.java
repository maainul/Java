package oopConcept.interfaceClass.defaultInterface;

public interface HasFins {
	public default int getNumberOfFins() {
		return 4;
	}

	public default double getLongestScales() {
		return 20.0;
	}

	public default boolean doFinsHaveScales() {
		return true;
	}
}
