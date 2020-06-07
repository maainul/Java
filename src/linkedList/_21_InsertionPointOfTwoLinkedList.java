//  Write a function to get the intersection point of two linked lists
package linkedList;
/*
Write a function to get the intersection point of two Linked Lists
There are two singly linked lists in a system. By some programming error,
the end node of one of the linked list got linked to the second list,
forming an inverted Y shaped list. Write a program to get the point where two linked list merge.
Y ShapedLinked List
Above diagram shows an example with two linked list having 15 as intersection point.
 */
import java.util.HashSet;

public class _21_InsertionPointOfTwoLinkedList {

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


    // 21.Write a function to get the intersection point of two linked lists
    //https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
    private static ListNode insertionNode(ListNode headA, ListNode headB){
        HashSet<ListNode> hs = new HashSet<ListNode>();
        while(headA != null){
            hs.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(hs.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }



    public static void main(String[] args) {

        _21_InsertionPointOfTwoLinkedList objA = new _21_InsertionPointOfTwoLinkedList();
        objA.insertAtLast(1);
        objA.insertAtLast(2);
        objA.insertAtLast(3);
        objA.insertAtLast(4);
        objA.insertAtLast(5);
        _21_InsertionPointOfTwoLinkedList objB = new _21_InsertionPointOfTwoLinkedList();

        objB.insertAtLast(10);
        objB.insertAtLast(9);
        objB.insertAtLast(8);
        objB.insertAtLast(4);
        objB.insertAtLast(5);
        objB.insertAtLast(6);
        objB.insertAtLast(7);
        System.out.println("\nLinked List A");
        objA.display();
        System.out.println("\nLinked List B");
        objB.display();
        System.out.println("\n");

        System.out.println("Insertion Node is :"+insertionNode(objA.head, objB.head));

    }
}

