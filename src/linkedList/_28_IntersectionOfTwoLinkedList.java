/*
package linkedList;

public class _28_IntersectionOfTwoLinkedList {
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
    private  void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
    }

        // 28. Intersection of two sorted linked lists
   private static ListNode insertionSortedList(ListNode headA, ListNode headB){
        ListNode l1 = headA;
        ListNode l2 = headB;
        ListNode temp = new ListNode(0);
        //ListNode dummy = null;
        ListNode tempCopy = temp; // 0
        // 0-->null
       // 1 2 3 4 5
       // 2 4 6 8 10
        while (l1 != null && l2 != null){
            if(l1.data == l2.data){
                ListNode newNode = new ListNode(l1.data); // 2 4
                temp.next = newNode;
                temp = temp.next;
                System.out.println("l1 data :"+l1.data);
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1.data < l2.data) {
                l1 = l1.next;
            }
            else {
                l2 = l2.next;
            }
        }
        //2 4
        return tempCopy.next;
       //return temp.next;
    }
    private static void print(Solution.ListNode head){
        Solution.ListNode c = head;
        while(c != null){
            System.out.print(c.data+"---->");
            c =c.next;
        }
    }

    public static void main(String[] args) {
        _28_IntersectionOfTwoLinkedList objA = new _28_IntersectionOfTwoLinkedList();
        objA.insertAtLast(1);
        objA.insertAtLast(2);
        objA.insertAtLast(3);
        objA.insertAtLast(4);
        objA.insertAtLast(5);
        _28_IntersectionOfTwoLinkedList obs = new _28_IntersectionOfTwoLinkedList();
        obs.insertAtLast(2);
        obs.insertAtLast(4);
        obs.insertAtLast(6);
        obs.insertAtLast(8);
        obs.insertAtLast(10);
        obs.display();

        System.out.println("\nResult is");
        //print(insertionSortedList(objA.head, obs.head));
        print(insertionSortedList(objA.head, obs.head));

    }
}

*/
