package innerclass;


interface Age{
    int x = 21;
    void getAge();
}

class MyClass implements Age{

    @Override
    public void getAge() {
        System.out.println("Age is = "+x);
    }
}


public class _9_AnonymusInnerClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.getAge();
    }
}
