package dataStructureAndAlgorithm.Stack;

class NNode {
    int data;
    NNode nextNode;

    public NNode(int data) {
        this.data = data;
        this.nextNode = null;
    }
}

class sStack {
    NNode top;
    int length;

    public sStack() {
        top = null;
        length = 0;
    }

    public void push(int data) {
        NNode node = new NNode(data);
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
        NNode c = top;
        while (c != null) {
            System.out.print(c.data + " ");
            c = c.nextNode;
        }

    }
}

public class _0_StackImplWithSLL {
    public static void main(String[] args) {
        sStack stack = new sStack();
        stack.push(8);
        stack.push(18);
        stack.push(38);


    }
}

