package dataStructureAndAlgorithm.LinkedList;
/*
Check if a linked list is Circular Linked List
Given a singly linked list, find if the linked list is circular or not.
A linked list is called circular if it is not NULL-terminated and all nodes are connected in the form of a cycle.
Below is an example of a circular linked list.

An empty linked list is considered as circular.
Note that this problem is different from cycle detection problem, here all nodes have to be part of cycle.
 */
public class _53_CheckLinkedListCircularOrNot {

    /* Link list Node */
    static class Node
    {
        int data;
        Node next;
    }

    /*This function returns true if given linked
    list is circular, else false. */
    static boolean isCircular( Node head)
    {
        if (head == null){
            return true;
        }
        Node node = head.next;
        while (node != null && node != head){
            node = node.next;
        }
        return (node == head);
    }

    // Utility function to create a new node.
    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    /* Driver code*/
    public static void main(String args[])
    {
        /* Start with the empty list */
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);

        System.out.print(isCircular(head)? "Yes\n" :
                "No\n" );

        // Making linked list circular
        head.next.next.next.next = head;

        System.out.print(isCircular(head)? "Yes\n" :
                "No\n" );

    }
}

// This code contributed by Arnab Kundu
