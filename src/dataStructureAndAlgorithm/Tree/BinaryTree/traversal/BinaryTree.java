package dataStructureAndAlgorithm.Tree.BinaryTree.traversal;

public class BinaryTree {

    private TreeNode root;


    private  class TreeNode{
        private TreeNode left;
        private TreeNode right;

        private int data;// Generic type

        public TreeNode(int data){
            this.data = data;
         }
    }

    // Create Binary Tree
    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        //TreeNode fifth = new TreeNode(5);

        root = first; // root ----> first
        first.left = second;
        first.right = third; //second----first--third

        second.left = fourth;


    }


    public void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }

    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);

    }

    public void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    // pre-order  = root-left-right // 9-2-4-3
    // in-order   = left-root-right // 4-2-9-3
    // post-order = left-right-root // 4-2-3-9


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        System.out.println("---");
        binaryTree.preOrder(binaryTree.root);
        System.out.println("---");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("---");
        binaryTree.postOrder(binaryTree.root);
    }
}
