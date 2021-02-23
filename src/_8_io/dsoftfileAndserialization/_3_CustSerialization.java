package _8_io.dsoftfileAndserialization;

import java.io.*;

class Account implements Serializable{
    String name;
    transient int pass;

    public Account(String name, int pass) {
        this.name = name;
        this.pass = pass;
    }

    private void writeObject(ObjectOutputStream os) throws Exception{
        os.defaultWriteObject();
        int modifiedPassword = 100 + pass;
        os.writeObject(modifiedPassword);
    }

    private void readObject(ObjectInputStream objectInputStream ) throws Exception{
        objectInputStream.defaultReadObject();
        int modifiedPassword = (int) objectInputStream.readObject();
        pass = modifiedPassword -100;
    }
}

public class _3_CustSerialization {


    private static Account getObject(Account account, File file) throws IOException, ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (Account) objectInputStream.readObject();

    }

    private static void createObject(Account account, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(account);
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Account account = new Account("anik",123);
        File file = new File("test.ser");

        createObject(account,file);
        Account account1 = getObject(account,file);
        System.out.println(account1.name+"___________"+ account1.pass);

    }
}
