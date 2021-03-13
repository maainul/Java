package interviewQuestions;


public class _60_RemoveDuplicateFromUnsortedLinkedList {
    private static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void display(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    private static void removedulicate() {
        Node ptr1 = null, ptr2 = null;
        ptr1 = head;

        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;

            /* Compare the picked element with rest
                of the elements */
            while (ptr2.next != null) {

                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {

                    /* sequence of steps is important here */
                  //  dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                   // System.gc();
                } else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(11);
        Node third = new Node(10);
        Node fourth = new Node(21);
        Node fifth = new Node(20);
        Node sixth = new Node(30);
        Node seventh = new Node(10);
        Node eights = new Node(10);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eights;
        eights.next = null;
        display(head);
        removedulicate();
        System.out.println("\nRemove duplicate ");
        display(head);

    }
}
