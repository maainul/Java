package thisKeyWord;


class Student2 {
    String name;
    int roll;
    float fee;

    Student2(String nameA, int rollA, float feeA) {
        // instance variable = argument
        name = nameA;
        roll = rollA;
        fee = feeA;
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



public class _2_ProgramWherethiskeywordisNotRequired {
    public static void main(String[] args) {
            Student2 student = new Student2("mainul",25,2010);
            System.out.println(student.toString());
    }
}
