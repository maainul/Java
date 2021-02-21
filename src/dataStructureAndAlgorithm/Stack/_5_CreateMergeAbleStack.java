package dataStructureAndAlgorithm.Stack;

class Node{
    Node next;
    Node prev;
    int data;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class Stack{
    private Node head;
    private Node tail;

    // Initialize stack class
    // with its head and tail as null
    public Stack(){
        head = null;
        tail = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            head.next= null;
            head.prev = null;
        }else {
            newNode.prev = tail;
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void pop(){
        if (head == null){
            throw new StackException("Stack UnderFLow");
        }
        if (head == tail){
            head = null;
            tail = null;
        }else {
            Node node = tail;
            tail = tail.prev;
            node.prev = null;
            tail.next = null;
        }
    }

    public void merge(Stack s)
    {
        head.prev = s.tail;
        s.tail.next = head;
        head = s.head;
        s.tail = null;
        s.head = null;
    }

    public void display() {
        if (tail != null) {
            Node current = tail;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
        } else {
            throw new StackException("Stack UnderFlow");
        }
    }
}

public class _5_CreateMergeAbleStack {
    public static void main(String[] args) {
        Stack ms1 = new Stack();
        Stack ms2 = new Stack();

        ms1.push(6);
        ms1.push(5);
        ms1.push(4);
        ms2.push(9);
        ms2.push(8);
        ms2.push(7);
        ms1.display();
        System.out.println();
        ms2.display();
        ms1.merge(ms2);
        System.out.println();
        ms1.display();
    }

}

class StackException extends RuntimeException{
    public StackException(){
        super();
    }

    public StackException(String message){
        super(message);
    }

}
