package linkedList;
/*
Delete N nodes after M nodes of a linked list
Given a linked list and two integers M and N. 
Traverse the linked list such that you retain M nodes then delete next N nodes, continue the same till end of the linked list.

Difficulty Level: Rookie

  Examples:

  Input:
    M = 2, N = 2
    Linked List: 1->2->3->4->5->6->7->8
  Output:
    Linked List: 1->2->5->6

  Input:
    M = 3, N = 2
    Linked List: 1->2->3->4->5->6->7->8->9->10
  Output:
    Linked List: 1->2->3->6->7->8

  Input:
    M = 1, N = 1
    Linked List: 1->2->3->4->5->6->7->8->9->10
  Output:
    Linked List: 1->3->5->7->9
 */
// https://www.geeksforgeeks.org/delete-n-nodes-after-m-nodes-of-a-linked-list/
public class _48_DeleteNnodesAfterMnodes {
    ListNode head;

    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void display(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private void insertAtLast(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    private void skipMdeleteN(ListNode head, int M, int N) {
        ListNode firstPart = head;

        int Mcounter = 1;

        while (Mcounter < M && firstPart.next != null) {
            firstPart = firstPart.next;
            Mcounter++;
        }

        ListNode secondPart = firstPart.next;
        int Ncounter = 1;
        while (Ncounter <= N && secondPart.next != null) {
            secondPart = secondPart.next;
            Ncounter++;
        }

        firstPart.next = secondPart;

    }

    public static void main(String args[]) {
        _48_DeleteNnodesAfterMnodes obj = new _48_DeleteNnodesAfterMnodes();

        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);
        obj.insertAtLast(7);
        obj.insertAtLast(8);
        obj.insertAtLast(9);
        obj.insertAtLast(10);
        obj.insertAtLast(11);

        int M = 2, N = 3;

        System.out.printf("M = %d, N = %d \nGiven" + "Linked list is :\n", M, N);

        obj.display(obj.head);

        obj.skipMdeleteN(obj.head, M, N);

        System.out.printf("\nLinked list after deletion is :\n");
        obj.display(obj.head);
    }
}
