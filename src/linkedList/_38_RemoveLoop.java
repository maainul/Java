package linkedList;
/********************************************************************
 Detect and Remove Loop in a Linked List
 Write a function detectAndRemoveLoop()
 that checks whether a given Linked List contains loop and
 if loop is present then removes the loop and returns true.

 If the list doesn’t contain loop then it returns false.
 Below diagram shows a linked list with a loop.
 detectAndRemoveLoop() must change the below list to 1->2->3->4->5->NULL.

*************************************************************************/
public class _38_RemoveLoop {

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

    public static void main(String[] args) {
        _38_RemoveLoop obj = new _38_RemoveLoop();
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
