package leetcode.LinkedList.DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyLinkList doublyLinkList = new DoublyLinkList();
		doublyLinkList.insertAtLast(5);
		doublyLinkList.insertAtLast(8);
		doublyLinkList.insertAtLast(6);
		doublyLinkList.insertAtLast(9);
		doublyLinkList.insertBeginning(9);
		doublyLinkList.insertBeginning(12);
		doublyLinkList.displayForward();
		// doublyLinkList.displaybackward();
		doublyLinkList.search(5);

		doublyLinkList.insertAt(2, 4);
		doublyLinkList.insertAt(5, 10);
		doublyLinkList.insertAt(7, 11);
		doublyLinkList.displayForward();

		doublyLinkList.displayForward();
		doublyLinkList.deletebyPosition(3);
		doublyLinkList.displayForward();
		doublyLinkList.deletebyPosition(3);
		doublyLinkList.displayForward();

	}

}
// 12-->9-->5-->8-->6-->9-->null
// 9-->6-->8-->5-->9-->12-->null
