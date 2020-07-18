package dataStructureAndAlgorithm.LinkedList;
/*
Create new linked list from two given linked list with greater element at each node
Given two linked list of the same size,
the task is to create a new linked list using those linked lists.
The condition is that the greater node among both linked list will be added to the new liked list.

Examples:

    Input:  list1 = 5->2->3->8
            list2 = 1->7->4->5
    Output:  New list = 5->7->4->8

    Input: list1 = 2->8->9->3
           list2 = 5->3->6->4
    Output:  New list = 5->8->9->4
 */
public class _51_CreateListGreaterThanTwoValue {
    ListNode head;
    public static class ListNode {
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

    private static void display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    private static ListNode greaterElement(ListNode l1, ListNode l2){
        ListNode head = null;
        ListNode temp = null;
        int val;
        while (l1 != null && l2 != null){
            if(l1.data > l2.data){
                val = l1.data;
            }else{
                val = l2.data;
            }
            l1 = l1.next;
            l2 = l2.next;

            if (temp == null){
                temp = head = new ListNode(val);
            }else{
                temp.next = new ListNode(val);
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        _51_CreateListGreaterThanTwoValue obj1 = new _51_CreateListGreaterThanTwoValue();
        obj1.insertAtLast(5);
        obj1.insertAtLast(2);
        obj1.insertAtLast(3);
        obj1.insertAtLast(8);

        _51_CreateListGreaterThanTwoValue obj2 = new _51_CreateListGreaterThanTwoValue();
        obj2.insertAtLast(1);
        obj2.insertAtLast(7);
        obj2.insertAtLast(4);
        obj2.insertAtLast(5);

        System.out.println("\nLinked List 1 ");
        display(obj1.head);
        System.out.println("\nLinkedList 2 ");
        display(obj2.head);
        System.out.println("\nNew Node");
        ListNode head = greaterElement(obj1.head, obj2.head);
        display(head);
    }
}
