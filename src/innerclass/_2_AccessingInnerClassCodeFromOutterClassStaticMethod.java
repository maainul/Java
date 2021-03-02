package innerclass;

public class _2_AccessingInnerClassCodeFromOutterClassStaticMethod {
     class Inner{
        public void m1(){
            System.out.println("m1 method....");
        }
    }


    public static void main(String[] args) {
        _2_AccessingInnerClassCodeFromOutterClassStaticMethod outter = new _2_AccessingInnerClassCodeFromOutterClassStaticMethod();
        _2_AccessingInnerClassCodeFromOutterClassStaticMethod.Inner inner = outter.new Inner();
        inner.m1();
    }
}
