package linkedList;

public class _23_RemoveDuplicateFromSortedList {
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

    private void removeDuplicate(){
        ListNode slow = head;
        ListNode fast = head.next;
        while( fast != null){
            if(slow.data == fast.data){
                slow.next = fast.next;
            }else {
                slow = slow.next;
            }
            fast = fast.next;
        }
    }

    public static void main(String[] args) {
        _23_RemoveDuplicateFromSortedList obj = new _23_RemoveDuplicateFromSortedList();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();

        obj.removeDuplicate();
        obj.display();

    }
}


