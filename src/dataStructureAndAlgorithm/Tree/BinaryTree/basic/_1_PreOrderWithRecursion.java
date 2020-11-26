package dataStructureAndAlgorithm.Tree.BinaryTree.basic;


class _1_PreOrderWithRecursion {
    Node root;

    private void createBinaryTree(){
        // create Node
        Node first = new Node(9);
        Node second = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);

        // join node
        root = first;
        first.left = second;
        first.right = third;
        second.left = forth;
        second.right = fifth;
    }

    private void preOrderRecursive(Node root) {
        if (root == null){
            return;
        }

        System.out.print(root.data+"-->");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public static void main(String[] args){
        _1_PreOrderWithRecursion bt = new _1_PreOrderWithRecursion();
        bt.createBinaryTree();
        System.out.println("Binary Tree Traveral--Preorder(Recursive)");
        bt.preOrderRecursive(bt.root);

    }
}
