package dataStructureAndAlgorithm.hackerRank;

public class PickingNumbers {
    public static void main(String[] args) {
        int[] x = {1,2,2,3,1,2};
        System.out.println(pickingNumber(x));
    }

    private static int pickingNumber(int[] x) {
        int result[] = new int[x.length];
        int index = 0,count = 0;
        for (int i =0; i <x.length-1; i++){
            for (int j = i+1; j < x.length-1; j++){
                if (x[i]-x[j] == 0 || x[i] - x[j] ==1){
                    result[index++] = x[j];
                }
            }
            if (count < result.length){
                count = result.length;
            }
        }

        return count;
    }
}
