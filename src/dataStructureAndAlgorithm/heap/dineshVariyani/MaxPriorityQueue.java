package dataStructureAndAlgorithm.heap.dineshVariyani;

public class MaxPriorityQueue {
    private int size; // size of max heap
    private Integer[] heap;

    public MaxPriorityQueue(int capacity) {
        heap = new Integer[capacity + 1]; // index 0 is kept as empty
        size = 0;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void insert(int x) {
        if (size == heap.length - 1) {
            resize(2 * heap.length);
        }
        size++;
        heap[size] = x;
        bottomUpSwim(size);
    }

    private void bottomUpSwim(int k) {
        while (k > 1 && heap[parent(k)] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[parent(k)];
            heap[parent(k)] = temp;
            k = parent(k); // bcoz we need to continue shifting up till // new value inserted is at correct position
        }
    }

    private void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void printMaxHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    private int findMax() {
        return heap[1];
    }

    private int extractMax() {
        int max = heap[1];
        heap[1] = heap[--size];
        downHeapify(1);
        return max;
    }

    private void downHeapify(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return;
        }
        if (heap[pos] < heap[leftChild(pos)] || heap[pos] < rightChild(pos)) {
            if (heap[leftChild(pos)] > heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                downHeapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                downHeapify(rightChild(pos));
            }
        }
    }

    private void swap(int parent, int rightChild) {
        int temp = heap[parent];
        heap[parent] = heap[rightChild];
        heap[rightChild] = temp;
    }


    public static void main(String[] args) {
        MaxPriorityQueue pq = new MaxPriorityQueue(3);
        pq.insert(4);
        pq.insert(5);
        pq.insert(2);
        pq.insert(6);
        pq.insert(1);
        pq.insert(3);
        pq.insert(30);
        pq.insert(39);
        System.out.println(pq.size());
        pq.printMaxHeap();
        System.out.println("\nFind Max = " + pq.findMax());
        System.out.println("\nMax Value is = " + pq.extractMax());
        pq.printMaxHeap();
        System.out.println("\nMax Value is = " + pq.extractMax());
        pq.printMaxHeap();
        System.out.println("\nMax Value is = " + pq.extractMax());
        pq.printMaxHeap();
    }


}
