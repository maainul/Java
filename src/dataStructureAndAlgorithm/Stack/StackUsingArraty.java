package dataStructureAndAlgorithm.Stack;

class SStack {
    static final int MAX = 1000;
    int top;
    int[] a = new int[MAX];

    SStack() {
        top = -1;
    }

    boolean isEmpty() {
        return top < 0;
    }


    void push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack overflow");
            return;
        }

        a[++top] = x;
        System.out.println(x + "pushed into stack");

    }


    int pop(){
        if (top <0){
            System.out.println("Stack underflow ");
            return 0;
        }else {
            return a[top--];
        }
    }


    int peek(){
        if (top < 0){
            System.out.println("Stack UnderFlow");
            return 0;
        }else{
            return a[top];
        }
    }
}


public class StackUsingArraty {
    public static void main(String[] args) {
        SStack s = new SStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
    }
}
