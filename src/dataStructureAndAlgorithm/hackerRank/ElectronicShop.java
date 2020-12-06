package dataStructureAndAlgorithm.hackerRank;

public class ElectronicShop {
    public static void main(String[] args) {
        int k[] = {40,50,60};
        int d[] = {5,8,10};
        int b = 60;
        System.out.println(getMoneySpent(k,d,b));

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (drives[j] + keyboards[i] >= max && drives[j] + keyboards[i] <= b) {
                    max = drives[j] + keyboards[i];
                }
            }
        }
        if (max == 0)
            return (-1);
        else
            return (max);
    }

}
