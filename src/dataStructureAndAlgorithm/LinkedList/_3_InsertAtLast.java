package dataStructureAndAlgorithm.LinkedList;
/*
Insert Node at beginning
5-->1--->2--->4-->null

Want to add 15 at last.

5-->1-->2---4-->15---->null
 */
public class _3_InsertAtLast {
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

        if(head == null){
            head = newNode;
        }
        else{
            ListNode current = head;
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

    public static void main(String[] args) {
        _3_InsertAtLast obj = new _3_InsertAtLast();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();

    }
}
