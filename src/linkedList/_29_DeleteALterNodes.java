package linkedList;
/*
Delete alternate nodes of a Linked List
Given a Singly Linked List,
starting from the second node delete all alternate nodes of it.

For example, if the given linked list is
    1->2->3->4->5 then your function should convert it to
    1->3->5, and if

the given linked list is
    1->2->3->4 then convert it to
    1->3.

Input : 2->3->4->5->6->
Output : 2->4->6->
*/
public class _29_DeleteALterNodes {
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
    // 29. Delete alternate nodes of a linked list
    private void DeleteAlterNode(){
        if(head == null){ return; }

        ListNode previous = head;
        ListNode current = head.next;

        while (previous != null && previous.next != null){
            previous.next = current.next;
            current.next = null;
            //current = null;
            previous = previous.next;

            if(previous != null){
                current = previous.next;
            }
        }
    }

    public static void main(String[] args) {
        _29_DeleteALterNodes obj = new _29_DeleteALterNodes();
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);
        obj.display();

        System.out.println();
        obj.DeleteAlterNode();
        obj.display();
    }
}
