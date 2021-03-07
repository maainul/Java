package comparatorAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id =id;
        this.name =name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(12,"Anik"));
        studentArrayList.add(new Student(1,"Anik"));
        studentArrayList.add(new Student(21,"Anik"));
        studentArrayList.add(new Student(5,"Anik"));

        System.out.println(studentArrayList);
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                Integer integer1 = s1.id;
                Integer integer2 = s2.id;
                return integer1.compareTo(integer2);
            }
        });
        System.out.println(studentArrayList);
    }
}
