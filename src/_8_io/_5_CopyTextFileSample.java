package _8_io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class _5_CopyTextFileSample {
    public static void main(String[] args) throws IOException {
        File source = new File("/home/onik/data/zoo.csv");
        File destination = new File("/home/onik/data/zoo2Copy.csv");

        List<String> data = readFile(source);
        // print value
        for (String d : data) {
            System.out.println(d);
        }
        // write data to the file
        writeFile(data, destination);
    }

    private static void writeFile(List<String> data, File destination) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))) {
            for (String d : data) {
                bufferedWriter.write(d);
                bufferedWriter.newLine();
            }
        }
    }

    private static List<String> readFile(File source) throws IOException {
        List<String> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line = reader.readLine();
            while (line != null) {
                data.add(line);
                line = reader.readLine();
            }
        }
        return data;
    }
}