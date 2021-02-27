
# Java static keyword
```
The static keyword in Java is used for memory management mainly. 
We can apply java static keyword with variables, methods, blocks and nested class. 
The static keyword belongs to the class than an instance of the class.

The static can be:
  1.	Variable (also known as a class variable)
  2.	Method (also known as a class method)
  3.	Block
  4.	Nested class
```
## 1. Java static variable:
```.java
Suppose there are 500 students in a college, 
now all instance data members will get memory each time when the object is created. 
All students have its unique rollno and name, so instance data member is good in such case. 
Here, "college" refers to the common property of all objects. 
If we make it static, this field will get the memory only once.
```
### Example without static variable
```.java
class Student{
    int rollno;
    String name;
    String college;
    
    Student(int r, String n, String c){
        rollno = r;
        name = n;
        college = c;
    }
    
    void display(){
        System.out.println(rollno+ " "+name+" "+college);
    }
}


public class Main{
    public static void rotateDigit(String args[]){
        Student student1 = new Student(111,"Mainul","IUBAT");
        Student student2 = new Student(121,"Hasan","IUBAT");
        student1.display();
        student2.display();
        
    }
}

OUtput:

111 Mainul IUBAT                                                                                                      
121 Hasan IUBAT

```
### Example with static variable
```.java
class Student{
    int rollno;
    String name;
    static String college = "IUBAT";
    
    Student(int r, String n){
        rollno = r;
        name = n;
      
    }
    
    void display(){
        System.out.println(rollno+ " "+name+" "+college);
    }
}


public class Main{
    public static void rotateDigit(String args[]){
        Student student1 = new Student(111,"Mainul");
        Student student2 = new Student(121,"Hasan");
        student1.display();
        student2.display();
        
    }
}

OUtput:

111 Mainul IUBAT                                                                                                      
121 Hasan IUBAT
```
## Program of the counter without static variable
```.java
//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
class Counter{  
  int count=0;//will get memory each time when the instance is created  
  
Counter(){  
  count++;//incrementing value  
  System.out.println(count);  
}  
  
public static void rotateDigit(String args[]){  
//Creating objects  
  Counter c1=new Counter();  
  Counter c2=new Counter();  
  Counter c3=new Counter();  
  }  
} 

Output:

1
1
1

```

## Program of counter by static variable

```
As we have mentioned above, static variable will get the memory only once, 
if any object changes the value of the static variable, it will retain its value.
```

```.java
    //Java Program to illustrate the use of static variable which  
    //is shared with all objects.  
    class Counter2{  
      static int count=0;//will get memory only once and retain its value  
      
    Counter2(){  
      count++;//incrementing the value of static variable  
      System.out.println(count);  
    }  
      
    public static void rotateDigit(String args[]){  
      //creating objects  
      Counter2 c1=new Counter2();  
      Counter2 c2=new Counter2();  
      Counter2 c3=new Counter2();  
      }  
    }  
   
Output:

1
2
3  
```
## 2) Java static method
```
If you apply static keyword with any method, it is known as static method.
    A static method belongs to the class rather than the object of a class.
    A static method can be invoked without the need for creating an instance of a class.
    A static method can access static data member and can change the value of it.
 ```
 ```
 What is a static method?
A static method is a method that belongs to a class, 
but its not belongs to an instance of that class and this method can be called
without the instance or object of that class.

What is an non-static method?
Every method in java is non-static method, but the methods must not have static keyword before method name. 
Non-static methods can access any static method and static variable also, 
without using the object of the class.
```
## Example Non-Static method
```.java
public class Main {
  int a=10;
  int b=20;

public static void rotateDigit(String args[]) {
  Main m = new Main();
  System.out.println("Value of a = " + m.a);
  System.out.println("Value of b = " + m.b);

 	}
}

Value of a = 10                                                                                                             
Value of b = 20
```
## Same example using Static keyword
```.java
public class Main {
  static int a;
  static int b;
  
  static {
      a = 10;
      b = 20;
  }

public static void rotateDigit(String args[]) {

  System.out.println("Value of a = " + a);
  System.out.println("Value of b = " + b);

 	}
}

Value of a = 10                                                                                                             
Value of b = 20
```
## Static method
```.java

class Student{
     int rollno;
     String name;
     static String college = "ITS";
     
     static void change(){
     college = "BBDIT";
     }

     Student(int r, String n){
     rollno = r;
     name = n;
     }

     void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class Main{
    public static void rotateDigit(String args[]){
    Student.change();//calling change method
    //creating objects
    Student s1 = new Student(111,"Karan");
    Student s2 = new Student(222,"Aryan");
    Student s3 = new Student(333,"Sonoo");
    //calling display method
    s1.display();
    s2.display();
    s3.display();
    }
}
Output:

111 Karan BBDIT                                                                                                             
222 Aryan BBDIT                                                                                                             
333 Sonoo BBDIT
```
```.java
class Main{  
  static int cube(int x){  
  return x*x*x;  
  }  
  
  public static void rotateDigit(String args[]){  
  int result=Main.cube(5);  
  System.out.println(result);  
  }  
} 

125
```
## Restrictions for the static method
```
There are two rotateDigit restrictions for the static method. They are:

    The static method can not use non static data member or call non-static method directly.
    this and super cannot be used in static context.
```
```.java   
   class A{  
     int a=40;//non static  
       
     public static void rotateDigit(String args[]){  
      System.out.println(a);  
     }  
    }    
 ```
## Q) Why is the Java rotateDigit method static?
```
It is because the object is not required to call a static method. 
If it were a non-static method, JVM creates an object first then call rotateDigit() method 
that will lead the problem of extra memory allocation.
```
## 3) Java static block

    Is used to initialize the static data member.
    It is executed before the rotateDigit method at the time of classloading.
```
## Example of static block
```.java
    class A2{  
      static{System.out.println("static block is invoked");}  
      public static void rotateDigit(String args[]){  
       System.out.println("Hello rotateDigit");  
      }  
    }  
```
## Q) Can we execute a program without rotateDigit() method?
```
Ans) No, one of the ways was the static block, but it was possible till JDK 1.6. 
Since JDK 1.7, it is not possible to execute a java class without the rotateDigit method.
```
```.java
class Main{  
  static{  
  System.out.println("static block is invoked");  
  System.exit(0);  
  }  
}
```
