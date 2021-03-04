## Level order traversal line by line | Set 3 (Using One Queue)
Difficulty Level : Easy

Last Updated : 02 Nov, 2020

Given a Binary Tree, print the nodes level wise, each level on a new line.

![tree122](https://user-images.githubusercontent.com/37740006/108913475-31d05780-7654-11eb-9649-bab415327fde.gif)

## Algorithm
 1. First insert the root and a null element into the queue. 
  This null element acts as a delimiter. 
 2. Next pop from the top of the queue and add its left and right nodes to the end of the queue and 
 3. then print the top of the queue. 
  Continue this process till the queues become empty.
  ```java
  package dataStructureAndAlgorithm.Tree.BinaryTree.traversal._14_LevelOrderLineByLine;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class LevelOrderLineByLine {
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

	private void printlineByLine(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			Node current = queue.poll();
			if (current == null) {
				if (!queue.isEmpty()) {
					queue.add(null);
					System.out.println();
				}
			} else {
				if (current.left != null) {
					queue.add(current.left);
				}

				if (current.right != null) {
					queue.add(current.right);
				}

				System.out.print(current.data + " ");
			}
		}
	}

	public static void rotateDigit(String[] args) {
		LevelOrderLineByLine bt = new LevelOrderLineByLine();
		bt.createBinaryTree();
		bt.printlineByLine(bt.root);

	}
}
```