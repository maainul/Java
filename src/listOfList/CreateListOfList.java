package listOfList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateListOfList {
    public static void main(String[] args) {
        List<List<String>> listOfList = new ArrayList<>();
        List<String> innerList = new ArrayList<>();
        innerList.add("mainul");
        innerList.add("hasan");
        innerList.add("anik");
        listOfList.add(innerList);
        List<String> secondList = new ArrayList<>();
        secondList.add("12");
        secondList.add("21");
        secondList.add("32");

        listOfList.add(secondList);
        System.out.println(listOfList);

        for (List inner : listOfList){
            for (Object o : inner){
                System.out.print(o+" ");
            }
            System.out.println(" ");
        }

    }

}
