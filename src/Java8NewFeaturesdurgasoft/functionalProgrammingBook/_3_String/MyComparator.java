package Java8NewFeaturesdurgasoft.functionalProgrammingBook._3_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

class MyComparator implements Comparator<Integer> {

    public int compare(Integer I1, Integer I2) {
        return I2.compareTo(I1);
    }
}

class Test {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();

        arraylist.add(11);
        arraylist.add(101);
        arraylist.add(103);
        arraylist.add(120);
        arraylist.add(310);
        arraylist.add(31);

        // ascending order
        //System.out.println(arraylist);
        // 1 10 31 103 120 310

        // descending Order
        ///Collections.sort(arraylist, new MyComparator());
        //System.out.println(arraylist);
        //  310 120 103 31 10 1
        List<Integer> res = arraylist.stream().sorted((a1, a2) -> a1.compareTo(a2)).collect(toList());
        System.out.println(arraylist);
        System.out.println(res);


    }
}