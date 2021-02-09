package lamdaExpressionJavaBrains.program_1;

public class Greeter {

	private void greet(Greeting greeting) {
		greeting.perform();

	}

	public static void main(String args[]) {
		Greeter greeter = new Greeter();

		Greeting myHello = () -> System.out.println("Hello world");

		Greeting innnerClassGreeting = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello world inner");

			}
		};

		greeter.greet(myHello);
		greeter.greet(innnerClassGreeting);
	}

}
