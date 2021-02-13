package DesignPatternByNavinReddy._2_BuilderDesignPattern;

// CREATIONAL PATTERN-- IT WILL BE HELPFUL TO CREATE AN OBJECT
//********* MAKE SURE YOU IMPLEMENT THIS WHEN YOU HAVE MULTIPLE PARAMETERS*********//

// Builder Design Pattern is How our Object is designed or how we call the variable of the class
// We can call variable as we wish..We can use all or we can use 1 or two.

// Problem 1 : We don't want to send all the perameters

// Problem 2 : We should know the sequence of parameter.


public class PhoneMain {
    public static void main(String[] args) {
        Phone phone = new Phone("Android","Qualcom",6.5,5000,12);
        System.out.println(phone.toString());

        Phone phone1 = new PhoneBuilder().setOs("IOS").setCamera(5).getPhone();

        System.out.println(phone1);
    }
}
