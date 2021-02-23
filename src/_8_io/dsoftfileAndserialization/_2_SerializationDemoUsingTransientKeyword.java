package _8_io.dsoftfileAndserialization;

import java.io.*;

class Mobile implements Serializable{
    String name;
    transient int password;

    public Mobile(String name, int password) {
        this.name = name;
        this.password = password;
    }
}


public class _2_SerializationDemoUsingTransientKeyword {

    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Mobile m = new Mobile("Samsung Note 10",112233);
        File file = new File("tabc.ser");
        createObject(m,file);
        Mobile mobile = getObject(m,file);
        System.out.println(mobile.name+"___________"+ mobile.password);

    }

    private static Mobile getObject(Mobile m, File file) throws IOException, ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (Mobile) objectInputStream.readObject();

    }

    private static void createObject(Mobile m, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(m);
    }
}
