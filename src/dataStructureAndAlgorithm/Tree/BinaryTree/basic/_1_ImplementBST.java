package dataStructureAndAlgorithm.Tree.BinaryTree.basic;


import java.util.Stack;

public class _1_ImplementBST {
    public static class Node{
        private int data;
        private Node left,right;


        public Node(int data){
            this.data = data;
            left = right = null;
        }

    }

    private Node root;

    public _1_ImplementBST(){
        root = null;
    }

    public Node getRoot(){
        return root;
    }

    public boolean isEmpty(){
        return null == root;
    }

    public int size(){
        Node current = root;
        int size = 0;
        Stack<Node> stack = new Stack<Node>();
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                size++;
               // current = stack.pop();
                current = current.right;
            }
        }

        // Read more: https://javarevisited.blogspot.com/2015/10/how-to-implement-binary-search-tree-in-java-example.html#ixzz6esSqnZD6
        return size;
    }



    public void clear(){
        root = null;
    }




}
