package _6_ExceptionsAndAssertions;

public class _TurkeyCage implements AutoCloseable{

	public void close() {
		System.out.println("Close gate");
	}
	
	
	
	
	public static void main(String[] args) {
		try(_TurkeyCage turkeyCage = new _TurkeyCage();){
			System.out.println("Put turkeys in");
		}

	}

}
