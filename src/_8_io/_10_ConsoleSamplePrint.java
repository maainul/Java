package _8_io;

import java.io.Console;

public class _10_ConsoleSamplePrint {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console is not available");
        } else {
            console.writer().println("Welcome to Our zoo");
            console.format("Our zoo has 391 animals and 25 employees");
            console.writer().println();
            console.printf("The zoo spans 128.91 acres");
        }
    }
}
