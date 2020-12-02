package dataStructureAndAlgorithm.hackerRank;

public class GCD {
    public static void main(String[] args) {
        int a = 20, b = 5;
        System.out.println(gcd(a,b));
        System.out.println(gcdRecursion(a,b));
    }

    private static int gcdRecursion(int a, int b) {
        if (b == 0){
            return a;
        }

//        if (a == b){
//            return a;
//        }

        if (a > b){
            return  gcd(b,a % b);
        }
        return  gcd(a,b % a);
    }

    private static int gcd(int a, int b) {
        if (b == 0){
            return  a;
        }
        if (a == 0){
            return b;
        }
        int g = 1;
        for (int i = 1; i <= a && i <= b; i++){
            if ((a % i == 0) && (b % i == 0)){
               // System.out.println(i);
                g = i;
            }
        }
        return g;

    }
}
