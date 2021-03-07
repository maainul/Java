package interviewQuestions;

public class Number_isBinaryOrNot {
    public static void main(String[] args) {
        int number = 100001111;
        System.out.println(isBinary(number));
    }

    private static boolean isBinary(int number) {
        while (number != 0){
            int rem = number % 10;
            if (rem > 1){
                return false;
            }
            number = number / 10;
        }
        return true;
    }
}
