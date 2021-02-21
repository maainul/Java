package _8_io;

import java.io.File;

// Page No - 410
public class _2_ReadFileInformation {
    public static void main(String[] args) {
        File file = new File("/home/onik/data/zoo.txt");
        // Check whether file available or not
        System.out.println("File exists :" + file.exists());
        if (file.exists()) {
            System.out.println("Absolute path :" + file.getAbsolutePath());
            System.out.println("Is Directory  :" + file.isDirectory());
            System.out.println("Parent path :" + file.getParent());
            if (file.isFile()) {
                System.out.println("File Size :" + file.length());
                System.out.println("Last Modified :" + file.lastModified());
            }
        } else {
            for (File subfile : file.listFiles()) {
                System.out.println(subfile.getName());
            }
        }
    }
}

/*
If file Present then output is :
    File exists :true
    Absolute path :/home/onik/data/zoo.txt
    Is Directory  :false
    Parent path :/home/onik/data
    File Size :0
    Last Modified :1613924969036

Else
      File exists :False

 */

