package dataStructureAndAlgorithm.Tree.BinaryTree.traversal._15_LevelOrderTraversalWithDirectionChangeAfterEveryTwoLevels;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
Level order traversal with direction change after every two levels
Last Updated: 09-11-2020
Given a binary tree, print the level order traversal in such a way that first two levels are printed from left to right, next two levels are printed from right to left, then next two from left to right and so on. So, the problem is to reverse the direction of level order traversal of binary tree after every two levels.
Examples:

Input:
            1
          /   \
        2       3
      /  \     /  \
     4    5    6    7
    / \  / \  / \  / \
   8  9 3   1 4  2 7  2
     /     / \    \
    16    17  18   19
Output:
1
2 3
7 6 5 4
2 7 2 4 1 3 9 8
16 17 18 19
In the above example, first two levels
are printed from left to right, next two
levels are printed from right to left,
and then last level is printed from
left to right.

 */
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }

}

public class Main {
    public static void main(String[] args) {
        // Let us create binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(1);
        root.right.left.left = new Node(4);
        root.right.left.right = new Node(2);
        root.right.right.left = new Node(7);
        root.right.right.right = new Node(2);
        root.left.right.left.left = new Node(16);
        root.left.right.left.right = new Node(17);
        root.right.left.right.left = new Node(18);
        root.right.right.left.right = new Node(19);

        modifiedLevelOrder(root);
    }

    private static void modifiedLevelOrder(Node node) {

        // For null root
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            System.out.print(node.data);
            return;
        }

        // Maintain a queue for normal  
        // level order traversal 
        Queue<Node> myQueue = new LinkedList<>(); 
  
    /* Maintain a stack for  
    printing nodes in reverse 
    order after they are popped  
    out from queue.*/
        Stack<Node> myStack = new Stack<>();

        Node temp = null;

        // sz is used for storing  
        // the count of nodes in a level 
        int sz;

        // Used for changing the direction 
        // of level order traversal 
        int ct = 0;

        // Used for changing the direction  
        // of level order traversal 
        boolean rightToLeft = false;

        // Push root node to the queue 
        myQueue.add(node);

        // Run this while loop till queue got empty 
        while (!myQueue.isEmpty()) {
            ct++;

            sz = myQueue.size();
           // System.out.println(sz);
            // Do a normal level order traversal 
            for (int i = 0; i < sz; i++) {
                temp = myQueue.peek();
                myQueue.remove(); 
  
            /*For printing nodes from left to right, 
            simply print the nodes in the order in which 
            they are being popped out from the queue.*/
                if (rightToLeft == false)
                    System.out.print(temp.data + " ");          
  
            /* For printing nodes from right to left, 
            push the nodes to stack instead of printing them.*/
                else
                    myStack.push(temp);

                if (temp.left != null)
                    myQueue.add(temp.left);

                if (temp.right != null)
                    myQueue.add(temp.right);
            }

            if (rightToLeft == true) {

                // for printing the nodes in order 
                // from right to left 
                while (!myStack.isEmpty()) {
                    temp = myStack.peek();
                    myStack.pop();

                    System.out.print(temp.data + " ");
                }
            } 
  
        /*Change the direction of printing 
        nodes after every two levels.*/
            if (ct == 2) {
                rightToLeft = !rightToLeft;
                ct = 0;
            }

            System.out.print("\n");
        }
    }
}
