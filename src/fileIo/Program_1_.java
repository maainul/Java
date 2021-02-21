package fileIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Program_1_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("file3.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.txt"));
        String line = bufferedReader.readLine();
        while (line != null){
            printWriter.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader = new BufferedReader(new FileReader("mn.txt"));
        line = bufferedReader.readLine();
        while (line != null){
            printWriter.println(line);
            line = bufferedReader.readLine();
        }
        printWriter.flush();

    }
}
