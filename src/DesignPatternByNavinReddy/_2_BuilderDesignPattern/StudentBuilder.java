package DesignPatternByNavinReddy._2_BuilderDesignPattern;

public class StudentBuilder {
    int id;
    String name;
    int age;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Student getStudent(){
        return new Student(id,name,age);
    }
}
