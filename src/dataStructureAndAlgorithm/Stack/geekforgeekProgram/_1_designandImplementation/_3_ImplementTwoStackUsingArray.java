package dataStructureAndAlgorithm.Stack.geekforgeekProgram._1_designandImplementation;

/*
Method 2 (A space efficient implementation)

This method efficiently utilizes the available space.
It does’t cause an overflow if there is space available in arr[].
The idea is to start two stacks from two extreme corners of arr[].
stack1 starts from the leftmost element,
the first element in stack1 is pushed at index 0.
The stack2 starts from the rightmost corner,
the first element in stack2 is pushed at index (n-1).
Both stacks grow (or shrink) in opposite direction.

To check for overflow,
all we need to check is for space between top elements of both stacks.
This check is highlighted in the below code.
 */
class TwoStack {
    int size;
    int top1, top2;
    int[] arr;

    public TwoStack(int n) {
        arr = new int[5];
        size = n;
        top1 = -1;
        top2 = size;
    }

    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            throw new StackOverFlowAndUnderFlowException("StackOverFlow");
        }
    }

    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            throw new StackOverFlowAndUnderFlowException("StackOverFlow");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            throw new StackOverFlowAndUnderFlowException("Stack UnderFlow");
        }
    }

    public int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            throw new StackOverFlowAndUnderFlowException("Stack Underflow");
        }
    }
}


public class _3_ImplementTwoStackUsingArray {
    public static void main(String[] args) {
        TwoStack twoStack = new TwoStack(5);
        twoStack.push1(5);
        twoStack.push2(10);
        twoStack.push2(15);
        twoStack.push1(11);
        twoStack.push2(7);
        twoStack.push2(7);
        twoStack.push2(7);
        twoStack.push2(7);
        System.out.println("Popped element from" + " Stack is" + twoStack.pop1());
        System.out.println("Popped element from" + " Stack is" + twoStack.pop2());

    }
}


class StackOverFlowAndUnderFlowException extends RuntimeException {
    public StackOverFlowAndUnderFlowException() {
        super();
    }

    public StackOverFlowAndUnderFlowException(String message) {
        super(message);
    }
}
