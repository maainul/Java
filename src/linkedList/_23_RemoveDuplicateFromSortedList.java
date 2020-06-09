package linkedList;
/*
Given a sorted linked list, delete all nodes that have duplicate numbers,
leaving only distinct numbers from the original list.

Return the linked list sorted as well.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->3-->4-->5
Example 2:

Input: 1->1->1->2->3
Output: 1-->2->3
 */
public class _23_RemoveDuplicateFromSortedList {
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

    private void removeDuplicate(){
        ListNode slow = head;
        ListNode fast = head.next;
        while( fast != null){
            if(slow.data == fast.data){
                slow.next = fast.next;
            }else {
                slow = slow.next;
            }
            fast = fast.next;
        }
    }

    public static void main(String[] args) {
        _23_RemoveDuplicateFromSortedList obj = new _23_RemoveDuplicateFromSortedList();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(5);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();

        obj.removeDuplicate();
        obj.display();

    }
}


