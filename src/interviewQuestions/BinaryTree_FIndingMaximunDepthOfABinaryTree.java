package interviewQuestions;


class Node {
    int data;
    Node left, right;

    Node(int data) {
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
    Node root;

    int maxHeight(Node root) {
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


    void printLeafNode(Node root){
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
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.right.left = new Node(8);
        tree.root.right.left.right = new Node(7);
        System.out.println("Max depth: " + tree.maxHeight(tree.root));
        tree.printLeafNode(tree.root);

    }
}
