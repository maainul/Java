# Inner class :

Class inside a class is callded inner class

There are 4 types of Inner class:

1. Normal/Regualr Innerclass
2. Method Local Inner class
3. Anonymous Inner class
4. Staic nested class


# 1.Normal/Regular Innerclass
## 1. Cann't declear static method in the inner class.
```java
package innerclass;

public class _1_WeCannotDeclareStaticMethodInsideInnerClass {

    class Inner {

        // Inner classes cannot have static declarations
 /*       public static void m1() {
            System.out.println("Inner class.....");

        }
*/
    }

}
```
We can access innerclass From -
	1. Outer class Static method
	2. Non-static Area of Outer class
	3. Outside of Outer class
```java
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
```
# 2. Non-static Area of Outer class
```java
package innerclass;

public class _3_AccessingInnerClassFromFromInstanceAreaOfOutterClass {
    class Inner {
        public void m1() {
            System.out.println("M1 inner class...");
        }
    }

    public void m2() {
        Inner inner = new Inner();
        inner.m1();
    }

    public static void main(String[] args) {
        _3_AccessingInnerClassFromFromInstanceAreaOfOutterClass outer = new _3_AccessingInnerClassFromFromInstanceAreaOfOutterClass();
        outer.m2();
    }
}
```
# Outside of Outer class
```java
package innerclass;

class Outer {
    class Inner{
        public void m1(){
            System.out.println("Inner class m1");
        }
    }
}


public class _4_AccessingInnerClassFromOutSideOfOuterClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.m1();
        new Outer().new Inner().m1();
    }
}
```

Inner class can access Static or non static member from outer class.

Inner class can access static and non-static variable From Outer class

Inner class can access static and non-static method From the Outer class

```java
package innerclass;

// We can access Static or non static member from outer class
// can access static and non-static variable in the inner class
// can access static and non-static method in the inner class

public class _5_NormalInnerClass {
    int a = 10;
    static int b = 20;


    public void m2Outer() {
        System.out.println("M2 Outer");
    }


    public static void m3Outer(){
        System.out.println(b);
        System.out.println("m3 Outer");
    }

    class Inner {
        public void m1() {
            System.out.println("Instance method call = " + a);
            System.out.println("static method call = " + b);
        }


        public void m2() {
            m3Outer();
            m2Outer();
        }

    }

    public static void main(String[] args) {

        new _5_NormalInnerClass().new Inner().m1();

        new _5_NormalInnerClass().new Inner().m2();

    }
}

```
# Nested Inner classs
Inside Inner class We can declare another inner class
```java
package innerclass;

// // inside inner class we can declare another inner class
class OuterClass {
    static int b = 20;
    int a = 200;


    class B {
        public void m1B() {
            System.out.println("Call from Inner class A = " + a);
        }

        class C {
            public void m1() {
                System.out.println("Call from C = "+a);
                System.out.println("Call from b = "+b);
                System.out.println("C inner Class");
            }
        }
    }
}

public class _6_NestingOfInnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println("Outer class a = " + outer.a);
        OuterClass.B b = outer.new B();
        b.m1B();
        OuterClass.B.C c = new OuterClass().new B().new C();
        c.m1();

    }

}
```
# Method Local Inner class : Inner class inside a method
```java
package innerclass;

public class _7_MethodLocalInnerClass {

    int a = 10;
    static int b = 200;
    // declare inside non-static method
    public void m1(){
        final int x = 80;
        class Inner{
            public void add(){
                System.out.println("Method local m1 call from inner class variable = "+a);
                System.out.println("Method local m1 call from inner class variable = "+b);
                System.out.println(x);
                System.out.println("Test Inner for method local inner class");
            }
        }

        Inner inner = new Inner();
        inner.add();

    }

    public static void m2(){
        class Inner{
            public  void sub(){
                System.out.println("Static method call static variable = "+b);
                System.out.println("Static method inner class sub method");
            }
        }

        Inner inner = new Inner();
        inner.sub();
    }


    public static void main(String[] args) {
        _7_MethodLocalInnerClass outer = new _7_MethodLocalInnerClass();

        outer.m1();
        outer.m2();
    }
}
```

Method local inner class -
1. If method is non-static then we can call instance variable but we can't call static variable
2. If method is static then we can't call non static variable..

```java
package innerclass;

// Method local inner class -
// If method is non-static then we can call instance variable but we can't call static variable
// If method is static then we can't call non static variable..
public class _8_MethodLocalInnerClassTest {
    int i = 10;
    static int j = 50;

    public void m1() {
        int k = 100;
        final int m = 200;

        class Inner {
            public void m2() {
                System.out.println("Instance Member variable from Outside of inner class = " + i);
                System.out.println("Static Member variable from Outside of Inner class = " + j);
                System.out.println("Instance Local Variable from m1 method = "+k);
                System.out.println("Final Local Variable form m1 method = " +m);
            }
        }
        Inner inner = new Inner();
        inner.m2();
    }


    public static void m3() {
        int k = 100;
        final int m = 200;

        class Inner {
            public void m2() {

               // System.out.println("Instance Member variable from Outside of inner class = " + i);
                System.out.println("Static Member variable from Outside of Inner class = " + j);
                System.out.println("Instance Local Variable from m1 method = "+k);
                System.out.println("Final Local Variable form m1 method = " +m);
            }
        }
        Inner inner = new Inner();
        inner.m2();
    }

    public static void main(String[] args) {
        _8_MethodLocalInnerClassTest outer = new _8_MethodLocalInnerClassTest();
        outer.m1();
    }
}
```

# 3. Anonymous Inner class
Inner class that have no name.and one object is created.Interface and one time use class

```java
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
```
```java
package innerclass;

interface Age{
    int x = 21;
    void getAge();
}

public class _10_AnomymousInnerClassImplementation {
    public static void main(String[] args) {
        Age age = new Age() {
            @Override
            public void getAge() {
                System.out.println("Age is = "+x);
            }
        };
        age.getAge();
    }

}
```


# Anonymous Innerclass that extends another class
```java
package innerclass;
// https://www.geeksforgeeks.org/anonymous-inner-class-java/
public class _11_AnonymousInnerClassThatExtendsAnotherClass {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                System.out.println("Child threa");
            }
        };
        thread.start();
        System.out.println("Main Thread");
    }
}
```
# Annonomous Inner class that implements interface
```java
package innerclass;
// https://www.geeksforgeeks.org/anonymous-inner-class-java/
public class _12_AnonymousInnerClassThatImplementsRunnable {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Child class...");

            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Main Thread");
    }
}
```
# Annonomous inner class that defines inside method or constructor
```java
package innerclass;
// https://www.geeksforgeeks.org/anonymous-inner-class-java/
public class _13_AnonymousInnerClassThatDefinesInsideMethodOrConstructorArguments
{
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Child thread in inside Constructor argument");
            }
        });
        thread.start();
        System.out.println("Main thread starts");
    }
}
```
# 4.Static nested class : class can be static
```java
package innerclass;

public class _14_StaticNestedCLass {
    static class Inner{
        public void m1(){
            System.out.println("Static class m1 method");
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.m1();
    }
}

```
# Nested class can have main method
we can run static method inner class using cmd prompt
```java
package innerclass;

public class _15_NestedStaticClassCanHaveMainMethod {

    static class Inner {
        public static void main(String[] args) {
            System.out.println("Inner class Main method");
        }
    }

    public static void main(String[] args) {
        System.out.println("Outer class");
    }

}
```
# Static nested class cann't access non-static member of outer
```java
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
```
# We can write interface inside a class
```java
package innerclass;

public class _17_InterfaceInsideAClass {
    interface Vehicles{
        public int getNoOfWheels();
    }

    class Bus implements Vehicles{

        @Override
        public int getNoOfWheels() {
            return 4;
        }
    }


    class Auto implements Vehicles{

        @Override
        public int getNoOfWheels() {
            return 3;
        }
    }


}
```
# We can write interface inside interface
```java
package innerclass;

interface OuterInterface {
    public void m1();

    interface InnerInterface {
        public void m2();
    }
}


class Test1 implements OuterInterface {

    @Override
    public void m1() {
        System.out.println("M1 method of Outer is implemented");
    }
}


class Test2 implements OuterInterface.InnerInterface {

    @Override
    public void m2() {
        System.out.println("Inner Interface method implemented");
    }
}

public class _18_InterfaceInsideInterface {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.m1();

        Test2 test2 = new Test2();
        test2.m2();
    }
}
```
# Can write class inside interface
```java
package innerclass;

interface EmailService {
    public void sendEmail(EmailDetails details);

    class EmailDetails {
        String to_list;
        String to_cc;
        String subject;
        String body;
    }
}


public class _19_ClassInsideInterface {
}
```
