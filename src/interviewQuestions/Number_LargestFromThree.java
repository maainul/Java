package interviewQuestions;

public class Number_LargestFromThree {
    public static void main(String[] args) {
    int a = 10, b = 20, c= 30;
        System.out.println(findLargest(a,b,c));

    }

    private static int findLargest(int a, int b, int c) {
        if (a > b && a > c){
            return a;
        }
        else if(b >a && b > c){
            return b;
        }
        else if (c > a && c> b){
            return c;
        }
        return Integer.MIN_VALUE;
    }


}
