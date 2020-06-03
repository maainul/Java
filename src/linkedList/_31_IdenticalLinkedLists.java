package linkedList;
/*
Identical Linked Lists
Two Linked Lists are identical when they have same data and arrangement of data is also same.
For example Linked lists a (1->2->3) and b(1->2->3) are identical. .
Write a function to check if the given two linked lists are identical.

 */
public class _31_IdenticalLinkedLists {

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
    // https://www.geeksforgeeks.org/identical-linked-lists/
    public static boolean isIdentical(ListNode head1, ListNode head2){
        while (head1 != null && head2 != null){
            if(head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return (head1 == null && head2 == null);
    }
// Recursive 
    public boolean isIdenticalRecursive(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }

        if (a.data != b.data)
            return false;
        return isIdenticalRecursive(a.next, b.next);
    }
    public static void main(String[] args) {
        _31_IdenticalLinkedLists list1 = new _31_IdenticalLinkedLists();
        _31_IdenticalLinkedLists list2 = new _31_IdenticalLinkedLists();
        list1.insertAtLast(1);
        list1.insertAtLast(2);
        list1.insertAtLast(3);

        list2.insertAtLast(1);
        list2.insertAtLast(2);
        list2.insertAtLast(3);
        list2.insertAtLast(3);
        System.out.println("\nLinked List 1");
        list1.display();
        System.out.println("\nLinked List 2");
        list2.display();
        System.out.println();

        if(isIdentical(list1.head, list2.head)){
            System.out.println("identical");
        }else{
            System.out.println("Not identical");
        }
    }
}
