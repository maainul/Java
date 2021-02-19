package dataStructureAndAlgorithm.heap;

import java.util.ArrayList;

public class MyHeap {

    private void insert(ArrayList<Integer> ht, int newData) {
        int size = ht.size();
        if (size == 0){
            ht.add(newData);
        }else {
            ht.add(newData);
            for (int i = size/2 -1; i>= 0; i--){
                heapify(ht, i);
            }
        }

    }

    private void heapify(ArrayList<Integer> ht, int i) {
        int size = ht.size();
        int largest = i;

        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < size && ht.get(l) > ht.get(largest)){
            largest = l;
        }
        if (r < size && ht.get(r) > ht.get(largest)){
            largest = r;
        }

        if (largest != i) {
            int temp = ht.get(largest);
            ht.set(largest, ht.get(i));
            ht.set(i, temp);

            heapify(ht, largest);
        }




    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int size = array.size();

        MyHeap myHeap = new MyHeap();
        myHeap.insert(array, 3);

    }

}
