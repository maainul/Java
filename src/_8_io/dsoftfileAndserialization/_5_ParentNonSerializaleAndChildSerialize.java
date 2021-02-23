package _8_io.dsoftfileAndserialization;


import java.io.*;

class Flower {
    int i = 1000;
    Flower(){
        System.out.println("flower call");
    }
}

class Rose extends Flower implements Serializable{
    int j = 20;
}


public class _5_ParentNonSerializaleAndChildSerialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Rose flower = new Rose();
        System.out.println(flower.i + "------" + flower.j);
        File file = new File("ttest.ser");
        createObject(flower, file);
        Rose flower1 = getObject(flower, file);
        System.out.println(flower1.i + "------" + flower1.j);

    }

    private static Rose getObject(Rose flower, File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (Rose) objectInputStream.readObject();

    }

    private static void createObject(Rose flower, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(flower);
    }
}
