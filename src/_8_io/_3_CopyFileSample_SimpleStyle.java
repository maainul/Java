package _8_io;

import java.io.*;

public class _3_CopyFileSample_SimpleStyle {
    public static void main(String[] args) throws IOException {
        File source = new File("/home/onik/data/zoo.txt");
        File destination = new File("/home/onik/data/My2Copy.txt");

        InputStream fileReader = new FileInputStream(source);
        OutputStream fileWriter = new FileOutputStream(destination);

        int i = fileReader.read();
        System.out.println(i);
        while (i != -1){
            fileWriter.write(i);
            i = fileReader.read();
        }
        fileWriter.flush();
    }
}
