package linkedList;

public class _46_SortLinkedList0s1s2s {

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
        _46_SortLinkedList0s1s2s obj = new _46_SortLinkedList0s1s2s();

        obj.insertAtLast(1);
        obj.insertAtLast(2);

        obj.insertAtLast(2);
        obj.insertAtLast(0);

        obj.insertAtLast(0);
        obj.insertAtLast(1);

        obj.insertAtLast(2);
        obj.insertAtLast(0);

        obj.display();
        System.out.println();

    }
}

