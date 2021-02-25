package _6_ExceptionsAndAssertions;

public class StuckTurkeyCage implements AutoCloseable {
	@Override
	public void close() throws Exception {
		throw new Exception("Cage door does not close");

	}

	public static void main(String[] args) {
//		try (StuckTurkeyCage t = new StuckTurkeyCage()) {
//			System.out.println("Put turkey in");
//		}

	}
}