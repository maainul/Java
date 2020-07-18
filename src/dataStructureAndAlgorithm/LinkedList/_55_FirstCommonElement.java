package dataStructureAndAlgorithm.LinkedList;
/*
First common element in two linked lists
Given two Linked Lists, find the first common element between given linked list
we need to find first node of first list which is also present in second list.
Examples:

Input :
   List 1: 10->15->4->20
   List 2:  8->4->2->10
Output : 10

Input :
   List1: 1->2->3->4
   Lsit2:  5->6->3->8
Output : 3
 */
public class _55_FirstCommonElement {
    ListNode head;

    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void insertAtLast(int data) {
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        if (head == null) {
            head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    private static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    private static int firstCommon(ListNode head1,ListNode head2){
        ListNode l1 = head1;

        while (l1 != null){
            ListNode l2 = head2;
            while (l2 != null){
                if (l1.data == l2.data){
                    return l1.data;
                }
                l2 = l2.next;
            }
            l1 = l1.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        _55_FirstCommonElement obj1 = new _55_FirstCommonElement();
        obj1.insertAtLast(7);
        obj1.insertAtLast(8);
        obj1.insertAtLast(3);

        _55_FirstCommonElement obj2 = new _55_FirstCommonElement();
        obj2.insertAtLast(5);
        obj2.insertAtLast(18);
        obj2.insertAtLast(8);

        System.out.println("Linked List 1");
        display(obj1.head);

        System.out.println();

        System.out.println("\nLinked List 2");
        display(obj2.head);

        System.out.println("\nCommon node ");

        System.out.println(firstCommon(obj1.head,obj2.head));

    }
}
