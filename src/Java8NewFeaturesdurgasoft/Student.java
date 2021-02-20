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
    public static void main(String[] args) {
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
