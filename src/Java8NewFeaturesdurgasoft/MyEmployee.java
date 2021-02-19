package Java8NewFeaturesdurgasoft;

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
