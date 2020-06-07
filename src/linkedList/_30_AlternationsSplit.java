package linkedList;
/*
Alternating split of a given Singly Linked List | Set 1
Write a function AlternatingSplit() that takes one list and divides up its nodes
to make two smaller lists ‘a’ and ‘b’. The sublists should be made from alternating
elements in the original list. So if the original list is 0->1->0->1->0->1
then one sublist should be 0->0->0 and the other should be 1->1->1.

Input : 1-->2-->3-->4
A : 1--->3
B : 2-->4

 */
public class _30_AlternationsSplit {
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

    private  void print(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
    }


    //https://thecodingsimplified.com/split-linked-list-alternatively-into-two-lists/

    ListNode firstHead, secondHead;
    public void alternateSplit(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }

        ListNode firstTemp;
        ListNode secondTemp;

        firstHead = firstTemp = head;
        secondHead = secondTemp = head.next;
        head = head.next.next;

        while(head != null && head.next != null) {
            firstTemp.next = head;
            secondTemp.next = head.next;

            firstTemp = firstTemp.next;
            secondTemp = secondTemp.next;

            head = head.next.next;
        }
        // যদি বেজোড় সংখ্যক নোড থাকে 
        if(head != null) {
            firstTemp.next = head;
            firstTemp = firstTemp.next;
        }

        firstTemp.next = null;
        secondTemp.next = null;

        return;
    }
    public static void main(String[] args) {
        _30_AlternationsSplit alObj = new _30_AlternationsSplit();

        alObj.insertAtLast(1);
        alObj.insertAtLast(2);
        alObj.insertAtLast(3);
        alObj.insertAtLast(4);
        alObj.insertAtLast(5);

        System.out.println("\nOriginal List");
        alObj.display();
        System.out.println("\nResult is");

        alObj.alternateSplit(alObj.head);
        System.out.println("\nFirst");
        alObj.print(alObj.firstHead);
        System.out.println("\nSecond");
        alObj.print(alObj.secondHead);

    }
}
