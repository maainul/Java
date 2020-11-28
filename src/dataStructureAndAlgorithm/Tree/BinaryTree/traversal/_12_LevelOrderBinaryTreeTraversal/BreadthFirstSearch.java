package dataStructureAndAlgorithm.Tree.BinaryTree.traversal._12_LevelOrderBinaryTreeTraversal;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }

}
public class BreadthFirstSearch {
    Node root;
    static int count = 0;

    private void createBinaryTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        Node seventh = new Node(7);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;

    }

    private void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.data+" ");

            if (temp.left != null){
                queue.add(temp.left);
            }

            if (temp.right != null){
                queue.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        BreadthFirstSearch bt = new BreadthFirstSearch();

        bt.createBinaryTree();
        System.out.println("InOrder Binary Tree (Recursion)");

        bt.printLevelOrder(bt.root);
    }
}
