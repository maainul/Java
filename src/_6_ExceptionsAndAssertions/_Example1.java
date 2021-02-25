package _6_ExceptionsAndAssertions;

public class _Example1 implements AutoCloseable{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws IllegalStateException {
		// TODO Auto-generated method stub
		throw new IllegalThreadStateException("Cage door does not close");
		
	}

}
