package dataStructureAndAlgorithm._1_array.searching._14_MajorityElement;

import java.util.HashMap;

/*
 * METHOD 4 (Using Hashmap):

Approach: This method is somewhat similar to Moore voting algorithm in terms of time complexity, 

but in this case, there is no need for the second step of Moore voting algorithm. But as usual, 

here space complexity becomes O(n).

In Hashmap(key-value pair), at value, maintain a count for each element(key) and whenever the count is greater than half of the array length, return that key(majority element).

Algorithm:

Create a hashmap to store a key-value pair, i.e. element-frequency pair.

Traverse the array from start to end.

For every element in the array, insert the element in the hashmap 

if the element does not exist as key, else fetch the value of the key ( array[i] ) and increase the value by 1

If the count is greater than half then print the majority element and break.

If no majority element is found print “No Majority element”

Implementation:

 */
public class HashMapImplementation {
    private static void findMajority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                if (count > arr.length / 2) {
                    System.out.println("Majority found :- " + arr[i]);
                    return;
                } else {
                    map.put(arr[i], count);
                }
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(" No Majority element");
    }

    public static void main(String[] args) {
        int a[] = new int[]{2, 2, 2, 2, 5, 5, 2, 3, 3};

        findMajority(a);

    }

}
