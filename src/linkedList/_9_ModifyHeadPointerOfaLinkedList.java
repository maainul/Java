package linkedList;
// https://www.geeksforgeeks.org/how-to-write-functions-that-modify-the-head-pointer-of-a-linked-list/
public class _9_ModifyHeadPointerOfaLinkedList {
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


    public static void main(String[] args) {
        _9_ModifyHeadPointerOfaLinkedList obj = new _9_ModifyHeadPointerOfaLinkedList();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();

        obj.deleteFromFirst();
        System.out.println("\nModify head pointer from first");
        obj.display();


    }
}

