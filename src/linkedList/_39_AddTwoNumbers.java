package linkedList;

/*******
    Add two numbers represented by linked lists | Set 1
    Given two numbers represented by two lists,
    write a function that returns the sum list.
    The sum list is list representation of the addition of two input numbers.

    Example:

    Input:          List1: 5->6->3  // represents number 365
                    List2: 8->4->2 //  represents number 248
 --------------------------------------------------------
    Output:Resultant list: 3->1->6  // represents number 613


    Input:          List1: 7->5->9->4->6  // represents number 64957
                    List2: 8->4 //  represents number 48
 --------------------------------------------------------
    Output:Resultant list: 5->0->0->5->6  // represents number 65005

 ******/

public class _39_AddTwoNumbers {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = null;
        ListNode res = null;
        ListNode temp = null;
        int sum = 0, carry = 0;
        int p1,p2;
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
        }
        if(carry >0){
            temp.next = new ListNode(carry);
        }
        return res;

    }

    private static ListNode addtwoNewFunction(ListNode l1, ListNode l2){
        ListNode new_head = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p3 = new_head;
        int sum;
        int carry = 0;

        while (p1 != null || p2 != null){
            int val1,val2;
            if(p1 != null){
                val1 = p1.data;
                p1 = p1.next;
            }else{
                val1 = 0;
            }
            if (p2 != null){
                val2 = p2.data;
                p2 =p2.next;
            }else{
                val2 = 0;
            }

            sum = carry + val1 + val2;
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;

            p3.next = new ListNode(sum);
            p3 = p3.next;
        }
        if ( carry == 1){
            p3.next = new ListNode(1);
        }
        return new_head.next;
    }


    private static void display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        _39_AddTwoNumbers obj1 = new _39_AddTwoNumbers();
        _39_AddTwoNumbers obj2 = new _39_AddTwoNumbers();
        obj1.insertAtLast(7);
        obj1.insertAtLast(8);
        obj1.insertAtLast(3);

        obj2.insertAtLast(5);
        obj2.insertAtLast(8);
        obj2.insertAtLast(6);
        display(obj1.head);
        display(obj2.head);
        System.out.println();
        System.out.println("-----");
        ListNode res = addTwoNumbers(obj1.head, obj2.head);
        display(res);

        // Function 2 call and its objects
        System.out.println("\n\nNew Function");
        display(obj1.head);
        System.out.println();
        display(obj2.head);
        System.out.println();
        System.out.println("-----");
        System.out.println("\nNew Function result");
        ListNode result = addtwoNewFunction(obj1.head, obj2.head);
        display(result);

    }


}
