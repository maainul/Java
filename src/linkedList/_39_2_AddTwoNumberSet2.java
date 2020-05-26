package linkedList;
/*
    Add two numbers represented by linked lists | Set 2
    Given two numbers represented by two linked lists,
    write a function that returns the sum list.
    The sum list is linked list representation of
    the addition of two input numbers.
    It is not allowed to modify the lists.
    Also, not allowed to use explicit extra space (Hint: Use Recursion).

    Example


    Input:  First List: 5->6->3  // represents number 563
            Second List: 8->4->2 //  represents number 842
 --------------------------------------------------------
    Output:Resultant list: 1->4->0->5  // represents number 1405
 */
public class _39_2_AddTwoNumberSet2 {

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
        public static ListNode addTwoNumbers(ListNode n1, ListNode n2) {
        ListNode l1 = reverse(n1);
        ListNode l2 = reverse(n2);
        ListNode prev = null;
        ListNode res = null;
        ListNode temp = null;
        int sum = 0, carry = 0, p1,p2;
        while(l1 != null || l2 != null){
            if(l1 != null){
                p1 = l1.data;
                l1 = l1.next;
            }else{
                p1 = 0;
            }
            if(l2 != null){
                p2 = l2.data;
                l2 = l2.next;
            }else{
                p2 = 0;
            }

            sum = carry + p1 + p2;
            carry = ( sum >= 10 ? 1 : 0 );
            sum = sum % 10;
            temp = new ListNode(sum);

            if(res == null){
                res = temp;
            }else{
                prev.next = temp;
            }
            prev = temp;


            if(carry >0){
                temp.next = new ListNode(carry);
            }

        }
        return reverse(res);

    }

    public static ListNode reverse(ListNode head){
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    private static void display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        _39_2_AddTwoNumberSet2 obj1 = new _39_2_AddTwoNumberSet2();
        _39_2_AddTwoNumberSet2 obj2 = new _39_2_AddTwoNumberSet2();

        obj1.insertAtLast(7);
        obj1.insertAtLast(8);
        obj1.insertAtLast(3);

        obj2.insertAtLast(5);
        obj2.insertAtLast(8);
        obj2.insertAtLast(6);


        //System.out.println("Linked List 1");
        display(obj1.head);
        System.out.println();
        // System.out.println("\nLinked List 2");
        display(obj2.head);
        System.out.println();
        System.out.println("-----");
        ListNode res = addTwoNumbers(obj1.head, obj2.head);
        display(res);

    }
}
