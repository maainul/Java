package linkedList;
/********************************************************
Finding Median in a Sorted Linked List
Given A sorted linked list of N elements.
The task is to find the median in the given Sorted Linked List.

We know that median in a sorted array is the middle element.

Procedure to find median of N sorted numbers:

if N is odd:
    median is N/2th element
else
    median is N/2th element + (N/2+1)th element
Examples:


Input : 1->2->3->4->5->NULL
Output : 3

Input : 1->2->3->4->5->6->NULL
Output : 3.5
 ***************************************/
public class _59_FindMedianOfSortedLinkedList {
    ListNode head;
    public class ListNode {
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    private void insertAtLast(int data){
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        if(head == null){
            head = newNode;
        }
        else{
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    private  void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        _59_FindMedianOfSortedLinkedList obj = new _59_FindMedianOfSortedLinkedList();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
       // obj.insertAtLast(6);
        System.out.println("Linked List");
        obj.display();
        obj.median();

    }

    private void median() {
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre_slow = slow;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            pre_slow = slow;
            slow = slow.next;
        }

        if(fast != null){
            System.out.println("Median (odd):"+slow.data);
        }else{
            System.out.println("Median (even) : "+ (float)(slow.data + pre_slow.data )/2);
        }
    }
}
