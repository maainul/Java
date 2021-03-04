package dataStructureAndAlgorithm.Tree.BinaryTree.traversal.AllTraversalInOneFile;

import java.util.Stack;

class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root;

    private void createBinaryTree() {
        Node first = new Node(9);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // join node
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;

    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        System.out.println("PreOrder ");
        binaryTree.preOrder(binaryTree.root);

        System.out.println("\nPreOrder Iterator ");
        binaryTree.preOrderItr(binaryTree.root);

        System.out.println("\nIn Order");
        binaryTree.inOrder(binaryTree.root);

        System.out.println("\nIn Order");
        binaryTree.inOrderItr(binaryTree.root);

        System.out.println("\nPost Order");
        binaryTree.postOrder(binaryTree.root);

        System.out.println("\nPost Order");
        binaryTree.postOrderItr(binaryTree.root);

    }

    private void preOrderItr(Node root) {

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node tempNode = stack.pop();
            System.out.print(tempNode.data + " ");

            if (tempNode.right != null) {
                stack.push(tempNode.right);
            }
            if (tempNode.left != null) {
                stack.push(tempNode.left);
            }
        }
    }

    private void postOrder(Node root) {
        // TODO Auto-generated method stub
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    private void postOrderItr(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        Stack<Node> out = new Stack<>();

        while (!stack.isEmpty()) {
            Node cuNode = stack.pop();
            out.push(cuNode);
            if (cuNode.left != null) {
                stack.push(cuNode.left);
            }
            if (cuNode.right != null) {
                stack.push(cuNode.right);
            }
        }

        while (!out.isEmpty())
            System.out.print(out.pop().data + " ");

    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    private void inOrderItr(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                System.out.print(current.data + "-->");
                current = current.right;
            }
        }
    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

}
