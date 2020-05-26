package linkedList;

public class _40_DeleteNode {

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
    void deleteNode(ListNode node, ListNode n) {
        if (node == n) {
            if (node.next == null) {
                System.out.println("There is only one node. The list "
                        + "can't be made empty ");
                return;
            }
            node.data = node.next.data;
            n = node.next;
            node.next = node.next.next;
            System.gc();
            return;
        }
        ListNode prev = node;
        while (prev.next != null && prev.next != n) {
            prev = prev.next;
        }
        if (prev.next == null) {
            System.out.println("Given node is not present in Linked List");
            return;
        }
        prev.next = prev.next.next;
        System.gc();
        return;
    }


    private  void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        _40_DeleteNode obj = new _40_DeleteNode();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();

        obj.deleteNode(obj.head, obj.head.next.next);

        obj.display();

    }
}
