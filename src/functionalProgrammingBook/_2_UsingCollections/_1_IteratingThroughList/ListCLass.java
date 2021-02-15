package functionalProgrammingBook._2_UsingCollections._1_IteratingThroughList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
// Using Collections
public class ListCLass {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList(
                "Fakhrul",
                "Kamrul",
                "Abdullah"
        );

        // Throught iterator
        System.out.println("******Iterator ****");
        Iterator iterator = friends.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Style for loop
        System.out.println("****For Loop Approach");
        for (int i = 0; i <friends.size(); i++){
            System.out.println(friends.get(i));
        }

        // second approach FOr each Loop
        System.out.println("****For Each Approach******");
        for(String name: friends){
            System.out.println(name);
        }


        // iterable inner class
        System.out.println("********Iterable Anonymous Inner class********");
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(final String s) {
                System.out.println(s);
            }
        });

        // replacing Anonymous inner class with lambda expression
        System.out.println("*****replacing Anonymous inner class with lambda expression*******");
        friends.forEach((final String name) -> System.out.println(name));

        // without Type Information
        System.out.println("*****without Type Information******");
        friends.forEach((name)-> System.out.println(name));

        // If single parameter we can remove ()
        System.out.println("***** If single parameter we can remove ()****");
        friends.forEach(name -> System.out.println(name));


        // replacing Anonymous inner class with lambda expression
        System.out.println("*****replacing lambda expression with method reference *******");
        friends.forEach(System.out::println);



    }
}
