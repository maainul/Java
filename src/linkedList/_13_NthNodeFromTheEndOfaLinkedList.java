package linkedList;

public class _13_NthNodeFromTheEndOfaLinkedList {
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
    private void findNodeFromEnd(int k) {
        ListNode temp = head;
        int len = 0;
        while (temp != null){
            len++;
            temp = temp.next;
        }

        int i = len - k +1;
        ListNode current = head;
        ListNode previous = null;
        int count = 1;
        while (current != null && count < i){
            current = current.next;
            count++;
        }
        System.out.println("Data found = "+current.data);
    }


    private ListNode findNthFromlast(ListNode head, int n) {
		ListNode refListNode = head;
		ListNode mainListNode = head;
		ListNode preListNode = null;
		int count = 0;
		while (count < n) {
			refListNode =refListNode.next;
			count++;
		}
		while (refListNode != null) {
			refListNode = refListNode.next;
			mainListNode = mainListNode.next;
		}
		return mainListNode;
	}


    public static void main(String[] args) {
        _13_NthNodeFromTheEndOfaLinkedList obj = new _13_NthNodeFromTheEndOfaLinkedList();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display(obj.head);
        System.out.println();

        obj.findNodeFromEnd(2);


        System.out.println("\nFrom Nth Last");
        ListNode headListNode = obj.findNthFromlast(obj.head, 3);
        obj.display(headListNode);

        System.out.println("\n\nNth Node : "+headListNode.data);

    }
}

