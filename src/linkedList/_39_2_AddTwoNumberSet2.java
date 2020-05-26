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
    public static void main(String[] args) {
        _39_2_AddTwoNumberSet2 obj = new _39_2_AddTwoNumberSet2();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();

    }
}
