package dataStructureAndAlgorithm.Stack.geekforgeekProgram.stackOperations;

class StackNode {
    int data;
    StackNode next;

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }

}

class Stack {
    StackNode top;

    public void push(int data) {
        StackNode newNode = new StackNode(data);
        if (top == null) {
            top = newNode;
        } else {
            StackNode temp = top;
            top = newNode;
            newNode.next = temp;
        }
    }

    public int pop() {
        int popped = Integer.MIN_VALUE;
        if (top == null) {
            System.out.println("Stack is Empty");

        } else {
            popped = top.data;
            top = top.next;
        }
        return popped;
    }


    public void display() {
        StackNode s = this.top;
        while (s != null) {
            System.out.print(s.data+"----->");
            s = s.next;
        }

    }

    public void display(StackNode res) {
        StackNode s = this.top;
        while (s != null) {
            System.out.print(s.data+"----->");
            s = s.next;
        }

    }



    /* Function to reverse the linked list */
    StackNode reverse()
    {
        StackNode prev = null;
        StackNode current = top;
        StackNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        top = prev;
        return top;
    }



}

public class ReverseStackWithoutSpace {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Original Stack");
        s.display();

        // reverse
       StackNode res = s.reverse();

        System.out.println("\nReversed Stack");
        s.display(res);
    }
}
