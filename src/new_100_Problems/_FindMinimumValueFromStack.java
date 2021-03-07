package new_100_Problems;

import java.util.Stack;

public class _FindMinimumValueFromStack {

    Stack<Integer> result = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int x) {
        if (result.isEmpty()) {
            min.push(x);
        } else if (x <= min.peek()) {
            min.push(x);
        }
        result.push(x);
    }

    public int pop() {
        return result.pop();
    }

    public int peek() {
        return result.peek();
    }

    public int getMin() {
        return min.peek();
    }


    public static void main(String[] args) {
        _FindMinimumValueFromStack stack = new _FindMinimumValueFromStack();
        stack.push(10);
        stack.push(1);
        stack.push(100);
        stack.push(20);
        System.out.println(stack.getMin());


    }
}
