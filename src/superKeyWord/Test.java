package superKeyWord;

class Base {
    public void baseMethod() {
        System.out.println("BaseMethod called ...");
    }
}

class Derived extends Base {
    public void baseMethod() {
        System.out.println("Derived method called ...");
    }
}

public class Test {
    public static final void main(String args[]) {
        Base b = new Derived();
        b.baseMethod();
    }
}  