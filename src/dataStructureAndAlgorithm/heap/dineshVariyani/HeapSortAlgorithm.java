package dataStructureAndAlgorithm.heap.dineshVariyani;

public class HeapSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2,90,74,2,82,29,30,45};
        HeapSortAlgorithm heapSortAlgorithm = new HeapSortAlgorithm();
        heapSortAlgorithm.heapSort(arr);


    }

    private void downheapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] < arr[largest]){
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]){
            largest = right;
        }
        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            downheapify(arr,n,largest);
        }

    }

    private void swap(int[]arr,int parent, int rightChild) {
        int temp = arr[parent];
        arr[parent] = arr[rightChild];
        arr[rightChild] = temp;
    }

    private void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n/2 - 1;i >= 0; i--){
            downheapify(arr,n,i);
        }
    }
}
