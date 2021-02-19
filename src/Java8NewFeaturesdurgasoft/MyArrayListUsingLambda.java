package Java8NewFeaturesdurgasoft;

import java.util.ArrayList;
import java.util.Collections;


public class MyArrayListUsingLambda {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(1);
        arraylist.add(10);
        arraylist.add(103);
        arraylist.add(120);
        arraylist.add(310);
        arraylist.add(31);

        System.out.println(arraylist);
        // 1 10 31 103 120 310
        Collections.sort(arraylist, (i1, i2) -> i2.compareTo(i1));

        System.out.println(arraylist);
        //  310 120 103 31 10 1
    }
}
