package _8_io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCode {
    public static void main(String[] args) throws IOException {
        File source = new File("/home/onik/data/zooCopy.txt");
        File destination = new File("/home/onik/data/MyCopy.txt");

        FileReader fileReader = new FileReader(source);
        FileWriter fileWriter = new FileWriter(destination);

        int i = fileReader.read();
        while (i != -1){
            fileWriter.write(i);
            i = fileReader.read();
        }
        fileWriter.flush();
    }
}
