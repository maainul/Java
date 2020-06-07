package linkedList;

public class _1_InsertANode {
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

    private void insertNode(ListNode head, int k,int data) {
        ListNode newNode = new ListNode(data);

        ListNode currentListNode = head;
        ListNode previousListNode = null;
        int count = 0;
        while (count < k && currentListNode != null) {
            previousListNode = currentListNode;
            currentListNode = currentListNode.next;
            count++;
        }
        previousListNode.next = newNode;
        newNode.next = currentListNode;
    }

    public static void main(String[] args) {
        _1_InsertANode obj = new _1_InsertANode();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);

        obj.display();
        System.out.println();

        obj.insertNode(obj.head, 2, 10);

        System.out.println("After insert Value ");
        obj.display();


    }

}
