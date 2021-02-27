# Reverse Level Order Traversal
Difficulty Level : Easy
Last Updated : 02 Nov, 2020

The idea is to print the last level first, then the second last level, and so on. Like Level order traversal, every level is printed from left to right.
 
## Example Tree

![tree122](https://user-images.githubusercontent.com/37740006/108921468-9a253600-7660-11eb-8122-27a12e4c11ad.gif)


Reverse Level order traversal of the above tree is “4 5 2 3 1”. 

Both methods for normal level order traversal can be easily modified to do reverse level order traversal.

## Algorithm
**BFS------>The Put data into a stack---->pop element ---> print()**
1. Do something like normal level order traversal order.
2. Following are the differences with normal level order traversal
3. Instead of printing a node, we push the node to stack
4. Right subtree is visited before left subtree

```java
package dataStructureAndAlgorithm.Tree.BinaryTree.traversal._16_ReverseLevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}

}

public class ReverseOrder {
	private static void reverseLevelOrder(Node node) {
		Stack<Node> myStack = new Stack<>();
		Queue<Node> myQueue = new LinkedList<>();
		myQueue.add(node);

		while (!myQueue.isEmpty()) {
	
			node = myQueue.peek();
			myQueue.remove();
			myStack.push(node);
		
			if (node.right != null) {
				myQueue.add(node.right);
			}
		
			if (node.left != null) {
				myQueue.add(node.left);
			}
		}
		while (!myStack.isEmpty()) {
			node = myStack.peek();
			System.out.print(node.data + " ");
			myStack.pop();
		}
	}

	public static void rotateDigit(String[] args) {
		ReverseOrder tree = new ReverseOrder();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		System.out.println("Level Order traversal of binary tree is :");
		reverseLevelOrder(root);
	}

}
/*
 * 
 * Level Order traversal of binary tree is :
 * 
 * 4 5 6 7 2 3 1
 * 
 */
 ```
