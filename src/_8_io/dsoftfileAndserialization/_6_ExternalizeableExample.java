package _8_io.dsoftfileAndserialization;

import java.io.*;

class Parent implements Externalizable {
    String string;
    int i;
    int j;

    public Parent() {
        System.out.println("Parent call");
    }

    public Parent(String string, int i, int j) {
        this.string = string;
        this.i = i;
        this.j = j;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(string);
        objectOutput.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        string = (String) objectInput.readObject();
        i = (int) objectInput.readInt();
    }
}


public class _6_ExternalizeableExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Parent p = new Parent("mainul", 2, 23);
        File file = new File("exter.ser");
        createObject(p, file);
        Parent result = getObject(p, file);
        System.out.println(result.string + "----" + result.i + "-----" + result.j);

    }

    private static Parent getObject(Parent p, File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (Parent) objectInputStream.readObject();
    }

    private static void createObject(Parent p, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(p);
    }
}
