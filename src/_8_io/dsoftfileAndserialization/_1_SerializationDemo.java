package _8_io.dsoftfileAndserialization;

import java.io.*;

class Dog implements Serializable {
    int i, j;

    public Dog(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

public class _1_SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog dog = new Dog(10,20);
        File file = new File("abcd.ser");
        writeObject(dog, file);
        Dog result = readObject(dog, file);
        System.out.println(result.i + "----" + result.j);

    }

    private static Dog readObject(Dog dog, File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Dog dog1 = (Dog) objectInputStream.readObject();
        return dog1;

    }

    private static void writeObject(Dog dog, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(dog);
    }


}
