package dataStructureAndAlgorithm.Tree.BinaryTree.traversal;


public class _3_InOrderWithRecursion {
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

    private void inOrderRecursion(Node root) {
        if (root == null){
            return;
        }
        inOrderRecursion(root.left);
        System.out.print(root.data+"-->");
        inOrderRecursion(root.right);
    }

    public static void main(String[] args) {
        _3_InOrderWithRecursion bt = new _3_InOrderWithRecursion();
        bt.createBinaryTree();
        System.out.println("InOrder Binary Tree (Recursion)");
        bt.inOrderRecursion(bt.root);
    }


}
