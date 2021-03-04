package dataStructureAndAlgorithm.Tree.BinaryTree.traversal;
 // https://www.java67.com/2016/09/inorder-traversal-of-binary-tree-java-example.html
import java.util.Stack;

public class _4_InOrderInteration {
    Node root;

    private void createBinaryTree() {
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

    private void inOrderIter() {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            }else {
                current = stack.pop();
                System.out.print(current.data + "-->");
                current = current.right;
            }
        }
    }


    public static void main(String[] args) {
        _4_InOrderInteration bt = new _4_InOrderInteration();
        bt.createBinaryTree();
        System.out.println("InOrder Traversal Iterative");
        bt.inOrderIter();
    }
}
