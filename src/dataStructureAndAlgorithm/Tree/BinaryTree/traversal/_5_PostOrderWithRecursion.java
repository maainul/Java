package dataStructureAndAlgorithm.Tree.BinaryTree.traversal;


public class _5_PostOrderWithRecursion {
    Node root;

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

    private void postOrderRecursion(Node root) {
        if (root == null){
            return;
        }
        postOrderRecursion(root.left);
        postOrderRecursion(root.right);
        System.out.print(root.data+"-->");

    }

    public static void main(String[] args) {
        _5_PostOrderWithRecursion bt = new _5_PostOrderWithRecursion();
        bt.createBinaryTree();
        System.out.println("PostOrder Binary Tree (Recursion)");
        bt.postOrderRecursion(bt.root);
    }
}
