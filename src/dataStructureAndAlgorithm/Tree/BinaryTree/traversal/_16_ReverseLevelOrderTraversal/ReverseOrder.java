package dataStructureAndAlgorithm.Tree.BinaryTree.traversal._16_ReverseLevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

/*
Reverse Level Order Traversal
Last Updated: 02-11-2020
We have discussed the level order traversal of a post in the previous post.
The idea is to print the last level first, then the second last level, and so on.
Like Level order traversal, every level is printed from left to right.


Example Tree

Reverse Level order traversal of the above tree is “4 5 2 3 1”.
Both methods for normal level order traversal can be easily modified to do reverse level order traversal.
 */
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }

}


public class ReverseOrder {
    private static void reverseLevelOrder(Node node) {
        Stack<Node> myStack = new Stack<>();
        Queue<Node> myQueue = new LinkedList<>();
        myQueue.add(node);
        // Do something like normal level order traversal order.Following
        // are the differences with normal level order traversal
        // 1) Instead of printing a node, we push the node to stack
        // 2) Right subtree is visited before left subtree
        while (!myQueue.isEmpty()) {
            /* Dequeue node and make it root */
            node = myQueue.peek();
            myQueue.remove();
            myStack.push(node);
            /* Enqueue right child */
            if (node.right != null) {
                // NOTE: RIGHT CHILD IS ENQUEUED BEFORE LEFT
                myQueue.add(node.right);
            }
            /* Enqueue left child */
            if (node.left != null) {
                myQueue.add(node.left);
            }
        }
// Now pop all items from stack one by one and print them
        while (!myStack.isEmpty()) {
            node = myStack.peek();
            System.out.print(node.data + " ");
            myStack.pop();
        }
    }

    public static void main(String[] args) {
        ReverseOrder tree = new ReverseOrder();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Level Order traversal of binary tree is :");
        reverseLevelOrder(root);
    }


}
/*

Level Order traversal of binary tree is :

4 5 6 7 2 3 1

*/
