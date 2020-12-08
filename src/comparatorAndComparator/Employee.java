package comparatorAndComparator;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable {
    public int eid;
    public String name;

    public Employee() {
    }

    public Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int eid1 = this.eid;
        Employee e = (Employee) o;
        int eid2 = e.eid;
        if (eid1 < eid2) {
            return -1;
        } else if (eid1 > eid2) {
            return +1;
        } else {
            return 0;
        }
    }

}


class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Anik");
        Employee e2 = new Employee(01, "Ynik");
        Employee e3 = new Employee(11, "Snik");
        Employee e4 = new Employee(10, "Zaik");
        Employee e5 = new Employee(110, "Qnik");

        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);


        TreeSet t2 = new TreeSet(new MyComparator());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        System.out.println(t2);


    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        String s1 = e1.name;
        String s2 = e2.name;


        Integer I1 = e1.eid;
        Integer I2 = e2.eid;

        return I2.compareTo(I1);
    }
}