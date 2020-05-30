package linkedList;
/*
Given a linked list which is sorted, how will you insert in sorted way
Given a sorted linked list and a value to insert, write a function to insert the value in a sorted way.

Initial Linked List
    0 3 5 18 20
SortedLinked List
 0 3 5 18 20
Linked List after insertion of 9
 0 3 5 9 18 20 
UpdatedSortedLinked List
 */
public class _18_SortedInsertLikedList {
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
    private void sortedInsert(int data){
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        if(head == null || head.data >= newNode.data){
            newNode.next = head;
            head = newNode;
        }else{
            while (current.next != null && current.next.data <= newNode.data){
                current = current.next;
            }
            // ListNode nextTonew = current.next;
            // newNode.next = nextTonew;
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public static void main(String[] args) {
        _18_SortedInsertLikedList obj = new _18_SortedInsertLikedList();

        obj.sortedInsert(5);
        obj.sortedInsert(3);
        obj.sortedInsert(12);
        obj.sortedInsert(0);

        obj.display();
    }
}

