package thisKeyWord;

class OfficeEmployee {
    String name;
    int age;
    int salary;
    String address;


    OfficeEmployee(String name) {
        this.name = name;
    }

    OfficeEmployee(String name, int age) {
        this(name);
        this.age = age;
    }

    OfficeEmployee(String name, int age, int salary, String address) {
        this(name, age);
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "OfficeEmployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

}


public class _Constructor_Chaining {
    public static void main(String[] args) {
        OfficeEmployee officeEmployee = new OfficeEmployee("Khan", 24, 40000, "Barishal");
        System.out.println(officeEmployee.toString());
    }
}
