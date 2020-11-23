package oca;

public class _4_4_ReferenceType {

	public static void main(String[] args) {
		_4_4_ReferenceType r = new _4_4_ReferenceType();

		r.fly("String");
		r.fly(56);
	
	}
	private void fly(String string) {
		System.out.println("string");
		
	}
	
	private void fly(Object o) {
		System.out.println("test");
		
	}

}
