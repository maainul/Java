package linkedList;
/*
Segregate(আলাদা করে দেওয়া) even and odd nodes in a Linked List
Given a Linked List of integers,
write a function to modify the linked list such that
all even numbers appear before all the odd numbers in the modified linked list.
Also, keep the order of even and odd numbers same.

Examples:

    Input: 17->15->8->12->10->5->4->1->7->6->NULL
    Output: 8->12->10->4->6->17->15->5->1->7->NULL

    Input: 8->12->10->5->4->1->6->NULL
    Output: 8->12->10->4->6->5->1->NULL

    // If all numbers are even then do not change the list
    Input: 8->12->10->NULL
    Output: 8->12->10->NULL

    // If all numbers are odd then do not change the list
    Input: 1->3->5->7->NULL
    Output: 1->3->5->7->NULL
*/
public class _36_SegregateEvenAndOddNodes {

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

    public static ListNode rearrangeEvenOdd(ListNode head)
    {
        ListNode odd = null, oddTail = null;
        ListNode even = null, evenTail = null;
        ListNode curr = head;

        while (curr != null)
        {
            if (curr.data  % 2 == 0) // current node is even
            {  // handle head for first even node
                if (even == null) {
                    even = evenTail = curr;
                }
                else
                {
                    evenTail.next = curr;
                    evenTail = curr;
                }

            }
            else // current node is odd
            {
                // handle head for first odd node
                if (odd == null) {
                    odd = oddTail = curr;
                }
                else
                {
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }

            }
            curr = curr.next;
        }

        // if list contains at-least one even node
        if (even != null)
        {
            head = even;
            System.out.println(even.data);
            System.out.println(odd.data);
            evenTail.next = odd;
        }
        // special case - list contains all odd nodes
        else {
            head = odd;
            //System.out.println(odd.data);
        }

        // null to terminate the list,
        // else it will go in infinite loop
        if (oddTail != null) {
            oddTail.next = null;
        }

        return head;
    }

    public static void main(String[] args) {
        _36_SegregateEvenAndOddNodes obj = new _36_SegregateEvenAndOddNodes();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();
        obj.head = obj.rearrangeEvenOdd(obj.head);
        //reverseLinkedList.head = reverseLinkedList.reverseWithGroup(reverseLinkedList.head,2);
        //reverseLinkedList.display();
        obj.display();
    }
}
