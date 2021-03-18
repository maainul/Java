# Java 8 New Features
1. Lambda Expression
2. Functional Interface
3. Multithreading with Anonymous Inner Class
4. Multithreading with Lambda Expression
5. Collections with lambda sort method
6. Default method in Interface
7. Static method in Interface
8. Predefined Functional Interface:
   1. Predicate
   2. Function
   3. Consumer
   4. Supplier
9. Two argument Predefined functional Interfaces
   1. BiPredicate
   2. BiFunctional
   3. BiConsumer
10. Primitive Functional Interfaces
    1. IntPredicate 
    2. IntFunction
    3. IntConsumer
    
11. Method References
    1. Reference to a Static Method
    2. Reference to an Instance Method 
    3. Reference to an Instance Method of an Object of a Particular Type
    4. Reference to a Constructor
11. Optional


# What is lambda expression

Lambda expression is annonymous function
lambda expression don't have 
1. return type
2. function name
3. modifier

```java
public void m1(){
	System.out.println("Hello")
		
}

public int add(int a, int b){
		System.out.println(a + b);
}


```

## equvalent lambda expression
```java
() -> System.out.println("Helo.....");

(a, b)-> return a + b;

```


# Rules :

1. If one variable we can remove ().
3. We can remove variable type
4. Without {} we can't use return keyword
5. with {} if we want to return some value compolsory we should use return statement


```java
n -> n * n;
n -> n * n; ------> vaild
n -> return n * n; -----> invalid
n -> {return n * n;}; --->valid
n -> {return n *n}; -----> invalid
n-> {n * n;}; ----> invalid

```

# What is Functional Interface?

Functinal interface have only one abstract method

This is optional.
We can modified Dirctly we can declare
We can take any number of default and static method within functional Interface
We can use @FunctionalInterface annotation in functional interface.
which contains single abstract method


Runnable ----> run()

Callable ----> call()

Comparable----> compareTo()

ActionListener--> actionPerformed()

# Functional Interface Example
```java
@FuncitonalInterface
interface A{
	public void m1(int a, int b);

	public void default(){

	}

}
```
```java
@FuncitonalInterface
interface A{
	public void m1();

	public default m2(){

	}

	public static m3(){

	}
}
```


```java
@FuncitonalInterface
interface A{
	public void m1();
}

class Demo implements A{
	public void m1(){
		System.out.println("Helo.....");
	}
}


class Test{
	public static void main(String[] args) {
		A a = new Test();
		a.m1();
	}
}

```

# Functional Interface with respected to Inheritance

```java
@FuncitonalInterface
interface A{
	public void m1();
}

@FuncitonalInterface
interface B extends A{


}
```


```java
@FuncitonalInterface
interface A{
	public void m1();
}

@FuncitonalInterface
interface B extends A{
	public void m1();

}
```
## Wrong Because method name is not same There are two abstract method
```java
@FuncitonalInterface
interface A{
	public void m1();
}
@FuncitonalInterface
interface B extends A{
	public void m2();

}
```
# Lambda Expressions with the functional interfaces

```java
@FuncitonalInterface
interface A{
	public void m1();

}


class Test{
	public static void main(String[] args) {
		A a = ()-> System.out.println("Helo");
		a.m1();
	}
}

```
# No need to write implements

```java
@FuncitonalInterface
interface A{
	 void m1(int a, int b);
}

class TestC{
	public static void main(String[] args) {
		A aa = (a,b)-> System.out.println(a + b);
		aa.m1(10,20);
	}
}
```

# Multithreading 

```java

class MyRunnable implements Runnable{
	public void run(){
		for (int i = 0;i < 10 ;i++ ) {
			System.out.println("Child Thread");
	}
}

class Test {
	public static void main(String[] args) {
			MyRunnable r = new MyRunnable();
			Thread t = new Thread(r);

			t.start();

			for (int i = 0;i < 10 ;i++ ) {
				System.out.println("Child Thread");
			}
	}
}
```
# Multithreading with lambda
```java
class TestAgain {
	public static void main(String[] args) {
			Runnable r = ()->{
				for (int i = 0;i < 10 ;i++ ) {
					System.out.println("Child Thread");
				}
			};

			Thread t = new Thread(r);

			t.start();

			for (int i = 0;i < 10 ;i++ ) {
				System.out.println("Main Thread");
			}
	}
}
```




# Collection :

```java

class MyComparator implements Comparator<Integer>{

	public int compare(Integer I1, Integer I2){
		
		if (I1 < I2) {
			return -1;
		}
		else if (I1 > I2) {
			return +1;
		}
		else{
			return 0;
		}
	}
}

class Test{
	public static void rotateDigit(String[] args){
		ArrayList<Integer> arraylist = new ArrayList<>();

		arraylist.add(1);
		arraylist.add(10);
		arraylist.add(103);
		arraylist.add(120);
		arraylist.add(310);
		arraylist.add(31);

		System.out.println(arraylist);
		// 1 10 31 103 120 310 
		Collections.short(arraylist, MyComparator());

		System.out.println(arraylist);
		//  310 120 103 31 10 1
	
	}
	
}


```

```java

class MyComparator implements Comparator<Integer>{

	public int compare(Integer I1, Integer I2){
		
		return I2.compareTo(I1);
	}
}

class Test{
	public static void rotateDigit(String[] args){
		ArrayList<Integer> arraylist = new ArrayList<>();

		arraylist.add(1);
		arraylist.add(10);
		arraylist.add(103);
		arraylist.add(120);
		arraylist.add(310);
		arraylist.add(31);

		System.out.println(arraylist);
		// 1 10 31 103 120 310 
		Collections.short(arraylist, MyComparator());

		System.out.println(arraylist);
		//  310 120 103 31 10 1
	
	}
	
}
````

# Collections in Lambda Expression
```java
package durgasoftJava8NewFeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MyArrayListUsingLambda {
    public static void rotateDigit(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(1);
        arraylist.add(10);
        arraylist.add(103);
        arraylist.add(120);
        arraylist.add(310);
        arraylist.add(31);

        System.out.println(arraylist);
        // 1 10 31 103 120 310
        Collections.sort(arraylist, (i1, i2) -> i2.compareTo(i1));

        System.out.println(arraylist);
        //  310 120 103 31 10 1
    }
}
```
# We can more modify using Method reference
```java
package durgasoftJava8NewFeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MyArrayListUsingLambda {
    public static void rotateDigit(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(1);
        arraylist.add(10);
        arraylist.add(103);
        arraylist.add(120);
        arraylist.add(310);
        arraylist.add(31);

        System.out.println(arraylist);
        // 1 10 31 103 120 310
        arraylist.sort(Comparator.reverseOrder);

        System.out.println(arraylist);
        //  310 120 103 31 10 1
    }
}
```

# Customized Class Employee sorting with normal Method then we will see lambda
```java
package durgasoftJava8NewFeatures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyEmployee {
    int eno;
    String name;

    public MyEmployee(int eno, String name) {
        this.eno = eno;
        this.name = name;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyEmployee{" +
                "eno=" + eno +
                ", name='" + name + '\'' +
                '}';
    }

    public static void rotateDigit(String[] args) {
        //MyEmployee myEmployee = new MyEmployee();
        List<MyEmployee> employeeList = Arrays.asList(
                new MyEmployee(1122, "Bltu"),
                new MyEmployee(6122, "Pintu"),
                new MyEmployee(3122, "Nantu"),
                new MyEmployee(8122, "Mnik"),
                new MyEmployee(4122, "Mnik")
        );

        System.out.println("*************Before Sorted **************");
        employeeList.forEach(System.out::println);
        Collections.sort(employeeList, new MySortedEmployee());

        System.out.println("*************After Sorted Ascending Order**************");
        employeeList.forEach(obj -> System.out.println(obj));


        System.out.println("*************After Sorted Descending Order**************");
        Collections.sort(employeeList, new MyDescendingOrder());
        employeeList.forEach(obj -> System.out.println(obj));


    }
}

class MySortedEmployee implements Comparator<MyEmployee> {

    @Override
    public int compare(MyEmployee myEmployee1, MyEmployee myEmployee2) {
        Integer i1 = myEmployee1.getEno();
        Integer i2 = myEmployee2.getEno();
        return i1.compareTo(i2);
    }
}

class MyDescendingOrder implements Comparator<MyEmployee> {

    @Override
    public int compare(MyEmployee myEmployee1, MyEmployee myEmployee2) {
        Integer i1 = myEmployee1.getEno();
        Integer i2 = myEmployee2.getEno();
        return -i1.compareTo(i2);
    }
}

```
# Now Let's Try with Lambda Expression
```java

package durgasoftJava8NewFeatures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyEmployeeSortedUsingLambda {
    int eno;
    String name;

    public MyEmployeeSortedUsingLambda(int eno, String name) {
        this.eno = eno;
        this.name = name;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyEmployee{" +
                "eno=" + eno +
                ", name='" + name + '\'' +
                '}';
    }

    public static void rotateDigit(String[] args) {
        //MyEmployee myEmployee = new MyEmployee();
        List<MyEmployee> employeeList = Arrays.asList(
                new MyEmployee(1122, "Bltu"),
                new MyEmployee(6122, "Pintu"),
                new MyEmployee(3122, "Nantu"),
                new MyEmployee(8122, "Mnik"),
                new MyEmployee(4122, "Mnik")
        );

        System.out.println("*************Before Sorted **************");
        employeeList.forEach(System.out::println);
        Collections.sort(employeeList, (myEmployee1, myEmployee2) -> {
            Integer i1 = myEmployee1.getEno();
            Integer i2 = myEmployee2.getEno();
            return i1.compareTo(i2);
        });


        System.out.println("*************After Sorted Ascending Order**************");
        employeeList.forEach(System.out::println);


        System.out.println("*************After Sorted Descending Order**************");
        Collections.sort(employeeList, (e1,e2) -> -e1.name.compareTo(e2.name));

        employeeList.forEach(System.out::println);
    }
}

```

# Annonymous Inner Class:
```java
package durgasoftJava8NewFeatures;

public class ImplementThreadAnnonymousInnerClass {
    public static void rotateDigit(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}

```

# Relace with lambda expression

```java
package durgasoftJava8NewFeatures;

public class ReplaceWithLambda {
    public static void rotateDigit(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        };
        Thread thread = new Thread(r);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}

```
# More Customized/Minimized
```java
package durgasoftJava8NewFeatures;

public class ReplaceWithLambda {
    public static void rotateDigit(String[] args) {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        });

        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}

```
# Cautions :
If anonymous inner class implements an interface that contains single abstract method then only we can replace that annonymous inner class with lambdaa expressions.

# Default method / Virtual Extension method/ Defender Method

without effecting implementation class if we want to add method this type of method is called default method.

```java
interface I{
	public void m1();
	public void default m2(){

	}
}
```
You can override or not...
we are not allowed to use object class method with default method
 hashcode
 toString()
 equals
 wait()
 notify()
 notifyall()

Interface static method shoul be called only by usng Interface name only.
```java
interface I{
	public static void m1(){
		sout("dfafd")
	}
}


class Test implements I{
	public static void rotateDigit(String[] args) {
		I.m1();
	}
}

```
# Is it possible to declear rotateDigit() in interface
```java
interface I{
	public static void rotateDigit(String[] args) {
		sout("Inerface rotateDigit method");
	}
}
```
we can write it by using cmd prompt

## Predefined Functional Interface:
    1. Predicate
    2. Function
    3. Consumer
    4. Supplier
## Two argument Predefined functional Interfaces
    1. BiPredicate
    2. BiFunctional
    3. BiConsumer
## Primitive Functional Interfaces
    1. IntPredicate
    2. IntFunction
    3. IntConsumer
lot more............😇

# predicate : conditional Check

### prototype of predicate
```java
interface Predicate<T>{
    public boolean test(T t);
}
```
## Normal even odd check : 10 even or odd
```java
public boolean test(Integer I){
    
    if(i % 2 == 0){
        return true;
        }else{
        false;
        }
    }   
```
## Lambda expression check : 10 even or odd
```java
(Integer I) -> I % 2 == 0;
or 
I-> I % 2 == 0;
```
## Write a program for test even odd
```java
package Java8NewFeaturesdurgasoft;

import java.util.function.Predicate;

public class PredicateExample {
    public static void rotateDigit(String[] args) {
        Predicate<Integer> p1 = i -> i %2 == 0;
        System.out.println(p1.test(10));
        System.out.println(p1.test(20));
        System.out.println(p1.test(31));
    }
}
```
## Write a program to find name from String length is greater than 5
```java
package Java8NewFeaturesdurgasoft;

public class FIndNameLength {
    public static void rotateDigit(String[] args) {
        String[] names = {"mainul","Poltuu","Boltu","Moontu"};

        for (String name : names){
            if (name.length() > 5){
                System.out.println(name);
            }
        }
    }
}
```
## We can create Predicate for conditional checking
```java
package Java8NewFeaturesdurgasoft;

import java.util.function.Predicate;

public class FIndNameLength {
    public static void rotateDigit(String[] args) {
        String[] names = {"mainul", "Poltuu", "Boltu", "Moontu"};
        Predicate<String> predicate = name -> name.length() > 5;
        for (String name : names) {
            if (predicate.test(name)) {
                System.out.println(name);
            }
        }
    }
}

```
## Find Employee Which salary is greater than 3000
```java
package Java8NewFeaturesdurgasoft;

import java.util.Arrays;
import java.util.List;

public class EmployeePredicateSalaryFinder {
    double salary;
    String name;

    public EmployeePredicateSalaryFinder(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public static void rotateDigit(String[] args) {

        List<EmployeePredicateSalaryFinder> employeeList = Arrays.asList(
                new EmployeePredicateSalaryFinder(1122, "Bltu"),
                new EmployeePredicateSalaryFinder(6122, "Pintu"),
                new EmployeePredicateSalaryFinder(3122, "Nantu"),
                new EmployeePredicateSalaryFinder(8122, "Mnik"),
                new EmployeePredicateSalaryFinder(4122, "Mnik")
        );
        
        for (EmployeePredicateSalaryFinder obj1 : employeeList) {
            if (obj1.salary > 3000) {
                System.out.println(obj1.name + "------" + obj1.salary);
            }
        }
    }
}
```
## Using Predicate:
```java
package Java8NewFeaturesdurgasoft;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeePredicateSalaryFinder {
    double salary;
    String name;

    public EmployeePredicateSalaryFinder(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public static void rotateDigit(String[] args) {

        List<EmployeePredicateSalaryFinder> employeeList = Arrays.asList(
                new EmployeePredicateSalaryFinder(1122, "Bltu"),
                new EmployeePredicateSalaryFinder(6122, "Pintu"),
                new EmployeePredicateSalaryFinder(3122, "Nantu"),
                new EmployeePredicateSalaryFinder(8122, "Mnik"),
                new EmployeePredicateSalaryFinder(4122, "Mnik")
        );
        Predicate<EmployeePredicateSalaryFinder> predicate = obj1 -> obj1.salary > 3000;
        for (EmployeePredicateSalaryFinder obj1 : employeeList) {
            if (predicate.test(obj1)) {
                System.out.println(obj1.name + "------" + obj1.salary);
            }
        }
    }
}
```

# Funtion :

1. It is also predefined functional interface.
2. Return type not fixed can return anything
3. Compolsory We should have provide return type based on our return value

4. Predicate contain test method and Function contain apply method

input-----> perform operation----> output

4----> square operation---> 16

## Prototype of Function
```java
interface Function<T,R>{
    public R apply (T t);
}
```

## Example calculate sqr of a number
```java
package Java8NewFeaturesdurgasoft;

import java.util.function.Function;

public class SquareUsingFunction {
    public static void rotateDigit(String[] args) {
        Function<Integer,Integer> function = i -> i * i ;
        System.out.println(function.apply(10));
        System.out.println(function.apply(5));
    }
}
```
## Example second : length,uppercase

```java
package Java8NewFeaturesdurgasoft;

import java.util.function.Function;

public class SquareUsingFunction {
    public static void rotateDigit(String[] args) {
        // sqr
        Function<Integer,Integer> function = i -> i * i ;
        System.out.println(function.apply(10));
        System.out.println(function.apply(5));
        // count string length
        Function<String,Integer> function1 = String::length;

        System.out.println(function1.apply("Mainul hasan"));
        // Upper case
        Function<String, String> function2 = s -> s.toUpperCase();
        System.out.println(function2.apply("mainul hasan"));
    }
}
```
## Example 3 : Student
```java
package Java8NewFeaturesdurgasoft;

import java.util.function.Function;

class StudentInfo{
    String name;
    int marks;

    public StudentInfo(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class Student {
    public static void rotateDigit(String[] args) {
        Function<StudentInfo,String> function = s -> {
            int marks = s.marks;
            String grade="";
            if (marks >= 80) grade= "A[Distinction]";
            else if(marks>= 60) grade = "B[First Class]";
            else if(marks>= 50) grade = "C[Second Class]";
            else if(marks>= 35) grade = "D[Third Class]";
            else grade = "G[Failed]";
            return grade;
        };

        StudentInfo[] s = {
                new StudentInfo("ANik",100),
                new StudentInfo("BNik",65),
                new StudentInfo("CNik",55),
                new StudentInfo("DNik",20),
        };

        for (StudentInfo student : s){
            System.out.println(student.name);
            System.out.println(student.marks);
            System.out.println(function.apply(student));
            System.out.println();
        }
    }
}
```

## Using Function and Predicate Together
```java
package Java8NewFeaturesdurgasoft;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

class StudentInfo{
    String name;
    int marks;

    public StudentInfo(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class Student {
    public static void rotateDigit(String[] args) {
        Function<StudentInfo,String> function = s -> {
            int marks = s.marks;
            String grade="";
            if (marks >= 80) grade= "A[Distinction]";
            else if(marks>= 60) grade = "B[First Class]";
            else if(marks>= 50) grade = "C[Second Class]";
            else if(marks>= 35) grade = "D[Third Class]";
            else grade = "G[Failed]";
            return grade;
        };

        Predicate<StudentInfo> studentInfoPredicate = s -> s.marks >= 60;

        StudentInfo[] s = {
                new StudentInfo("ANik",100),
                new StudentInfo("BNik",65),
                new StudentInfo("CNik",55),
                new StudentInfo("DNik",20),
        };
        System.out.println(Arrays.toString(s));

        for (StudentInfo student : s){
            if (studentInfoPredicate.test(student)){
                System.out.println(student.name);
                System.out.println(student.marks);
                System.out.println(function.apply(student));
                System.out.println();
            }
        }
    }
}
```
# Consumar :

1. It is also predefined functional interface.
2. No return type. It return anything/ void
3. Predicate contain test method and Function contain apply method

input-----> perform operation----> no output

4----> square operation---> no output/void return

```java
interface Consumer<T>
{
    public void accept(T t);
}
```
## Example 1
```java
package Java8NewFeaturesdurgasoft;
import java.util.function.Consumer;
public class ConsumerTest {
    public static void rotateDigit(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Mainul Hasan");
        consumer.accept("Hello");

    }
}
```
## Example 2 : Student information
```java
package Java8NewFeaturesdurgasoft;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class StudentInfo {
    String name;
    int marks;

    public StudentInfo(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
public class Student {
    public static void rotateDigit(String[] args) {
        Function<StudentInfo, String> function = s -> {
            int marks = s.marks;
            String grade = "";
            if (marks >= 80) grade = "A[Distinction]";
            else if (marks >= 60) grade = "B[First Class]";
            else if (marks >= 50) grade = "C[Second Class]";
            else if (marks >= 35) grade = "D[Third Class]";
            else grade = "G[Failed]";
            return grade;
        };

        Predicate<StudentInfo> studentInfoPredicate = s -> s.marks >= 60;

        Consumer<StudentInfo> consumer = student -> {
            if (studentInfoPredicate.test(student)) {
                System.out.println(student.name);
                System.out.println(student.marks);
                System.out.println(function.apply(student));
                System.out.println();
            }
        };
        StudentInfo[] s = {
                new StudentInfo("ANik", 100),
                new StudentInfo("BNik", 65),
                new StudentInfo("CNik", 55),
                new StudentInfo("DNik", 20),
        };
        for (StudentInfo s1 : s) {
            consumer.accept(s1);
        }
    }
}
```
Predicate : Take some input and perform some conditional check and returns boolean value

Function : Take some input and perform some operation and return the result which is need not be booolean type

Consumer : Accept some input and perform operations and not required to return anything

# Supplier :
Just supply my required objects and it won't take any input

## Prototype 
```java
interface Supplier<R>{
    public R get();
}
```
## Show me the date using Supplyer
```java
package Java8NewFeaturesdurgasoft;
import java.util.Date;
import java.util.function.Supplier;
public class SupplierDate {
    public static void rotateDigit(String[] args) {
        Supplier<Date> dateSupplier = () -> new Date();
        System.out.println(dateSupplier.get());
        
        Supplier<String> otpsupplier = () ->{
            String otp = "";
            for (int i = 0; i <6; i++){
                otp += (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(otpsupplier.get());
    }
}
```
- Predicate --> test()
- Function ---> apply()
- Consumer ---> accept()
- Supplier----> get()

**Normal predicate take only one argument.<br/>
But if we need two argument what we have to do...<br/>
Suppose we can to add two numbers then what will be the Functional interface<br/>
we can BiPredicate**
# BiPredicate
which take two argumet

## Prototype:
```java
interface BiPredicate<T1,T2>{
    public boolean test(T1 t1, T2 t2){
        
    }
}
```
## Program for BiPredicate :Add two number and find odd/even

```java
package Java8NewFeaturesdurgasoft;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void rotateDigit(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a,b) -> (a + b) %2 == 0;
        System.out.println(biPredicate.test(10,21));
    }
}
```
# Primitive Predicate
- IntPresicate
- LongPredicate
- DoublePredicate     
# Predicate Function
- IntFunction
- DoubleFunction
- LongFunction
# Supplier
1. BooleanSupplier
    - boolean getAsBoolean
2. IntSupplier
    - int getAsInt
3. LongSupplier
    - long getAsLong
4. DoubleSupplier
    - double getAsDouble

# Method and Constructor Reference
Not done

# Streams 
# What is Stream?
Stream represents a sequence of objects from a source
Following are the characteristics of a Stream −

![java-streams](https://user-images.githubusercontent.com/37740006/108598826-3b3e9300-73ba-11eb-8869-bd13ecc4d776.png)

1. Sequence of elements − A stream provides a set of elements of specific type in a sequential manner. A stream gets/computes elements on demand. It never stores the elements.

2. Source − Stream takes Collections, Arrays, or I/O resources as input source.

3. Aggregate operations − Stream supports aggregate operations like 
    - filter, 
    - map, 
    - limit, 
    - reduce, 
    - find, 
    - match
4. Pipelining − Most of the stream operations return stream itself so that their result can be pipelined. These operations are called intermediate operations and their function is to take input, process them, and return output to the target. 
5. collect() method is a terminal operation which is normally present at the end of the pipelining operation to mark the end of the stream.

6. Automatic iterations − Stream operations do the iterations internally over the source elements provided, in contrast to Collections where explicit iteration is required.

# Stream Operations

1. Intermediate Operations
- filter()
- map()
- flatMap()
- distinct()
- sorted()
- peek()
- limit()
- skip()
2. Terminal Operations
- forEach()
- forEachOrdered()
- toArray()
- reduce()
- collect()
- min()
- max()
- count()
- anyMatch()
- allMatch()
- noneMatch()
- findFirst()
- findAny()
# Creating Stream 
## https://howtodoinjava.com/java8/java-streams-by-examples/
```java
package Java8NewFeaturesdurgasoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
public static void rotateDigit(String[] args) {
// Stream.of()
Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
stream.forEach(p -> System.out.println(p));
// stream.of(array)
Stream arrayStream = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
arrayStream.forEach(p -> System.out.println(p));
// List.stream()
List<Integer> list = new ArrayList<>();
for (int i = 0; i < 10; i++) {
list.add(i);
}
Stream<Integer> listStream = list.stream();
listStream.forEach(p -> System.out.println(p));
// Stream.generate() or Stream.iterate()
Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
randomNumbers.limit(20).forEach(System.out::println);

        // Stream Collectors
        // Collect Stream elements to a List
        List<Integer> liist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            liist.add(i);
        }
        Stream<Integer> stream1 = liist.stream();
        List<Integer> evenNumberList = stream1.filter(i -> i % 2 == 0).collect(Collectors.toList());
        evenNumberList.forEach(System.out::println);
        //  Collect Stream elements to an Array
        List<Integer> listA = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listA.add(i);
        }
        Stream<Integer> stream2 = listA.stream();
        Integer[] o = stream2.filter(i -> i % 2 == 0).toArray(Integer[]::new);

        // Intermediate Operations
        // stream.filter()
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);
        /*
        Amitabh
        Aman
         */
        // Stream.map()
        memberNames.stream()
                .filter((s) -> s.startsWith("A")) // take prdicate
                .map(String::toUpperCase) //
                .forEach(System.out::println);
        /*
        AMITABH
        AMAN
         */
        memberNames.stream()
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        /*
        AMAN
        AMITABH
        LOKESH
        RAHUL
        SALMAN
        SHAHRUKH
        SHEKHAR
        YANA
         */
        // Stream.forEach()
        memberNames.forEach(System.out::println);

        // Stream.collect()
        List<String> memNamesInUppercase =
                memberNames.stream()
                        .sorted()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

        System.out.print(memNamesInUppercase);
//[AMAN, AMITABH, LOKESH, RAHUL, SALMAN, SHAHRUKH, SHEKHAR, YANA]
// Stream.match()

        boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));

        System.out.println(matchedResult);
        // Stream.count()
        long totalMatched =
                memberNames.stream()
                        .filter((s) -> s.startsWith("A"))
                        .count();

        System.out.println(totalMatched);
        // Stream.anyMatch()
        boolean matched = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matched);

        // Stream.findFirst()
        String firstMatchedName = memberNames.stream()
                .filter((s) -> s.startsWith("L"))
                .findFirst()
                .get();

        System.out.println(firstMatchedName);

    }
}
```
# Product Example with stream 
# First let's see Product without stream
```java
package Java8NewFeaturesdurgasoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStreamExample {
    public static void rotateDigit(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> productPriceList = new ArrayList<>();
        for (Product product : productsList) {
            // filtering data of list
            if (product.price < 30000) {
                // adding product to the list
                productPriceList.add(product.price);
            }
        }
        System.out.println(productPriceList);
    }
}
```
# Using Stream
```java
package Java8NewFeaturesdurgasoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStreamExample {
    public static void rotateDigit(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> productPriceList = new ArrayList<>();
        for (Product product : productsList) {
            // filtering data of lista
            if (product.price < 30000) {
                // adding product to the list
                productPriceList.add(product.price);
            }
        }
        System.out.println(productPriceList);

        List<Float> productList2 = productsList.stream()
                .filter(p -> p.price > 30000)
                .map(p -> p.price)
                .collect(Collectors.toList());

        System.out.println(productList2);

        productsList.stream()
                .filter(p -> p.price == 30000)
                .forEach(p -> System.out.println(p.name));
    }
}
```
















