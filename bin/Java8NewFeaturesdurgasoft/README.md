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
	public static void main(String[] args){
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
	public static void main(String[] args){
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
    public static void main(String[] args) {
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
    public static void main(String[] args) {
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

    public static void main(String[] args) {
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

    public static void main(String[] args) {
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
    public static void main(String[] args) {
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
    public static void main(String[] args) {
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
    public static void main(String[] args) {

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
	public static void main(String[] args) {
		I.m1();
	}
}

```
# Is it possible to declear main() in interface
```java
interface I{
	public static void main(String[] args) {
		sout("Inerface main method");
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
    public static void main(String[] args) {
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
    public static void main(String[] args) {
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
    public static void main(String[] args) {
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
import java.util.function.Predicate;

public class EmployeePredicateSalaryFinder {
    double salary;
    String name;

    public EmployeePredicateSalaryFinder(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public static void main(String[] args) {

        List<EmployeePredicateSalaryFinder> employeeList = Arrays.asList(
                new EmployeePredicateSalaryFinder(1122, "Bltu"),
                new EmployeePredicateSalaryFinder(6122, "Pintu"),
                new EmployeePredicateSalaryFinder(3122, "Nantu"),
                new EmployeePredicateSalaryFinder(8122, "Mnik"),
                new EmployeePredicateSalaryFinder(4122, "Mnik")
        );

        Predicate<EmployeePredicateSalaryFinder> predicate = obj1 -> obj1.salary > 3000;

        for (EmployeePredicateSalaryFinder obj1 : employeeList) {
            if (predicate.test(obj1) > 3000) {
                System.out.println(obj1.name + "------" + obj1.salary);
            }
        }
    }
}
```
## Using Predicate:
```java

```