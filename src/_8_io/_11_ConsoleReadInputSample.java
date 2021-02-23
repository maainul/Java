package _8_io;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;

public class _11_ConsoleReadInputSample {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Console console = System.console();
        if (console == null){
            throw new RuntimeException("Console not availble");
        }else {
            console.writer().println("How excited you are about your trip today ?");
            console.flush();
            String exicementAnswer = console.readLine();
            String name = console.readLine("Please enter your name :");

            Integer age = null;
            console.writer().println("What is your Age ?");
            console.flush();
            BufferedReader reader = new BufferedReader(console.reader());
            String value = reader.readLine();
            age = Integer.valueOf(value);
            console.writer().println();

            console.format("Your name is : "+name);
            console.writer().println();

            console.format("Your age is :"+age);
            console.printf("Your excitment level is :"+ exicementAnswer);




        }

    }
}
