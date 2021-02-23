package _8_io;

import java.io.Console;

public class _9_ConsolSample {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Enter anything you want");
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered the following : " + userInput);
        }
    }
}
