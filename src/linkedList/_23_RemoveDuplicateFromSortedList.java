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
    private  void display(ListNode head){
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

    // GeeksForGeeks
    private ListNode removeduplicate2() {
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur;
            while (temp != null && cur.data == temp.data) {
                temp = temp.next;
            }
            cur.next = temp;
            cur = cur.next;
        }

        return cur;
    }

    public static void main(String[] args) {
        _23_RemoveDuplicateFromSortedList obj = new _23_RemoveDuplicateFromSortedList();

        obj.insertAtLast(1);
        obj.insertAtLast(1);
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(2);
        obj.insertAtLast(2);
        obj.insertAtLast(6);

        System.out.println("\nOriginal list");
        obj.display();
        System.out.println("\nMethod 1 Remove Duplicate");
        obj.removeDuplicate();
        obj.display();

        //------------------------------------------------------------------------------------------//

        _23_RemoveDuplicateFromSortedList obj2 = new _23_RemoveDuplicateFromSortedList();
        obj2.insertAtLast(3);
        obj2.insertAtLast(3);
        obj2.insertAtLast(3);
        obj2.insertAtLast(3);
        obj2.insertAtLast(8);
        obj2.insertAtLast(8);
        obj2.insertAtLast(9);

        System.out.println("\n\n2nd Original list");
        obj2.display();
        System.out.println("\nMethod 2 Remove Duplicate");
        ListNode head = obj2.removeduplicate2();
        obj2.display(obj2.head);
    }
}


