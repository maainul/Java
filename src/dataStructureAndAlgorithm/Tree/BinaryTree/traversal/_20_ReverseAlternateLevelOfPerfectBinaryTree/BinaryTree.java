package dataStructureAndAlgorithm.Tree.BinaryTree.traversal._20_ReverseAlternateLevelOfPerfectBinaryTree;
/*
Reverse alternate levels of a perfect binary tree
Last Updated: 09-11-2020
Given a Perfect Binary Tree, reverse the alternate level nodes of the binary tree.

Given tree:
               a
            /     \
           b       c
         /  \     /  \
        d    e    f    g
       / \  / \  / \  / \
       h  i j  k l  m  n  o

Modified tree:
               a
            /     \
           c       b
         /  \     /  \
        d    e    f    g
       / \  / \  / \  / \
      o  n m  l k  j  i  h


Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.
Method 1 (Simple):
A simple solution is to do the following steps.
1) Access nodes level by level.
2) If the current level is odd, then store nodes of this level in an array.
3) Reverse the array and store elements back in the tree.

Method 2 (Using Two Traversals):
Another is to do two inorder traversals. The following are the steps to be followed.
1) Traverse the given tree in inorder fashion and store all odd level nodes in an auxiliary array. For the above example given tree, contents of array become {h, i, b, j, k, l, m, c, n, o}
2) Reverse the array. The array now becomes {o, n, c, m, l, k, j, b, i, h}
3) Traverse the tree again inorder fashion. While traversing the tree, one by one take elements from array and store elements from an array to every odd level traversed node.
For the above example, we traverse ‘h’ first in the above array and replace ‘h’ with ‘o’. Then we traverse ‘i’ and replace it with n.
Following is the implementation of the above algorithm.
 */

// Java program to reverse alternate
// levels of  perfect binary tree
// A binary tree node
class Node {

    char data;
    Node left, right;

    Node(char item) {
        data = item;
        left = right = null;
    }
}


public class BinaryTree {
    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node('a');
        tree.root.left = new Node('b');
        tree.root.right = new Node('c');
        tree.root.left.left = new Node('d');
        tree.root.left.right = new Node('e');
        tree.root.right.left = new Node('f');
        tree.root.right.right = new Node('g');
        tree.root.left.left.left = new Node('h');
        tree.root.left.left.right = new Node('i');
        tree.root.left.right.left = new Node('j');
        tree.root.left.right.right = new Node('k');
        tree.root.right.left.left = new Node('l');
        tree.root.right.left.right = new Node('m');
        tree.root.right.right.left = new Node('n');
        tree.root.right.right.right = new Node('o');
        System.out.println("Inorder Traversal of given tree");
        tree.printInorder();

       // tree.reverseAlternate();
        System.out.println("");
        System.out.println("");
        System.out.println("Inorder Traversal of modified tree");
        tree.printInorder();

    }

    void printInorder() {
        printInorder(root);
    }


    private void printInorder(Node node) {
        if (node == null){
            return;
        }
        printInorder(node.left);
        System.out.print(node.data+" ");
        printInorder(node.right);
    }

}
