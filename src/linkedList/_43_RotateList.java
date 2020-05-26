package linkedList;

public class _43_RotateList {

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
    private  void rotateLinkedList(int k){
        ListNode fast = head;
        ListNode slow =  head;
        ListNode c = head;
        int len = 1;
        while(c.next != null){
            c = c.next;
            len++;
        }
        k = k% len;
        for (int i = 0; i< k; i++){
            fast = fast.next;
        }
        while (fast.next !=null ){
            slow =slow.next;
            fast = fast.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;

    }
    public static void main(String[] args) {
        _43_RotateList obj = new _43_RotateList();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();
        obj.rotateLinkedList(3);
        obj.display();

    }
}
