package linkedList;
/*
Original Linked list
7 8 3 5
Swaped Linked List
8 7 5 3
 */
public class _25_PairwiseSwapLinkedList {
    ListNode head;

    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void insertAtLast(int data) {
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        if (head == null) {
            head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    private static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    private ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(-1);
        ListNode current = temp;
        temp.next = head;

        while (current.next != null && current.next.next != null) {
            ListNode fast = current.next;
            ListNode second = current.next.next;
            fast.next = second.next;
            current.next = second;
            second.next = fast;
            current = current.next.next;
        }
        return temp.next;
    }


    public static void main(String[] args) {
        _25_PairwiseSwapLinkedList obj = new _25_PairwiseSwapLinkedList();

        obj.insertAtLast(7);
        obj.insertAtLast(8);
        obj.insertAtLast(3);
        obj.insertAtLast(5);

        System.out.println("Original Linked list");
        display(obj.head);

        System.out.println();

        System.out.println("Swaped Linked List");
        ListNode result = obj.swapPairs(obj.head);

        display(result);

    }

}
