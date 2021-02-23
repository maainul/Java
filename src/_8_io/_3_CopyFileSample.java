package _8_io;

import java.io.*;

// Page no - 421
public class _3_CopyFileSample {
    public static void copy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int b = in.read();
            while (b  != -1) {
                out.write(b);
                b = in.read();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        File source = new File("/home/onik/data/zoo.txt");
        File destination = new File("/home/onik/data/zoooCopy.txt");
    }
}
