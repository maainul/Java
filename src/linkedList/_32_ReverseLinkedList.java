package linkedList;

public class _32_ReverseLinkedList {
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

    public static void main(String[] args) {
        _32_ReverseLinkedList reverseLinkedList = new _32_ReverseLinkedList();
        reverseLinkedList.insertAtLast(1);
        reverseLinkedList.insertAtLast(2);
        reverseLinkedList.insertAtLast(3);
        reverseLinkedList.insertAtLast(4);
        reverseLinkedList.insertAtLast(5);
        System.out.println("\nOriginal");
        reverseLinkedList.display();
        System.out.println("\nAfter Reverse");
        reverseLinkedList.head = reverseLinkedList.reverseWithGroup(reverseLinkedList.head,2);
        reverseLinkedList.display();



    }
}
