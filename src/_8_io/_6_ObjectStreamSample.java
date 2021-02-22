package _8_io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private char type;

    public Animal(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }
}

public class _6_ObjectStreamSample {

    // Serialization
    public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {

        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Animal animal : animals) {
                out.writeObject(animal);
            }
        }

    }
    // deserialization

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Tommy tiger", 5, 'T'));
        animals.add(new Animal("Peter Penguin", 8, 'P'));

        File datafile = new File("animal.data");
        createAnimalsFile(animals, datafile);
        System.out.println(getAnimals(datafile));

    }

    private static List<Animal> getAnimals(File datafile) throws IOException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(datafile)))) {
            while (true) {
                Object object = in.readObject();
                if (object instanceof Animal) {
                    animals.add((Animal) object);
                }

            }
        } catch (EOFException e) {
            e.printStackTrace();
        }
        return animals;

    }
}
