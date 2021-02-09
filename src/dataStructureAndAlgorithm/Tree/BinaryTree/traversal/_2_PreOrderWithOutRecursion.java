package dataStructureAndAlgorithm.Tree.BinaryTree.traversal;

import java.util.Stack;

class _2_PreOrderWithOutRecursion {
	Node root;

	private void createBinaryTree() {
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

	private void preOrderIter(Node root) {
		if (root == null) {
			return;
		}

		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node tempNode = stack.pop();
			System.out.print(tempNode.data + "--->");
			if (tempNode.right != null) {
				stack.push(tempNode.right);
			}
			if (tempNode.left != null) {
				stack.push(tempNode.left);
			}
		}
	}

	public static void main(String[] args) {
		_2_PreOrderWithOutRecursion bt = new _2_PreOrderWithOutRecursion();
		bt.createBinaryTree();
		System.out.println("Binary Tree Traversal--Preorder(Iterative)");
		bt.preOrderIter(bt.root);

	}

}
