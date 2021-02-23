package _8_io.dsoftfileAndserialization;

import oopConcept.abstractClass.C;

import java.io.*;

class Animal implements Serializable {
    int i = 100;
}

class Cow extends Animal {
    int j = 20;
}


public class _4_InheritanceInSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cow cow = new Cow();
        System.out.println(cow.i + "------" + cow.j);
        File file = new File("ttest.ser");
        createObject(cow, file);
        Cow cow1 = getObject(cow, file);
        System.out.println(cow1.i + "------" + cow1.j);

    }

    private static Cow getObject(Cow cow, File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (Cow) objectInputStream.readObject();

    }

    private static void createObject(Cow cow, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cow);
    }
}
