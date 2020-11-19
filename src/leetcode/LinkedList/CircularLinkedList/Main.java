package leetcode.LinkedList.CircularLinkedList;

public class Main {

	public static void main(String[] args) {
		CircularLinkList circularLinkList = new CircularLinkList();
		circularLinkList.insertAtBeginning(5);
		circularLinkList.insertAtBeginning(8);
		circularLinkList.insertAtBeginning(6);
		circularLinkList.insertAtBeginning(9);
		circularLinkList.insertAtLast(1);
		circularLinkList.insertAtLast(3);
		circularLinkList.insertAtLast(7);
		circularLinkList.display();

	}

}
// 9 6 8 5 1 3 7

