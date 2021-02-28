# Merge Sort

1. Merge Sort is a Divide and Conquer algorithm. 

2. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.

## Merge Sort Complexity
## Time Complexity

**Best Case Complexity: O(n*log n)**

**Worst Case Complexity: O(n*log n)**

**Average Case Complexity: O(n*log n)**

Space Complexity
The space complexity of merge sort is O(n).

```
MergeSort(arr[], l,  r)
If r > l
     1. Find the middle point to divide the array into two halves:  
             middle m = l+ (r-l)/2
     2. Call mergeSort for first half:   
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
 ```
 
![Merge-Sort-Tutorial](https://user-images.githubusercontent.com/37740006/109424994-66576100-7a10-11eb-9d64-b6c23b075b40.png)

Node.java
```java
package dataStructureAndAlgorithm.Sorting.MergeSort;

public class Node {
	Node head;
	int data;
	Node next;
	int length = 0;

	Node(int data) {
		this.data = data;
		this.next = null;
	}

	Node() {

	}

	void display(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println(current);
	}

	/*
	 * Node push(int i) { Node newNode = new Node(i); newNode.next = head; head =
	 * newNode; length++; return this; }
	 */
	void insertAtlast(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}

	}

	public int getLength() {
		return length;
	}
}
```
MergeSort.java
```java
package dataStructureAndAlgorithm.Sorting.MergeSort;

public class MergeSort {

	static Node merge(Node left, Node right) {
		if (left == null)
			return right;
		if (right == null)
			return left;

		Node result = null;

		if (left.data <= right.data) {
			result = left;
			result.next = merge(left.next, right);
		} else {
			result = right;
			result.next = merge(left, right.next);
		}
		return result;
	}

	static Node mergeSort(Node head) {
		if (head == null || head.next == null)
			return head;

		Node middle = getMiddle(head);
		Node nextofmiddle = middle.next;
		middle.next = null;
		Node left = mergeSort(head);
		Node right = mergeSort(nextofmiddle);
		Node sortedlist = merge(left, right);
		return sortedlist;
	}

	static Node getMiddle(Node head) {
		if (head == null)
			return head;
		Node fastPtr = head.next;
		Node slowPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}

	public static void main(String[] args) {

		Node list = new Node();
		list.insertAtlast(38);
		list.insertAtlast(27);
		list.insertAtlast(9);
		list.insertAtlast(3);
		list.insertAtlast(82);
		// nodeRef.push(10).push(82).push(9).push(3).push(43).push(27).push(38);

		System.out.print("UNSorted Linked List is: ");
		list.display(list.head);

		list.head = mergeSort(list.head);

		System.out.print("Sorted Linked List is: ");
		list.display(list.head);
	}
}
```
