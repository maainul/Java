https://github.com/maainul/Java/blob/master/src/linkedList/images/56.1.png

https://github.com/maainul/Java/blob/master/src/linkedList/images/56.2.png

package linkedList;

public class _56_MakeaLoopAtkthPosition {

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
    private static ListNode insertALinkedList(ListNode l1, ListNode l2, int k) {
        ListNode cur = l1;
        int count = 1;
        while (count < k && cur != null) {
            cur = cur.next;
            count++;
        }
        System.out.println(cur.data);
        ListNode temp = cur.next;
        cur.next = l2;

        while (l2.next != null) {
            l2 = l2.next;
        }
        l2.next = temp;
        return l1;
    }
    private static void printLoop(ListNode head, int total_nodes) {
        ListNode cur = head;
        int count = 0;
        while (count < total_nodes){
            System.out.print(cur.data+" ");
            count++;
            cur = cur.next;
        }
    }

    private ListNode makeLoop(ListNode head, int i) {
        ListNode temp = head;
        int count = 1;
        while (count < i ){
            temp = temp.next;
            count++;
        }
        ListNode joint_node = temp;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = joint_node;
        return head;
    }

    private static int countNodes(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        _56_MakeaLoopAtkthPosition obj1 = new _56_MakeaLoopAtkthPosition();
        obj1.insertAtLast(7);
        obj1.insertAtLast(8);
        obj1.insertAtLast(3);
        obj1.insertAtLast(5);
        obj1.insertAtLast(17);
        int total_nodes = countNodes(obj1.head);
        System.out.println("Original Linked list");
        printLoop(obj1.head,total_nodes);

        System.out.println("\nAfter making loop");
        ListNode head = obj1.makeLoop(obj1.head, 4);

        printLoop(obj1.head,total_nodes);

    }


}
