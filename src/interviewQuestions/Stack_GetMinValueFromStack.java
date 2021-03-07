package interviewQuestions;
// I learn from video and leetcode blog
// video -- https://www.youtube.com/watch?v=ufwPuyxkNVE&ab_channel=VivekanandKhyade-AlgorithmEveryDay

import java.util.Stack;

class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {

        if (stack.isEmpty()) {
            minStack.push(x);
        } else if (x <= minStack.peek()) {
            minStack.push(x);
        }
        stack.push(x);

    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }

    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return minStack.peek();

    }
}


public class Stack_GetMinValueFromStack {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(2);
        obj.push(25);
        obj.push(21);
        obj.push(1);
        obj.push(12);
        obj.push(20);
        obj.push(45);
        obj.pop();
        int param_3 = obj.top();
        System.out.println(param_3);
        int param_4 = obj.getMin();
        System.out.println(param_4);
    }
}
