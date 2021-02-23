package _8_io;

import java.io.*;

public class _7_PrintWriterSample {
    public static void main(String[] args) throws IOException {
        File source = new File("/home/onik/data/zoo.log");
        try(PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(source)))){
            printWriter.print("Today's weather is :");
            printWriter.println("Sunny");
            printWriter.print("Today's temparature at zoo is :");
            printWriter.println(1/3.0);
            printWriter.println('c');
            printWriter.format("It has rained 10.12 inches this year");
            printWriter.println();
            printWriter.printf("It may rain 21.2 more inches this year");
        }

    }
}
