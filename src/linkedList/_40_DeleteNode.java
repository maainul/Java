package linkedList;
/*
Given a Singly Linked List, write a function to delete a given node.
Your function must follow following constraints:

1) It must accept a pointer to the start node as the first parameter and node to be deleted as the second parameter,
a pointer to head node is not global.
2) It should not return a pointer to the head node.
3) It should not accept pointer to pointer to the head node.

You may assume that the Linked List never becomes empty.

Let the function name be deleteNode(). In a straightforward implementation, 
the function needs to modify the head pointer when the node to be deleted is the first node. 
As discussed in previous post, when a function modifies the head pointer, 
the function must use one of the given approaches, we can’t use any of those approaches here

Given Linked List: 12 15 10 11 5 6 2 3

Deleting node 10:
Modified Linked List: 12 15 11 5 6 2 3

Deleting first node
Modified Linked List: 15 11 5 6 2 3
*/
public class _40_DeleteNode {

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

    private void deleteNode(ListNode head, ListNode n) {
        if (head == n) {
            if (head.next == null) {
                System.out.println("There is only one node. The list "
                        + "can't be made empty ");
                return;
            }
            // 12 15 10
            // 15-->10
            // -- 15 10
            head.data = head.next.data;
            head.next = head.next.next;
            return;
        }
        // 12 15 10 11 5 6 2 3
        // 12 15 -- 11 5 6 2 3
        ListNode current = head;
        ListNode previous = null;
        while (current != null && current != n){
            previous = current;
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Given node is not present in Linked List");
            return;
        }
        previous.next = current.next;

        return;
    }

    private void deleteFromFirst(){
        ListNode temp = head;
        head = head.next;
        temp.next = null;
    }

    private  void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        _40_DeleteNode obj = new _40_DeleteNode();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();


        obj.deleteNode(obj.head, obj.head);
        obj.display();
        System.out.println();
        obj.deleteNode(obj.head, obj.head.next.next);
        obj.display();
        System.out.println();
        obj.deleteNode(obj.head, obj.head);
        obj.display();
        System.out.println();
        obj.deleteNode(obj.head, obj.head);
        obj.display();



    }
}
