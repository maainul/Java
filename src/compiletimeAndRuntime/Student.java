package compiletimeAndRuntime;

public class Student {
    private String college = "OI";

    public String getCollege(){return college;}


    private int age;

    public void setAge(int age){
        this.age = age;
    }


    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getCollege());
        student.setAge(12);

    }
}
