package Java8NewFeaturesdurgasoft.functionalProgrammingBook;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListFiles {
    public static void main(String[] args) throws IOException {
//        Files.list(Paths.get("."))
//                .forEach(System.out::println);

        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);

        final File[] files = new File(".").listFiles(file -> file.isHidden());

        System.out.println(files);

    }
}
