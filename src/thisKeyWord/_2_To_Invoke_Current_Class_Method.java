package thisKeyWord;

class A{
    public void m(){
        System.out.println("Method 1");
    }


    public void n(){
        System.out.println("This is N method");
        m();
    }
}

public class _2_To_Invoke_Current_Class_Method {
    public static void main(String[] args) {
        A a = new A();
        a.n();

    }
}
