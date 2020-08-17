package oopConcept.abstractClass;

abstract class Processor {
	public abstract String nameOfProcessor();
}

class Samsung extends Processor {
	public String nameOfProcessor() {
		return "Exinyos";
	}
}

class Apple extends Processor {
	public String nameOfProcessor() {
		return "Bionic";
	}
}

class Xiomi extends Processor {
	public String nameOfProcessor() {
		return "MediaTech";
	}
}

public class Test {
	public static void main(String args[]) {
		Apple apple = new Apple();
		System.out.println(apple.nameOfProcessor());

		Samsung samsung = new Samsung();
		System.out.println(samsung.nameOfProcessor());

		Xiomi xiomi = new Xiomi();
		System.out.println(xiomi.nameOfProcessor());
	}
}
