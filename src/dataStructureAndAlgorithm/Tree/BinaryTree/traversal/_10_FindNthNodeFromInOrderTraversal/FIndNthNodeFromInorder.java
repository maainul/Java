package dataStructureAndAlgorithm.Tree.BinaryTree.traversal._10_FindNthNodeFromInOrderTraversal;

/*
Find n-th node of inorder traversal
Last Updated: 20-10-2020
Given the binary tree and you have to find out the n-th node of inorder traversal.

Examples:

Input : n = 4
              10
            /   \
           20     30
         /   \
        40     50
Output : 10
Inorder Traversal is : 40 20 50 10 30

Input :  n = 3
            7
          /   \
         2     3
             /   \
            8     5
Output : 8
Inorder: 2 7 8 3 5
3th node is 8


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


public class FIndNthNodeFromInorder {
    static int count = 0;
    Node root;

    private void createBinaryTree() {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);


        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;


    }


    private void inOrder(Node root, int n){

        if (root == null){
            return;
        }
        if (count <= n){
            inOrder(root.left, n);
            count++;
            if (count == n){
                System.out.println(root.data);
            }

            inOrder(root.right, n);
        }

    }



    public static void main(String[] args) {
        FIndNthNodeFromInorder bt = new FIndNthNodeFromInorder();
        bt.createBinaryTree();
        int n = 4;
        bt.inOrder(bt.root, n);
    }

}
