package _8_io;

import java.io.Console;
import java.util.Arrays;

public class _11_PasswordCompareSample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console not available");
        } else {
            char[] password = console.readPassword("Enter your password");
            console.format("Enter Your password again");
            console.flush();

            char[] verify = console.readPassword();
            boolean match = Arrays.equals(password, verify);

            for (int i = 0; i < verify.length; i++) {
                verify[i] = 'x';
            }
            console.format("Your password was " + (match ? "Correct" : "Incorrect"));
        }
    }
}
