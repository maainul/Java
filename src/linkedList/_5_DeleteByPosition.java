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
    private void deleteByGivenIndex(int k){
        ListNode current = head;
        ListNode previous = null;
        int count = 0;
        while (current != null && count < k){
            previous = current;
            current = current.next;
            count++;
        }
        previous.next = current.next;
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
        System.out.println("\nDelete By position");
        obj.deleteByGivenIndex(2);
        obj.display();

    }
}
