package dataStructureAndAlgorithm.LinkedList;

public class AllReverseLinkedList {

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
    private  void display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
    }
    /*
    Reverse a Linked List in groups of given size | Set 1
    Given a linked list, write a function to reverse every k nodes
    (where k is an input to the function).

    Example:

            Input: 1->2->3->4->5->6->7->8->NULL, K = 3
            Output: 3->2->1->6->5->4->8->7->NULL

            Input: 1->2->3->4->5->6->7->8->NULL, K = 5
            Output: 5->4->3->2->1->8->7->6->NULL

     */
    // 33
    private ListNode reverseWithGroup(ListNode head, int k){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        int count = 0;
        while (count < k && current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            count++;
        }
        if(next != null){
            head.next = reverseWithGroup(next,k);
        }
        return previous;
    }
    // Leetcode code
    // With corner case
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        if(k > length){
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        int count = 0;
        while(count < k ){
            ListNode nxt = current.next;
            current.next = previous;
            previous = current;
            current = nxt;
            count++;
        }
        head.next = reverseKGroup(current, k);
        return previous;

    }

    /*
    Reverse a linked list from position m to n. Do it in one-pass.

    Note: 1 ≤ m ≤ n ≤ length of list.

    Example:


    Input: 1->2->3->4->5->NULL, m = 2, n = 4
    Output: 1->4->3->2->5->NULL
     */
 private ListNode reverseII(int m, int n){
        ListNode dummyHead = new ListNode(0);
        ListNode pre = dummyHead;
        dummyHead.next = head;
        for (int i = 0; i< m-1; i++){
            pre= pre.next;
        }
        ListNode previous = null;
        ListNode current = pre.next;
        for (int j = 0; j< n-m ;j++){
           ListNode nxt = current.next;
           current.next = nxt.next;
           nxt.next = pre.next;
           pre.next = nxt;

            // 1 2 3 4 5 6 7
            // 1 2 [4 3] 5 6 7
            // 1 2 [5 4 3] 6 7
            // 1 2 [6 5 4 3] 7

        }
        return dummyHead.next;
    }

    //
        private ListNode revAlter(ListNode head, int k){
        ListNode current = head;
        ListNode next = null, prev = null;
        int count = 0;

        /*1) reverse first k nodes of the linked list */
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        System.out.println("\nHead :"+head.data);
        System.out.println("\ncurent :"+current.data);
        /* 2) Now head points to the kth node.  So change next
         of head to (k+1)th node*/
        if (head != null) {
            head.next = current;
        }

        /* 3) We do not want to reverse next k nodes. So move the current
         pointer to skip next k nodes */
        count = 0;
        while (count < k - 1 && current != null) {
            current = current.next;
            count++;
        }

        /* 4) Recursively call for the list starting from current->next.
         And make rest of the list as next of first node */
        if (current != null) {
            current.next = revAlter(current.next, k);
        }

        /* 5) prev is new head of the input list */
        return prev;
    }

    public static void main(String[] args) {
        AllReverseLinkedList reverseLinkedList = new AllReverseLinkedList();
        reverseLinkedList.insertAtLast(1);
        reverseLinkedList.insertAtLast(2);
        reverseLinkedList.insertAtLast(3);
        reverseLinkedList.insertAtLast(4);
        reverseLinkedList.insertAtLast(5);


        System.out.println("\nOriginal");
        reverseLinkedList.display();
        System.out.println("\nAfter Reverse");
        reverseLinkedList.head = reverseLinkedList.reverseWithGroup(reverseLinkedList.head,2);
        reverseLinkedList.display();

        AllReverseLinkedList obj = new AllReverseLinkedList();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);
        obj.insertAtLast(7);
        obj.insertAtLast(8);
        obj.insertAtLast(9);
        obj.insertAtLast(10);

        obj.display(obj.head);
        System.out.println();
        System.out.println();
        obj.head = obj.revAlter(obj.head,3);
        obj.display(obj.head);





    }
}
