//package interviewQuestions;
//
//
//import java.util.Queue;
//
//class MyStack {
//
//    private Queue<Integer> q1 = new LinkedList<>();
//    private Queue<Integer> q2 = new LinkedList<>();
//    private int top;
//
//    /**
//     * Initialize your data structure here.
//     */
//    public MyStack() {
//
//    }
//
//    /**
//     * Push element x onto stack.
//     */
//    public void push(int x) {
//        q1.add(x);
//        top = x;
//
//    }
//
//    /**
//     * Removes the element on top of the stack and returns that element.
//     */
//    public int pop() {
//        while (q1.size() > 1) {
//            top = q1.remove();
//            q2.add(top);
//        }
//        q1.remove();
//        Queue temp = q1;
//        q2 = q1;
//        q1 = temp;
//
//    }
//
//    /**
//     * Get the top element.
//     */
//    public int top() {
//        return top;
//    }
//
//    /**
//     * Returns whether the stack is empty.
//     */
//    public boolean empty() {
//        return q1.isEmpty();
//
//    }
//}
//
///**
// * Your MyStack object will be instantiated and called as such:
// * MyStack obj = new MyStack();
// * obj.push(x);
// * int param_2 = obj.pop();
// * int param_3 = obj.top();
// * boolean param_4 = obj.empty();
// */
//
//public class ImplementStackUsing2Queue {
//    public static void main(String[] args) {
//        MyStack obj = new MyStack();
//        obj.push(10);
//        obj.push(20);
//        obj.push(30);
//        int param_2 = obj.pop();
//        System.out.println(param_2);
//        int param_3 = obj.top();
//        System.out.println(param_3);
//
//        boolean param_4 = obj.empty();
//        System.out.println(param_4);
//    }
//
//
//}
//*/