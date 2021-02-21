package dataStructureAndAlgorithm.Stack.geekforgeekProgram._1_designandImplementation;

class Node {
    int data;
    Node nextNode;

    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }
}

class Stack {
    Node top;
    int length;

    public Stack() {
        top = null;
        length = 0;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.nextNode = top;
        top = node;
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack empty");
        }
        int data = top.data;
        top = top.nextNode;
        length--;
        return data;

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return top.data;
    }

    public int length() {
        return length;
    }

    private boolean isEmpty() {
        return length == 0;
    }

    public void show() {
        Node c = top;
        while (c != null) {
            System.out.print(c.data + " ");
            c = c.nextNode;
        }

    }
}

public class _0_StackImplWithSLL {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(8);
        stack.push(18);
        stack.push(38);
        stack.show();

    }
}

