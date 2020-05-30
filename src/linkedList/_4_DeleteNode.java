package linkedList;

public class _4_DeleteNode {
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
    private void deleteFromFirst(){
        ListNode c = head;
        c = head.next;
        head.next = null;
        head = c;
    }
    private  void  deleteFromLast(){
        ListNode slow = new ListNode(0);
        // ListNode slow = null;
        ListNode fast = head;
        while (fast.next != null){
            slow = fast;
            fast = fast.next;
        }
        slow.next = null;

    }


    public static void main(String[] args) {
        _4_DeleteNode obj = new _4_DeleteNode();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();

        obj.deleteFromFirst();
        System.out.println("\nDelete from first");
        obj.display();

        obj.deleteFromLast();
        System.out.println("\nDelete from last");
        obj.display();

    }
}