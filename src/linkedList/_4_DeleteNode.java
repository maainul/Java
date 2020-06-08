package linkedList;
/*
Delete from first
2->3->4->5->6->
Delete from last
2->3->4->5->
Delete from key
2->3->5->
3->5->

 */
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
        ListNode temp = head;
        head = head.next;
        temp.next = null;

    }
    // delete data not node..
    // 12 15 10
    // (12 = 15)-->10
    private void deleteFromFirst2(){
        head.data = head.next.data;
        head.next = head.next.next;

    }

    private  void  deleteFromLast(){
       ListNode current = head;
       ListNode previous = null;

       while (current.next != null){
           previous = current;
           current = current.next;
       }
       previous.next = null;
    }

    private  void  deleteANode(int k){
        ListNode current = head;
        ListNode previous = null;
        while (current != null && current.data != k){
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
    }

    private void delete(){
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
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


        obj.deleteANode(4);
        System.out.println("\nDelete from key");
        obj.display();


        System.out.println();
        obj.deleteFromFirst2();
        obj.display();



    }
}
