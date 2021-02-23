package _8_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8_SystemInSample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String usrInput = reader.readLine();
        System.out.println("You entered the following :" + usrInput);
    }
}
