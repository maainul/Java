package interviewQuestions;


class BNode {
    int data;
    BNode left, right;

    BNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public boolean isLeaf() {
        return left == null && right == null;

        //Read more: https://www.java67.com/2016/09/how-to-print-all-leaf-nodes-of-binary-tree-in-java.html#ixzz6o9nltfNR
    }
}

class BinaryTree {
    BNode root;

    int maxHeight(BNode root) {
        if (root == null) {
            return 0;
        }
        int h;
        int left = maxHeight(root.left);
        int right = maxHeight(root.right);
        if (left > right) {
            h = 1 + left;
        } else {
            h = 1 + right;
        }
        return h;
    }


    void printLeafNode(BNode root){
        if (root == null){
            return;
        }
        if (root.isLeaf()){
            System.out.print(root.data+" ");
        }
        printLeafNode(root.left);
        printLeafNode(root.right);

    }


}


public class BinaryTree_FIndingMaximunDepthOfABinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new BNode(1);
        tree.root.left = new BNode(2);
        tree.root.right = new BNode(3);
        tree.root.left.left = new BNode(4);
        tree.root.right.left = new BNode(5);
        tree.root.right.right = new BNode(6);
        tree.root.right.right.left = new BNode(8);
        tree.root.right.left.right = new BNode(7);
        System.out.println("Max depth: " + tree.maxHeight(tree.root));
        tree.printLeafNode(tree.root);

    }
}
