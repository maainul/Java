//package dataStructureAndAlgorithm.LinkedList.LinkedList.SinglyLinkedList;
//
//public class SinglyLinkedList {
//	Node head; // instance variable of node....is head.
//
//	public void insertAtLast(int data) {
//		Node node = new Node(data);
//		if (head == null) {
//			head = node;
//		} else {
//			Node current = head;
//			while (current.next != null) {
//				current = current.next;
//			}
//			current.next = node;
//		}
//	}
//
//	// insert at beginning
//	public void insertAtBeginning(int data) {
//		Node node = new Node(data);
//		node.next = head;
//		head = node;
//	}
//
//	// insert with index number
//	public void insertAt(int position, int data) {
//		Node node = new Node(data);
//		Node previous = head;
//		int count = 1;
//		if (position == 0) {
//			insertAtBeginning(data);
//		} else {
//			while (count < position - 1) {
//				previous = previous.next;
//				count++;
//			}
//			// 10-->8-->5--->9
//			Node current = previous.next;
//			node.next = current;
//			previous.next = node;
//		}
//
//	}
//
//	// insert by position using for loop
//	/*
//	 * public void insertAt(int position, int data){ Node node = new Node(data);
//	 * if(position == 0){ insertAtBeginning(data); } else{ //5--->7---8-->10--->null
//	 * //0---1----2---3--->null // position: 3 Node n = headNode; for (int i = 1;
//	 * i<position-1; i++){ n = n.nextNode; //7 } Node current = n.nextNode;
//	 * //current = 8 node.nextNode = current; //11---->8; n.nextNode =
//	 * node;//5--->7--->11--->8--->10 } }
//	 */
//	// delete from first
//	public void deleteFirst() {
//		if (head == null) {
//			System.out.println("No value found");
//		} else {
//			Node temp = head;
//			head = temp.next;
//			temp.next = null;
//
//		}
//	}
//
//	// delete from last....
//	public void deleteLast() {
//		Node last = head;
//		Node previousToLast = null;
//		while (last.next != null) {
//			previousToLast = last;
//			last = last.next;
//		}
//		previousToLast.next = null;
//	}
//
//	// delete list given position
//	public void deleteByPosition(int position) {
//		Node previous = head;
//		int count = 1;
//		if (position == 0) {
//			System.out.println("delete not posible");
//		} else {
//			while (count < position - 1) {
//				previous = previous.next;
//				count++;
//			}
//			Node current = previous.next;
//			previous.next = current.next;
//			current.next = null;
//		}
//	}
//
//	// delete by position for loop
//	/*
//	 * public void deleteAt(int position){ if(position == 0){
//	 * System.out.print("No data found"); } else{ Node previous = head; for(int i =
//	 * 1 ; i<position-1;i++){ previous = previous.next; } Node current =
//	 * previous.next; previous.next = current.next; current.next = null;
//	 *
//	 * } }
//	 */
//	// search node....
//	public void search(int searchval) {
//		Node node = head;
//		int i = 1;
//		boolean flag = false;
//
//		// checks whether list is empty....
//		if (head == null) {
//			System.out.println("List is empty....");
//		}
//
//		else {
//			while (node != null) {
//				// compare node to be found with each node present in the list....
//				if (node.data == searchval) {
//					flag = true;
//					break;
//				}
//				i++;
//				node = node.next;
//			}
//		}
//		if (flag) {
//			System.out.println("Element is the present in the list at position:" + i);
//		} else {
//			System.out.println("Element is not found...");
//		}
//	}
//
//// search using for loop
//
//	/*
//	 * public void search(int searchValue){ boolean flag = false; int i=0;
//	 * if(headNode == null){ System.out.println("No value found.."); } else{ Node
//	 * current = headNode; for ( i = 0; i<length; i++){ if(current.data ==
//	 * searchValue){ flag = true; break; } current =current.nextNode; } } if(flag){
//	 * System.out.println("Data found.. in position:"+(i+1)); } else {
//	 * System.out.println("data not found.."); } }
//	 */
//// sorted linklist.......
//	// sorted linked list is done by bubble sort algorithm..
//	// first set first node and next to first.
//	// check currentnode and next node data is > or not.
//	// if greater and them reverse
//	public void sorted() {
//		Node current = head, nextNodeToCurrent = null;
//		int temp;
//
//		if (head == null) {
//			System.out.println("no value found..");
//		} else {
//			while (current != null) {
//				nextNodeToCurrent = current.next; // next node..
//				while (nextNodeToCurrent != null) {
//					if (current.data > nextNodeToCurrent.data) {
//						temp = current.data;
//						current.data = nextNodeToCurrent.data;
//						nextNodeToCurrent.data = temp;
//					}
//					nextNodeToCurrent = nextNodeToCurrent.next;
//				}
//				current = current.next;
//			}
//		}
//	}
//	// duplicate value find method
//	// duplicate value find method
//	// it will delete duplicate value.
//	// 1--2---2---3---3---4---5
//	// 1--2---3---4---5
//
//	// set head and head next
//	// then compare is the value same or not
//	// if same, head go to the next and head not go to the head.next.next
//	// if != then head is next and after is after next.
//
//	public void deleteDuplicates() {
//		if ((head == null) || head.next == null) {
//			System.out.println("No value in the list..");
//		}
//
//		Node tempHeadNode = head;
//		Node afterHeadNode = head.next;
//
//		while (tempHeadNode.next != null) {
//			if (tempHeadNode.data == afterHeadNode.data) {
//				tempHeadNode.next = afterHeadNode.next;
//				afterHeadNode = afterHeadNode.next;
//			} else {
//				tempHeadNode = tempHeadNode.next;
//				afterHeadNode = afterHeadNode.next;
//			}
//		}
//	}
//	// duplicate value find method
//	// it will delete duplicate value.
//	// 1--2---2---3---3---4---5
//	// 1--2---3---4---5
//
//	public void deleteDuplicates2() {
//		Node currentNode = head;
//
//		while (currentNode.next != null && currentNode.next.next != null) {
//			if (currentNode.next.data == currentNode.data) {
//				currentNode.next = currentNode.next.next;
//			} else {
//				currentNode = currentNode.next;
//			}
//		}
//	}
//
//	// delete given value
//	// 1--2---3---4-----3---6---5
//	// delete 3 so
//	// ans : 1---2---3---6---5
//
//	public Node deleteDuplicatevalue(int val) {
//		// jodi head node null na hoi
//		// r head er value er sathe value mile jai tahole skip head..
//		//
//		while (head == null || head.data == val) {
//			head = head.next;
//		}
//		// System.out.println("no data found in the array...");
//		Node dummy = new Node(-1);
//		dummy.next = head;
//		Node previousNode = dummy;
//		Node currentNode = head;
//
//		while (currentNode != null) {
//			if (currentNode.data == val) {
//				previousNode.next = currentNode.next;
//				currentNode = currentNode.next;
//			} else {
//				previousNode = currentNode;
//				currentNode = currentNode.next;
//			}
//
//			// System.out.print("--->"+currentNode.data);
//		}
//		return dummy;
//
//	}
//
//	// duplicate value find and delete duplicate also
//	// 1--2---2---2--3--4
//	// 1---3--4
//	/*
//	 * public void deleteDuplicates2(Node head) { if(head == null || head.next ==
//	 * null) System.out.println("no data found in the array..."); Node dummy = new
//	 * Node(-1); dummy.next = head; Node curr = dummy;
//	 *
//	 * while(curr.next != null && curr.next.next != null){ if(curr.next.data ==
//	 * curr.next.next.data){ int val = curr.next.data; while(curr.next != null &&
//	 * curr.next.data == val){ curr.next = curr.next.next; } } else { curr =
//	 * curr.next; } }
//	 *
//	 * //return dummy.next; System.out.println(dummy.next); }
//	 *
//	 */
//
//	// display
//	public void display() {
//
//		Node current = head;
//		if (head == null) {
//			System.out.println("No data found..");
//		} else {
//			while (current != null) {
//				System.out.print(current.data + "-->");
//				current = current.next;
//			}
//			System.out.println(current);
//		}
//	}
//
//	public Node reversedisplay() {
//		Node prev = null;
//		Node curr = head;
//		while (curr != null) {
//			Node nextTemp = curr.next;
//			curr.next = prev;
//			prev = curr;
//			curr = nextTemp;
//		}
//		return prev;
//	}
//
//	// length
//	public int length() {
//		Node currentNode = head;
//		int len = 1;
//		while (currentNode.next != null) {
//			currentNode = currentNode.next;
//			len++;
//		}
//		return len;
//	}
//
//	// delete node from last interviewQuestions.leetcode problem
//	Node deleteNode2(int position) {
//		Node revHeadNode = reverseList(head);
//		Node revHedNodeCopy = revHeadNode;// 5-> 4-> 3-> 2-> 1
//		Node previousNode = revHeadNode;
//		int count = 1;
//		if (position == 0) {
//			return null;
//		} else {
//			while (count < position - 1) {
//				previousNode = previousNode.next;
//				count++;
//			}
//			Node currentNode = previousNode.next;
//			previousNode.next = currentNode.next;
//			currentNode.next = null;
//		}
//
//		return reverseList(revHedNodeCopy);
//
//	}
//
//	@SuppressWarnings("unused")
//	public static Node recursiveReverse(Node head) {
//		Node head1 = null;
//
//		if (head1 == null || head1.next == null)
//			return head1;
//
//		head1 = recursiveReverse(head1.next);
//		head1.next.next = head1;
//		head1.next = null;
//
//		return head1;
//	}
//
//	public Node reverseList(Node head) {
//		Node current = head;
//		Node previous = null;
//		Node next = null;
//		while (current != null) {
//			next = current.next;
//			current.next = previous;
//			previous = current;
//			current = next;
//		}
//		return previous;
//	}
//}
