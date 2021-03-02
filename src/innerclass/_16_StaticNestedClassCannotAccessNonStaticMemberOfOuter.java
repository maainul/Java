package innerclass;

import interviewQuestions._removeFrequency;

public class _16_StaticNestedClassCannotAccessNonStaticMemberOfOuter {
    int a = 10;
    static int b = 20;
    static class Inner{
        int x = 100;
        static int y = 200;
        final static int z = 300;
        public void m1(){
            // Non-static field 'a' cannot be referenced from a static context
           //  System.out.println(a);

            System.out.println("Inner Class access Static Method of Outer "+b);
            System.out.println("Inner class non-static method ="+x);
            System.out.println("Inner class static method = "+y);
            System.out.println("Inner class final static method = "+z);
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.m1();
    }
}
