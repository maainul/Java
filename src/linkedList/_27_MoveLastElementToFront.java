package linkedList;

public class _27_MoveLastElementToFront {
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
    private void moveLastNodeToFront(){
        ListNode slow = new ListNode(0);
        slow.next = head;
        ListNode fast = head;
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        head = fast;
        slow.next = null;
    }

    public static void main(String[] args) {
        _27_MoveLastElementToFront obj = new _27_MoveLastElementToFront();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();

        obj.moveLastNodeToFront();
        obj.display();

    }
}

