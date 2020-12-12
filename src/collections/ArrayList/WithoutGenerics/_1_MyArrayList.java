package collections.ArrayList.WithoutGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _1_MyArrayList {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        // add(int index, Object O)

        al.add(10);

        al.add("String");
        al.add(10);

        al.add("mainul");
        al.add(2, "hasan");


        // Iterator
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
        // list iterator
        ListIterator listIterator = al.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }


        // for loop
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println("For each");
        for (Object o : al
        ) {
            System.out.println(o);
        }

        System.out.println(al);

    }
}
