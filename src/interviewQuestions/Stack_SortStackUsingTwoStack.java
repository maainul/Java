package interviewQuestions;

import java.util.Stack;

public class Stack_SortStackUsingTwoStack {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.push(34);
        input.push(3);
        input.push(31);
        input.push(98);
        input.push(92);
        input.push(23);

        Stack<Integer> result = sottStack(input);
        System.out.println("Sorted Stack ");
        while (!result.isEmpty()) {
            System.out.print(result.pop() + " ");
        }
    }

    private static Stack<Integer> sottStack(Stack<Integer> stackA) {
        Stack<Integer> stackB = new Stack<>();
        while (!stackA.isEmpty()) {

            // pop out the first element
            int temp = stackA.pop();

            // while temporary stack is not empty and
            // top of stack is greater then the temp

            while (!stackB.isEmpty() && stackB.peek() < temp) {
                // pop from the stackB put it stackA
                stackA.push(stackB.pop());
            }
            // push temp in stackB of stack
            stackB.push(temp);
        }
        return stackB;
    }
}
