package dataStructureAndAlgorithm.Tree.BinaryTree.basic;

import java.util.Stack;

public class _4_InOrderInteration {
    Node root;

    private void createBinaryTree(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    private void inOrderIter(){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || stack.size() > 0){
            while (current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data+"-->");

            current = current.right;
        }
    }

    public static void main(String[] args) {
        _4_InOrderInteration bt = new _4_InOrderInteration();
        bt.createBinaryTree();
        System.out.println("InOrder Traversal Iterative");
        bt.inOrderIter();
    }
}
