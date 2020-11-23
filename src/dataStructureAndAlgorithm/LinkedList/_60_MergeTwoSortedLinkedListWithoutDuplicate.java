package dataStructureAndAlgorithm.LinkedList;
/*
Merge two sorted linked list without duplicates
Merge two sorted linked list of size n1 and n2.
The duplicates in two linked list should be present only once in the final sorted linked list.

Examples:

Input : list1: 1->1->4->5->7
        list2: 2->4->7->9

Output : 1 2 4 5 7 9

 */
public class _60_MergeTwoSortedLinkedListWithoutDuplicate {
     ListNode head;
    public  class ListNode {
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
        _60_MergeTwoSortedLinkedListWithoutDuplicate obj1 = new _60_MergeTwoSortedLinkedListWithoutDuplicate();
        obj1.insertAtLast(1);
        obj1.insertAtLast(2);
        obj1.insertAtLast(3);
        obj1.insertAtLast(4);
        obj1.insertAtLast(5);

        System.out.println("Linked List 1");
        obj1.display();

        _60_MergeTwoSortedLinkedListWithoutDuplicate obj2 = new _60_MergeTwoSortedLinkedListWithoutDuplicate();
        obj2.insertAtLast(1);
        obj2.insertAtLast(2);
        obj2.insertAtLast(3);
        obj2.insertAtLast(4);
        obj2.insertAtLast(5);

        System.out.println("\n\nLinked List 2");
        obj2.display();

    }
}
