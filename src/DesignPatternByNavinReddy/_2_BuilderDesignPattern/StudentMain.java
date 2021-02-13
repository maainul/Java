package DesignPatternByNavinReddy._2_BuilderDesignPattern;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(1,"mainul",25);
        System.out.println(student);


        Student student1 = new StudentBuilder().setId(2).setName("Hasan").getStudent();
        System.out.println(student1);
    }
}
