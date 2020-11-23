package dataStructureAndAlgorithm.LinkedList;
/*
Union and Intersection of two Linked Lists
Given two Linked Lists, create union and intersection lists that contain union and intersection of
the elements present in the given lists. Order of elments in output lists doesn’t matter.
Example:

Input:
   List1: 10->15->4->20
   lsit2:  8->4->2->10

Output:
   Intersection List: 4->10
   Union List: 2->8->20->4->15->10
   
 */
public class _41_UnionAndIntersectionOfTwoLinkedLists {

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

    private void getUnion(ListNode head1, ListNode head2){
        ListNode t1 = head1, t2 = head2;
        while (t1 != null){
            push(t1.data);
            t1 = t1.next;
        }

        while (t2 != null){
            if(!isPresent(head, t2.data))
                push(t2.data);
            t2 = t2.next;
        }
    }

    private void getIntersection(ListNode head1, ListNode head2)
    {

        ListNode t1 = head1;

        // Traverse list1 and search each element of it in list2.
        // If the element is present in list 2, then insert the
        // element to result
        while (t1 != null)
        {
            if (isPresent(head2, t1.data))
                push(t1.data);
            t1 = t1.next;
        }
    }


    private boolean isPresent(ListNode head, int data) {
        ListNode t= head;
        while (t != null){
            if (t.data == data){
                return true;
            }
            t = t.next;
        }
        return false;
    }



    // insertAt Beginning
    private void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }



    public static void main(String[] args) {
        _41_UnionAndIntersectionOfTwoLinkedLists obj = new _41_UnionAndIntersectionOfTwoLinkedLists();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(5);
        obj.insertAtLast(9);
        obj.insertAtLast(0);
        System.out.println("\nList 1");
        obj.display();




        _41_UnionAndIntersectionOfTwoLinkedLists obj2 = new _41_UnionAndIntersectionOfTwoLinkedLists();
        _41_UnionAndIntersectionOfTwoLinkedLists intersect = new _41_UnionAndIntersectionOfTwoLinkedLists();
        _41_UnionAndIntersectionOfTwoLinkedLists uni = new _41_UnionAndIntersectionOfTwoLinkedLists();
        obj2.insertAtLast(8);
        obj2.insertAtLast(2);
        obj2.insertAtLast(6);
        obj2.insertAtLast(5);
        obj2.insertAtLast(10);
        obj2.insertAtLast(45);
        System.out.println("\nList 2");
        obj2.display();
        System.out.println();

        System.out.println("\nUnion");
        uni.getUnion( obj.head, obj2.head);
        uni.display();

        System.out.println("\nIntersection");
        intersect.getIntersection(obj.head, obj2.head);
        intersect.display();


    }
}
