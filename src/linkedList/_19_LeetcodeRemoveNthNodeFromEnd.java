package linkedList;

public class _19_LeetcodeRemoveNthNodeFromEnd {
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
    private  void display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
    }
    private ListNode removeFromLast(ListNode head, int i) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur =pre.next;
        int count = 1;
        while (cur != null && count < length-i+1){
            pre = cur;
            cur = cur.next;
            count++;
        }
        pre.next = cur.next;
        pre.next = null;

        return dummy.next;

    }
    public static void main(String[] args) {
        _19_LeetcodeRemoveNthNodeFromEnd obj = new _19_LeetcodeRemoveNthNodeFromEnd();

        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);

        obj.display(obj.head);
        System.out.println();

        obj.head = obj.removeFromLast(obj.head, 2);

        obj.display(obj.head);
    }


}
