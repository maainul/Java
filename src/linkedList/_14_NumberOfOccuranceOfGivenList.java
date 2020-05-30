package linkedList;

public class _14_NumberOfOccuranceOfGivenList {

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



    //  15. Write a function that counts the number of times a given int occurs in a linked list
    private void NumberOfNode(int searchval){
        ListNode c = head;
        int count = 0;
        while (c != null){
            if(c.data == searchval){
                count++;
            }
            c= c.next;
        }
        System.out.println(count);
    }



    public static void main(String[] args) {
        _14_NumberOfOccuranceOfGivenList obj = new _14_NumberOfOccuranceOfGivenList();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();
        obj.NumberOfNode(2);

    }
}
