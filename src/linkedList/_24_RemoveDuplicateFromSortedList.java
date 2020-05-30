package linkedList;

public class _24_RemoveDuplicateFromSortedList {
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
    // https://stackoverflow.com/questions/17643790/remove-duplicates-from-an-unsorted-linked-list
    private void removeDuplicateUnsorted(){
        if(head == null){
            return;
        }
        ListNode current = head;
        while (current != null){
            ListNode runner = current;
            while (runner.next != null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                }else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        _24_RemoveDuplicateFromSortedList obj = new _24_RemoveDuplicateFromSortedList();

        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(5);
        obj.insertAtLast(5);
        obj.insertAtLast(6);
        obj.insertAtLast(1);
        obj.insertAtLast(2);

        obj.display();
        System.out.println();

        obj.removeDuplicateUnsorted();
        obj.display();

    }
}
