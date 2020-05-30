package linkedList;

public class _25_PairwiseSwapLinkedList {
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

    // https://www.geeksforgeeks.org/pairwise-swap-elements-of-a-given-linked-list/
    private void swapElement(){
        if(head == null){
            return;
        }
        ListNode temp = head;
        while (temp != null && temp.next != null){
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

    public static void main(String[] args) {
        _25_PairwiseSwapLinkedList obj = new _25_PairwiseSwapLinkedList();

        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(5);
        obj.insertAtLast(5);
        obj.insertAtLast(6);
       

        obj.display();
        System.out.println();

        obj.swapElement();
        obj.display();

    }

}
