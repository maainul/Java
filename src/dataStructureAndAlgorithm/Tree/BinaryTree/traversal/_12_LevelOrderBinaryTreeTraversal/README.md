***Breadth-first search (BFS) is an algorithm for traversing or searching tree or graph data structures. 
It starts at the tree root (or some arbitrary node of a graph, 
sometimes referred to as a 'search key'[1]), 
and explores all of the neighbor nodes at the present depth prior to moving on to the nodes at the next depth level.***
![DFS-VS-BFS](https://user-images.githubusercontent.com/37740006/108905617-1f512080-764a-11eb-9a07-9be6e0d6a501.png)

## Algorithm: 
```
For each node, first the node is visited and then it’s child nodes are put in a FIFO queue. 

printLevelorder(tree)
1) Create an empty queue q
2) temp_node = root /*start from root*/
3) Loop while temp_node is not NULL
    a) print temp_node->data.
    b) Enqueue temp_node’s children 
      (first left then right children) to q
    c) Dequeue a node from q.
```

***Time Complexity: O(n) where n is number of nodes in the binary tree***

***Space Complexity: O(n) where n is number of nodes in the binary tree***

```java
package dataStructureAndAlgorithm.Tree.BinaryTree.traversal._12_LevelOrderBinaryTreeTraversal;

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

public class BreadthFirstSearch {
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

	private void printLevelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.print(temp.data + " ");

			if (temp.left != null) {
				queue.add(temp.left);
			}

			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}

	public static void main(String[] args) {
		BreadthFirstSearch bt = new BreadthFirstSearch();

		bt.createBinaryTree();
		System.out.println("InOrder Binary Tree (Recursion)");

		bt.printLevelOrder(bt.root);
	}
}
```
