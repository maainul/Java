package dataStructureAndAlgorithm.Stack.stackIntroduction;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyStack {
    Node root;

    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed into stack");
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("empty");
        }

        return root.data;

    }


}

public class LinkedListStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println(myStack.pop());

    }
}
