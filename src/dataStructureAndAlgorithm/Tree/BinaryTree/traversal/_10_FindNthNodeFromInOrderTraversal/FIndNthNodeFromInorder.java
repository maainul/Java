package dataStructureAndAlgorithm.Tree.BinaryTree.traversal._10_FindNthNodeFromInOrderTraversal;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }

}


public class FIndNthNodeFromInorder {
    static int count = 0;
    Node root;

    private void createBinaryTree(){
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
