package test.nestedClass;

public class Test {
	interface Vehicle {
		public void getNoOfWheels();

	}

	class Bus implements Vehicle {

		@Override
		public void getNoOfWheels() {
			System.out.println("Bus wheels =" + 6);
		}
	}

	class Auto implements Vehicle {
		@Override
		public void getNoOfWheels() {
			System.out.println("Auto wheels =" + 3);
		}
	}

}
