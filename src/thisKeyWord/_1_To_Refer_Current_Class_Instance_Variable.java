package thisKeyWord;

class Student {
    String name;
    int roll;
    float fee;

    Student(String name, int roll, float fee) {
        // instance variable = argument
        this.name = name;
        this.roll = roll;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", fee=" + fee +
                '}';
    }
}


public class _1_To_Refer_Current_Class_Instance_Variable {
    public static void main(String[] args) {
        Student student = new Student("mainul",25,2010);
        System.out.println(student.toString());

    }
}
// Student{name='null', roll=0, fee=0.0}