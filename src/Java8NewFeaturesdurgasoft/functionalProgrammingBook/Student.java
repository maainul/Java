package Java8NewFeaturesdurgasoft.functionalProgrammingBook;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiff(Student other){
        return age - other.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(12, "sakib"),
                new Student(42, "Rakib"),
                new Student(10, "Pakib")
        );

        List<Student> ascendingOrderOfStudent = students.stream()
                                                        .sorted((s1, s2) -> s1.getDiff(s2))
                                                        .collect(Collectors.toList());
        printArray("Normal Order of Student :",students);
        printArray("Ascending Order of Student :",ascendingOrderOfStudent);

        Comparator<Student> ascendingOrd = ( s1, s2) -> s1.getDiff(s2);

        List<Student> ascendingOrder = students.stream().sorted(ascendingOrd).collect(Collectors.toList());



        List<Student> ascendingOrderOfStudentUsingName = students.stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .collect(Collectors.toList());


        Function<Student, String> byName = s1 -> s1.getName();
        List<Student> asc = students
                            .stream()
                            .sorted(comparing(s1 -> s1.getAge()))
                            .collect(Collectors.toList());
        printArray("Sorted comparing",asc);
    }


    private static void printArray(String s ,List<Student> students) {
        System.out.println(s);
        students.forEach(student -> System.out.println(student.getAge() +"    "+student.getName()));
    }

}
