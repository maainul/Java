package fileIo;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        // Find How many Directory in this folder
        File file = new File("/home/onik/Code/");
        String[] s = file.list();
        for (String ss: s) {
            File dir = new File("/home/onik/Code/", ss);
            if (dir.isDirectory()){
              //  System.out.println(dir);
            }
        }
        System.out.println(s.length);



        File file2 = new File("abc.txt");
        System.out.println(file.exists());

        // File Writer
        FileWriter fileWriter = new FileWriter("abc.txt");
        fileWriter.write("mainul hasan");
        fileWriter.write("\n");
        fileWriter.write(100);
        fileWriter.write("true");
        fileWriter.flush();


        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("anik");

        bufferedWriter.newLine();
        bufferedWriter.write("anik");
        bufferedWriter.newLine();
        bufferedWriter.write("anik");
        bufferedWriter.newLine();
        bufferedWriter.write("anik");
        bufferedWriter.newLine();
        bufferedWriter.write(100);
        bufferedWriter.flush();

        PrintWriter printWriter = new PrintWriter("mn.txt");
        printWriter.println(100);

        printWriter.println("anik");
        printWriter.flush();
//
//        FileReader fileReader = new FileReader("abc.txt");
//        int i = fileReader.read();
//        while (i != -1){
//           // System.out.println((char) i);
//            i = fileReader.read();
//        }
//
//        FileReader fileReader1 = new FileReader("abc.txt");
//        char[] chars = new char[(int) file.length()];
//
//        fileReader1.read(chars);
//        for (char c : chars){
//            System.out.println(c);
//        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.txt"));
        String line = bufferedReader.readLine();
        while (line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }




    }
}
