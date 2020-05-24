package linkedList;

public class _34_DeleteRightSide {

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


    private ListNode deleteRight(ListNode head){
        ListNode dummyHead = new ListNode(0);
        ListNode previous = dummyHead;
        dummyHead.next = head;
        ListNode current = head;
        while (current != null && current.next != null){
            ListNode nxt = current.next;
            if(current.data < nxt.data){
                previous.next = nxt;
                current.next = null;
            }else {
                current = current.next;
                nxt = nxt.next;
            }
            if(nxt.next != null || nxt.next.next != null){
                previous = nxt;
                current = nxt.next;
                nxt = nxt.next.next;
            }
        }
        return dummyHead.next;
    }
    public ListNode delNodes(ListNode n){
        ListNode curr = n;
        // 12 15 10 11 5 6
        while(curr != null && curr.next != null){
            if(curr.data < curr.next.data){
                ListNode temp = curr.next; // 15
                curr.data = temp.data; // 15-->
                curr.next = temp.next; // 
                temp = null;
            }else{
                curr = curr.next;
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        _34_DeleteRightSide obj = new _34_DeleteRightSide();
        obj.insertAtLast(12);
        obj.insertAtLast(15);
        obj.insertAtLast(10);
        obj.insertAtLast(11);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        System.out.println("\nOriginal");
        obj.display();
        System.out.println("\nAfter Reverse");
        //obj.head = obj.delete(obj.head);
       obj.delNodes(obj.head);
        obj.display();



    }
}
