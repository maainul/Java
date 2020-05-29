package linkedList;

import java.util.List;
/*
Merge a Linked list into another Linked List at Alternate Positions.
Objective: Given two linked lists, merge one list into another at alternate positions,
if second link list has extra nodes, print them as well

Example:

    5 -> 10 -> 15 -> 20 ->25 -> null
    3 -> 6 ->9 -> 12 ->15 ->18 ->21 -> null

Output :
    5 -> 3 -> 10 -> 6 ->15 -> 9 -> 20 -> 12 -> 25 ->15 -> null
    Remaining List : 18 -> 21 -> null

Approach:

    Say Node A and Node B are the starting of two linked list.
        Take Node temp = A ( store the head of the link list one).
        Take Node A1 = A.next and Node B1 = B.next;
        Make A.next points to the B.
        Make B.next = A1. (at this point B is inserted between A and A1).
        Do the above two steps till one of the list burns out.
        Print the list using temp node.
        Print the remaining list in B, B will be pointing to the head of the remaining list.
 */
// https://algorithms.tutorialhorizon.com/merge-a-linked-list-into-another-linked-list-at-alternate-positions/

public class _50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions {
    Node head;
     class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void alterMerge(Node a, Node b) {
        Node temp = a;// it will be needed to get the head of the new list
        while (a != null && b != null) {
            Node a1 = a.next;
            Node b1 = b.next;
            a.next = b;
            b.next = a1;
            a = a1;
            b = b1;
        }
        System.out.println("\nAlternate Merged List");
        display(temp);
        System.out.println("\nRemaining Second List");
        display(b);// b will be pointing to the ahead of the remaining list

    }

    public void display(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
    }
        private void insertAtLast(int data){
            Node newNode = new Node(data);
            Node current = head;

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


    public static void main(String[] args) throws java.lang.Exception {
        _50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions obj1 = new _50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions();
        _50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions obj2 = new _50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions();

        obj1.insertAtLast(5);
        obj1.insertAtLast(10);
        obj1.insertAtLast(105);
        obj1.insertAtLast(200);
        obj1.insertAtLast(215);

        obj2.insertAtLast(15);
        obj2.insertAtLast(110);
        obj2.insertAtLast(106);
        obj2.insertAtLast(201);
        obj2.insertAtLast(205);
        obj2.insertAtLast(205);
        obj2.insertAtLast(205);
        obj2.insertAtLast(205);
        obj2.insertAtLast(125);

        _50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions i = new _50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions();

        i.display(obj1.head);
        System.out.println("");

        i.display(obj2.head);
        i.alterMerge(obj1.head, obj2.head);
    }
}


