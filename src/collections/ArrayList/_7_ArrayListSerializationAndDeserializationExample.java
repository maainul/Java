package collections.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class _7_ArrayListSerializationAndDeserializationExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anik");
		al.add("sohel");
		al.add("mithu");
		
		try {
			// serialization
			FileOutputStream fos = new FileOutputStream("D:\\file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close(); 
			System.out.println("Success");
			 
			// Deserialization
			FileInputStream fis = new FileInputStream("D:\\file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			@SuppressWarnings("unchecked")
			ArrayList<String> list = (ArrayList<String>)ois.readObject();
			System.out.println(list);
			ois.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
