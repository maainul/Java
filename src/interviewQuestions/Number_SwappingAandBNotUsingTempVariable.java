package interviewQuestions;
// https://javarevisited.blogspot.com/2013/02/swap-two-numbers-without-third-temp-variable-java-program-example-tutorial.html#axzz6oGvH3QQv
public class Number_SwappingAandBNotUsingTempVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // adding and subtraction method
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Multiplication and divided approach
        int x = 50;
        int y = 100;

        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);




    }
}
