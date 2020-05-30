package linkedList;

public class _5_DeleteByPosition {
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

    private void  deleteByGivenPosition(int pos){
        ListNode previous = head;
        int count = 1;
        while(count < pos-1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next = current.next;
        current.next = null;
    }

    public static void main(String[] args) {
        _5_DeleteByPosition obj = new _5_DeleteByPosition ();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();
        obj.deleteByGivenPosition(4);
        System.out.println("\nDelete By position");
        obj.display();

    }
}
