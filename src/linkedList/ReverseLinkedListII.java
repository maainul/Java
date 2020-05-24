/*
Reverse a linked list from position m to n. Do it in one-pass.

Note: 1 ≤ m ≤ n ≤ length of list.

Example:

Input: 1->2->3->4->5->NULL, m = 2, n = 4
Output: 1->4->3->2->5->NULL
 */
package linkedList;

import java.util.List;

public class ReverseLinkedListII {

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

    private ListNode reverseWithGroup(ListNode head, int k){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        int count = 0;
        while (count < k && current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            count++;
        }
        if(next != null){
            head.next = reverseWithGroup(next,k);
        }
        return previous;
    }

    private ListNode reverseII(int m, int n){
        ListNode dummyHead = new ListNode(0);
        ListNode pre = dummyHead;
        dummyHead.next = head;
        for (int i = 0; i< m-1; i++){
            pre= pre.next;
        }
        ListNode previous = null;
        ListNode current = pre.next;
        for (int j = 0; j< n-m ;j++){
           ListNode nxt = current.next;
           current.next = nxt.next;
           nxt.next = pre.next;
           pre.next = nxt;

            // 1 2 3 4 5 6 7
            // 1 2 [4 3] 5 6 7
            // 1 2 [5 4 3] 6 7
            // 1 2 [6 5 4 3] 7

        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ReverseLinkedListII reverseLinkedList = new ReverseLinkedListII();
        reverseLinkedList.insertAtLast(1);
        reverseLinkedList.insertAtLast(2);
        reverseLinkedList.insertAtLast(3);
        reverseLinkedList.insertAtLast(4);
        reverseLinkedList.insertAtLast(5);
        reverseLinkedList.insertAtLast(6);
        reverseLinkedList.insertAtLast(7);
        System.out.println("\nOriginal");
        reverseLinkedList.display();
        System.out.println("\nAfter Reverse");
        reverseLinkedList.head = reverseLinkedList.reverseII(3,6);
        reverseLinkedList.display();



    }
}
