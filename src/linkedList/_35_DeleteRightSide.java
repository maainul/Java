package linkedList;
/*
Delete nodes which have a greater value on right side

Given Linked List
12 15 10 11 5 6 2 3

Modified Linked List
15 11 6 3 

Given a singly linked list, remove all the nodes which have a greater value on right side.

Examples:
a) The list 12->15->10->11->5->6->2->3->NULL 
    should be changed to 15->11->6->3->NULL. 
    Note that 12, 10, 5 and 2 have been deleted because there is a greater value on the right side.

When we examine 12, we see that after 12 there is one node with value greater than 12 (i.e. 15), 
so we delete 12.
When we examine 15, we find no node after 15 that has value greater than 15 so we keep this node.
When we go like this, we get 15->6->3

b) The list 10->20->30->40->50->60->NULL should be changed to 60->NULL. Note that 10, 20, 30, 40 and 50 have been deleted because they all have a greater value on the right side.

c) The list 60->50->40->30->20->10->NULL should not be changed.

*/

public class _35_DeleteRightSide {

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

    private ListNode delNodes(ListNode head){
        ListNode curr = head;
        // 12 15 10 11 5 6
        while(curr != null && curr.next != null){
            if(curr.data < curr.next.data){
                ListNode temp = curr.next; // 15
                curr.data = temp.data; // 15-->
                curr.next = temp.next; //
                temp = null;
            }else{
                curr = curr.next;
            }
        }
        return curr;
    }
    public static void main(String[] args) {
        _35_DeleteRightSide obj = new _35_DeleteRightSide();
        obj.insertAtLast(12);
        obj.insertAtLast(15);
        obj.insertAtLast(10);
        obj.insertAtLast(11);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        System.out.println("\nOriginal Linked List");
        obj.display();

        System.out.println("\nAfter Delete Linked List");
        obj.delNodes(obj.head);

        obj.display();



    }
}
