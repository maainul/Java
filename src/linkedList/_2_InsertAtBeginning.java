package linkedList;

public class _2_InsertAtBeginning {
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

    private void insertAtBeginning(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        _2_InsertAtBeginning obj = new _2_InsertAtBeginning();
        obj.insertAtBeginning(1);
        obj.insertAtBeginning(2);
        obj.insertAtBeginning(3);
        obj.insertAtBeginning(4);

        obj.display();
        System.out.println();


    }
}
