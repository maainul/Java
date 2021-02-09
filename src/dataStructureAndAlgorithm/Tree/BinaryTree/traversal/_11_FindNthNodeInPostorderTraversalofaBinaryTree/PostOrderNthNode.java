package dataStructureAndAlgorithm.Tree.BinaryTree.traversal._11_FindNthNodeInPostorderTraversalofaBinaryTree;

/*
Find n-th node in Postorder traversal of a Binary Tree
Last Updated: 20-02-2019
Given a Binary tree and a number N, write a program to find the N-th node in the Postorder traversal of the given Binary tree.

Prerequisite: Tree Traversal

Examples:

Input : N = 4
              11
            /   \
           21    31
         /   \
        41     51
Output : 31
Explanation: Postorder Traversal of given Binary Tree is 41 51 21 31 11,
so 4th node will be 31.

Input : N = 5
             25
           /    \
          20    30
        /    \ /   \
      18    22 24   32
Output : 32
 */
class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}

}

public class PostOrderNthNode {
	Node root;
	static int count = 0;

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

	private void postOrderRecursion(Node root, int n) {
		if (root == null) {
			return;
		}
		if (count <= n) {
			postOrderRecursion(root.left, n);
			postOrderRecursion(root.right, n);
			count++;
			if (count == n) {
				System.out.println(root.data);
			}
		}
	}

	public static void main(String[] args) {
		PostOrderNthNode bt = new PostOrderNthNode();

		bt.createBinaryTree();
		System.out.println("InOrder Binary Tree (Recursion)");
		int n = 4;
		bt.postOrderRecursion(bt.root, n);
	}

}
