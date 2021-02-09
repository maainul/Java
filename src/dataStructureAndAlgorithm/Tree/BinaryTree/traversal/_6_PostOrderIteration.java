package dataStructureAndAlgorithm.Tree.BinaryTree.traversal;

import java.util.Stack;

public class _6_PostOrderIteration {
	Node root;

	private void createBinaryTree() {
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

	private void postOrderIter(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);

		Stack<Node> out = new Stack<>();

		while (!stack.isEmpty()) {
			Node current = stack.pop();
			out.push(current);

			if (current.left != null) {
				stack.push(current.left);
			}
			if (current.right != null) {
				stack.push(current.right);
			}
		}

		while (!out.isEmpty()) {
			System.out.print(out.pop().data + " ");
		}
	}

	public static void main(String[] args) {
		_6_PostOrderIteration bt = new _6_PostOrderIteration();
		bt.createBinaryTree();
		System.out.println("PostOrder Binary Tree (Recursion)");
		bt.postOrderIter(bt.root);
	}
}
