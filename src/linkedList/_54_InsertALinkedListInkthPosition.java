package linkedList;

public class _54_InsertALinkedListInkthPosition {
 ListNode head;
    public static class ListNode {
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

    private static void display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    private static ListNode insertALinkedList(ListNode l1, ListNode l2, int k) {
        ListNode cur = l1;
        int count = 1;
        while (count < k && cur != null){
            cur = cur.next;
            count++;
        }
        System.out.println(cur.data);
        ListNode temp = cur.next;
        cur.next = l2;

        while (l2.next != null){
            l2 = l2.next;
        }
        l2.next = temp;
        return l1;
    }
    
    public static void main(String[] args) {
        _54_InsertALinkedListInkthPosition obj1 = new _54_InsertALinkedListInkthPosition();
        _54_InsertALinkedListInkthPosition obj2 = new _54_InsertALinkedListInkthPosition();

        obj1.insertAtLast(7);
        obj1.insertAtLast(8);
        obj1.insertAtLast(3);
        obj1.insertAtLast(5);
        obj1.insertAtLast(7);

        obj2.insertAtLast(50);
        obj2.insertAtLast(80);
        obj2.insertAtLast(60);

        //System.out.println("Linked List 1");
        display(obj1.head);
        System.out.println();
        // System.out.println("\nLinked List 2");
        display(obj2.head);

        System.out.println("\nAfter Insert");
        ListNode cur_head = insertALinkedList(obj1.head,obj2.head,2);
        display(cur_head);



    }


}