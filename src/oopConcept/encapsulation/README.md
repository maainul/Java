Encapsulation is defined as the wrapping up of data under a single unit. 
It is the mechanism that binds together code and the data it manipulates.
Other way to think about encapsulation is, 
it is a protective shield that prevents the data from being accessed by the code outside this shield. 

1. Technically in encapsulation, the variables or data of a class is hidden from any other class 
   and can be accessed only through any member function of own class in which they are declared. 
   
2. As in encapsulation, the data in a class is hidden from other classes using the data hiding concept 
which is achieved by making the members or methods of class as private and the class is exposed to 
the end user or the world without providing any details behind implementation using 
the abstraction concept, so it is also known as combination of data-hiding and abstraction.

3. Encapsulation can be achieved by: 
Declaring all the variables in the class as private and writing public methods in the class 
to set and get the values of variables.

Advantages of Encapsulation:

Data Hiding: The user will have no idea about the inner implementation of the class. 
It will not be visible to the user that how the class is storing values in the variables. 
He only knows that we are passing the values to a setter method and variables are getting 
initialized with that value.

Increased Flexibility: We can make the variables of the class as read-only or write-only depending on our requirement. If we wish to make the variables as read-only then we have to omit the setter methods like setName(), setAge() etc. from the above program or if we wish to make the variables as write-only then we have to omit the get methods like getName(), getAge() etc. from the above program

Reusability: Encapsulation also improves the re-usability and easy to change with new requirements.
    Testing code is easy: Encapsulated code is easy to test for unit testing.
    
    
```.java
package oopConcept.encapsulation;

class Student {
	private int rollno;
	private String nameString;
	private String idNumberString;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getIdNumberString() {
		return idNumberString;
	}

	public void setIdNumberString(String idNumberString) {
		this.idNumberString = idNumberString;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", nameString=" + nameString + ", idNumberString=" + idNumberString + "]";
	}

}

public class Main {

	public static void rotateDigit(String[] args) {
		Student obj = new Student();

		obj.setRollno(10);
		obj.setNameString("anik");
		obj.setIdNumberString("1510225887441");
		System.out.println(obj.toString());

	}

}
```

