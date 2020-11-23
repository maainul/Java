package dataStructureAndAlgorithm.LinkedList;

public class _7_FindLength {
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
    public int length(){
        ListNode c = head;
        int len = 0;
        while (c != null){
            c = c.next;
            len++;
        }
        return  len;
    }
    
    public int lengthRec(ListNode head){
        if(head == null){
            return 0;
        }
        return 1+lengthRec(head.next);
    }

    public static void main(String[] args) {
        _7_FindLength obj = new _7_FindLength();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println("\nLength of Linked List:");
        System.out.println(obj.length());
        System.out.println("\nLength Recursive");
        System.out.println(obj.lengthRec(obj.head));

    }
}

