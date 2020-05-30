package linkedList;

public class _13_NthNodeFromTheEndOfaLinkedList {
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
    // 13. FInd node end of linked list
    // https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
    private void findNodeFromEnd(int n){
        int len = 0;
        ListNode temp = head;

        // 1) count the number of nodes in Linked List
        while (head != null) {
            head = head.next;
            len++;
        }
        // check if value of n is not more than length of
        // the linked list
        if (len < n){
            return;
        }
        //temp = head;
        // 2) get the (len-n+1)th node from the beginning
        for (int i = 1; i < len - n + 1; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }


    public static void main(String[] args) {
        _13_NthNodeFromTheEndOfaLinkedList obj = new _13_NthNodeFromTheEndOfaLinkedList();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(44);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();

        obj.findNodeFromEnd(4);

    }
}

