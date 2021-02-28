package thisKeyWord;

/*
The this() constructor call should be used to reuse the constructor from the constructor.

It maintains the chain between the constructors i.e. it is used for constructor chaining
 */
class Employee {
    int age;
    int id;
    String name;
    String address;

    public Employee(int age, int id) {
        this.age = age;
        this.id = id;
    }

    public Employee(int age, int id, String name, String address) {
        this(age, id);
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}


public class _3_b_RealUseOfThis_Constructor_Call {
    public static void main(String[] args) {
        Employee employee = new Employee(20, 1, "Pintu", "Kailkur");
        System.out.println(employee.toString());

    }
}
