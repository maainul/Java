package linkedList;

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
    private static boolean isIdentical(ListNode head1, ListNode head2) {
        ListNode a = head1;
        ListNode b = head2;
        while (a != null && b != null){
            if(a.data != b.data){
                return false;
            }
            a = a.next;
            b = b.next;

        }
        return (a == null && b== null);
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
