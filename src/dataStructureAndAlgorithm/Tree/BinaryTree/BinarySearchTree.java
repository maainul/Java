// https://www.edureka.co/blog/java-binary-tree
package dataStructureAndAlgorithm.Tree.BinaryTree;

class Node {
	int value;
	Node left;
	public Node right;

	Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}
}

class BinaryTree {

	public void insert(Node node, int value) {
		if (value <= node.value) {
			if (node.left == null) {
				System.out.println(" Inserted " + value + " to left of " + node.value);
				node.left = new Node(value);
			} else {
				insert(node.left, value);
			}

		} else {
			if (node.right == null) {
				System.out.println(" Inserted " + value + " to right of " + node.value);
				node.right = new Node(value);
			} else {
				insert(node.right, value);
			}
		}
	}

	// check value is found or not
	public void contains(Node node, int value) {
		if (value == node.value) {
			System.out.println("value found");
		} else if (value < node.value) {
			if (node.left == null) {
				System.out.println(" No value found");
				node.left = new Node(value);
			} else {
				contains(node.left, value);
			}

		} else {
			if (node.right == null) {
				System.out.println("value Not found");
			} else {
				contains(node.right, value);

			}
		}
	}

	// The in-order traversal consists of first visiting the left sub-tree,
	// then the root node, and finally the right sub-tree.
	public void InOrder(Node node) {
		if (node.left != null) {
			InOrder(node.left);
		}
		System.out.print(" " + node.value);
		if (node.right != null) {
			InOrder(node.right);
		}

	}

	// The in-order traversal consists of first visiting the left sub-tree,
	// then the root node, and finally the right sub-tree.
	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

	// In Pre-order traversal you visit the root node first, then the left subtree,
	// and finally the right subtree. Here�s the code
	public void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	// In Post-order traversal you visit left subtree first,
	// then the right subtree, and the root node at the end. Here�s the code.
	public void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.value);
		}
	}
}

public class BinarySearchTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node root = new Node(5);
		System.out.println("******** Binary Tree Example***********\n");
		System.out.println("Building tree with root value " + root.value);
		tree.insert(root, 2);
		tree.insert(root, 4);
		tree.insert(root, 8);
		tree.insert(root, 6);
		tree.insert(root, 7);
		tree.insert(root, 3);
		tree.insert(root, 9);
		tree.insert(root, 10);
		tree.insert(root, 13);
		tree.insert(root, 47);
		tree.insert(root, 31);
		tree.insert(root, 22);
		System.out.println("\n\nTraversing tree in order");
		tree.traverseInOrder(root);
		System.out.println("\nTraversing tree pre order");
		tree.traversePreOrder(root);
		System.out.println("\nTraversing tree post order");
		tree.traversePostOrder(root);

		// found value
		System.out.println("\n");
		tree.contains(root, 3);

		// found value
		System.out.println("\n");
		tree.contains(root, 100);

		// found value
		System.out.println("\n");
		tree.contains(root, 70);

		// found value
		System.out.println("\n");
		tree.contains(root, 110);

		// found value
		System.out.println("\n");
		tree.contains(root, 8);

		// found value
		System.out.println("\n");
		tree.contains(root, 10);

		System.out.println("\n\nTraversing tree in order");
		tree.InOrder(root);
	}

}
/*
 ******** Binary Tree Example***********
 * 
 * Building tree with root value 5 Inserted 2 to left of 5 Inserted 4 to right
 * of 2 Inserted 8 to right of 5 Inserted 6 to left of 8 Inserted 7 to right of
 * 6 Inserted 3 to left of 4 Inserted 9 to right of 8 Inserted 10 to right of 9
 * Inserted 13 to right of 10 Inserted 47 to right of 13 Inserted 31 to left of
 * 47 Inserted 22 to left of 31
 * 
 * 
 * Traversing tree in order 2 3 4 5 6 7 8 9 10 13 22 31 47 Traversing tree pre
 * order 5 2 4 3 8 6 7 9 10 13 47 31 22 Traversing tree post order 3 4 2 7 6 22
 * 31 47 13 10 9 8 5
 */
