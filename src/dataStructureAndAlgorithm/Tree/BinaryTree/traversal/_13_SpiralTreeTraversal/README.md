## (Iterative) 
***We can print spiral order traversal in O(n) time and O(n) extra space.***

***The idea is to use two stacks.***<br/>
***We can use one stack for printing from left to right and other stack for printing from right to left.***</br> 
***In every iteration, we have nodes of one level in one of the stacks. We print the nodes, and push nodes of next level in other stack***
![1614116225891](https://user-images.githubusercontent.com/37740006/108912719-38aa9a80-7653-11eb-9b94-01569b825b36.jpg)

![IMG_20210224_033440](https://user-images.githubusercontent.com/37740006/108912789-4e1fc480-7653-11eb-95b6-1446cdfef215.jpg)

```java
package dataStructureAndAlgorithm.Tree.BinaryTree.traversal._13_SpiralTreeTraversal;

import java.util.Stack;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}

}

public class SpiralTree {
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

		second.left = seventh;
		second.right = sixth;

		third.left = fifth;
		third.right = fourth;

	}

	public static void rotateDigit(String[] args) {
		SpiralTree spiralTree = new SpiralTree();
		spiralTree.createBinaryTree();
		spiralTree.levelOrderSpiralTree(spiralTree.root);

	}

	private void levelOrderSpiralTree(Node root) {

		if (root == null)
			return; // NULL check

		// Create two stacks to store alternate levels
		// For levels to be printed from right to left
		Stack<Node> s1 = new Stack<Node>();
		// For levels to be printed from left to right
		Stack<Node> s2 = new Stack<Node>();

		// Push first level to first stack 's1'
		s1.push(root);

		// Keep printing while any of the stacks has some nodes
		while (!s1.empty() || !s2.empty()) {
			// Print nodes of current level from s1 and push nodes of
			// next level to s2
			while (!s1.empty()) {
				Node temp = s1.pop();

				System.out.print(temp.data + " ");

				// Note that is right is pushed before left
				if (temp.right != null)
					s2.push(temp.right);

				if (temp.left != null)
					s2.push(temp.left);
			}

			// Print nodes of current level from s2 and push nodes of
			// next level to s1
			while (!s2.empty()) {
				Node temp = s2.pop();
				System.out.print(temp.data + " ");

				// Note that is left is pushed before right
				if (temp.left != null)
					s1.push(temp.left);
				if (temp.right != null)
					s1.push(temp.right);
			}

		}

	}
}
```
