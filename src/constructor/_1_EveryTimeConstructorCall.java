package constructor;

public class _1_EveryTimeConstructorCall {

	public _1_EveryTimeConstructorCall() {
		System.out.println("Constructor call");
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		_1_EveryTimeConstructorCall obj1 = new _1_EveryTimeConstructorCall();
		@SuppressWarnings("unused")
		_1_EveryTimeConstructorCall obj2 = new _1_EveryTimeConstructorCall();
		@SuppressWarnings("unused")
		_1_EveryTimeConstructorCall obj3 = new _1_EveryTimeConstructorCall();

	}

}
