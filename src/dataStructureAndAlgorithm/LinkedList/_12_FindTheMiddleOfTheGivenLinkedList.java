package dataStructureAndAlgorithm.LinkedList;

public class _12_FindTheMiddleOfTheGivenLinkedList {
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

    private void middleOfLinkedList() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("The middle element is [" +
                slow.data + "] \n");
    }

    public static void main(String[] args) {
        _12_FindTheMiddleOfTheGivenLinkedList obj = new _12_FindTheMiddleOfTheGivenLinkedList();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);

        obj.display();
        System.out.println();
        obj.middleOfLinkedList();


    }
}

