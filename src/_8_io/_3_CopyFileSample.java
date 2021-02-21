package _8_io;

import java.io.*;

// Page no - 421
public class _3_CopyFileSample {
    public static void copy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        File source = new File("/home/onik/data/zoo.txt");
        File destination = new File("/home/onik/data/zoooCopy.txt");
       // File destination = new File("/home/onik/data/zooCopy.txt");
        copy(source, destination);
    }
}
