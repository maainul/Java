package functionalProgrammingBook._8_JoiningElements;

import java.util.Arrays;
import java.util.List;

public class JoiningElements {
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        for (String name: names
             ) {
            System.out.print(name + ",");
        }
        System.out.println();
        for(int i = 0; i < names.size(); i++){
            System.out.print(names.get(i) + ",");
        }

        if(names.size() > 0)
            System.out.println(names.get(names.size() - 1));

        System.out.println(String.join(", ", names));
    }
}
