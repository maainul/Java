package linkedList;

import java.util.HashSet;

public class Solution {
    ListNode head;
    public static class ListNode {
        int data;
        ListNode next;

        ListNode() {}
        ListNode(int data) {
            this.data = data;
        }
        ListNode(int val, ListNode next) {
            this.data = data;
            this.next = null;
        }
    }
    /***********************************************************************/
    // 1. Insert at beginning
    private void insertAtBeginning(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }
    /***********************************************************************/
    // 2. InsertAt Last
    private void insertAtLast(int data){
        ListNode newNode = new ListNode(data);
        ListNode c = head;
        if(head == null){
            head = newNode;
        }
        else {
            while(c.next != null){
                c = c.next;
            }
            c.next = newNode;
        }
    }
    /***********************************************************************/
    // 3.delete from first
    private void deleteFromFirst(){
        ListNode c = head;
        c = head.next;
        head.next = null;
        head = c;
    }

    /***********************************************************************/
    // 3.2. delete form last
    private  void  deleteFromLast(){
        ListNode slow = new ListNode(0);
        // ListNode slow = null;
        ListNode fast = head;
        while (fast.next != null){
            slow = fast;
            fast = fast.next;
        }
        slow.next = null;

    }
    /***********************************************************************/
    // delete by given position
    private void  deleteByGivenPosition(int pos){
        ListNode previous = head;
        int count = 1;
        while(count < pos-1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next = current.next;
        current.next = null;
    }

    /***********************************************************************/
    public int length(){
        ListNode c = head;
        int len = 0;
        while (c != null){
            c = c.next;
            len++;
        }
        return  len;
    }
    /***********************************************************************/
    // 8.Search Element
    public void searchElement(int val){
        ListNode c = head;
        boolean flag = false;
        int position = 1;
        while(c != null){
            if(c.data == val){
                flag = true;
                break;
            }
            position++;
            c = c.next;
        }
        if(flag){
            System.out.println("Data found in Position = "+position);
        }else {
            System.out.println("Data not Found");
        }
    }

    /**********************************************************************/
    private ListNode mergeTwoSortedLinkedList(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode result = null;

        while(l1 != null || l2 != null){
            int value;
            if(l1 == null){
                value = l2.data;
                l2 = l2.next;
            }
            else if(l2 == null){
                value = l1.data;
                l1 = l1.next;
            }
            else if(l1.data <= l2.data){
                value = l1.data;
                l1 = l1.next;
            }else{
                value = l2.data;
                l2 = l2.next;
            }

            if(result == null){
                result = new ListNode(value);
                head = result;
            }else{
                result.next = new ListNode(value);
                result = result.next;
            }

        }
        return head;
    }
    /**********************12. Middle of Linked list*************************************************/
    private void middleOfLinkedList() {
        ListNode slow = head;
        ListNode fast = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            System.out.println("The middle element is [" +
                    slow.data + "] \n");
    }

    // 10. Swap node in linked
    //swap() will swap the given two nodes
    public void swap(int n1, int n2){
        ListNode prevNode1 = null, prevNode2 = null, node1 = head, node2 = head;

        //Checks if list is empty
        if(head == null) {
            return;
        }

        //If n1 and n2 are equal, then list will remain the same
        if(n1 == n2)
            return;

        //Search for node1
        while(node1 != null && node1.data != n1){
            prevNode1 = node1;
            node1 = node1.next;
        }

        //Search for node2
        while(node2 != null && node2.data != n2){
            prevNode2 = node2;
            node2 = node2.next;
        }

        if(node1 != null && node2 != null) {

            //If previous node to node1 is not null then, it will point to node2
            if(prevNode1 != null)
                prevNode1.next = node2;
            else
                head  = node2;

            //If previous node to node2 is not null then, it will point to node1
            if(prevNode2 != null)
                prevNode2.next = node1;
            else
                head  = node1;

            //Swaps the next nodes of node1 and node2
            ListNode temp = node1.next;
            node1.next = node2.next;
            node2.next = temp;
        }
        else {
            System.out.println("Swapping is not possible");
        }
    }
    // 11. Write a function to get Nth node in a Linked List
    private int FindNode(int index) {
        ListNode c = head;
      //  boolean flag = false;
        ListNode temp = null;
        int position = 1;
        while (c != null) {
            if (position == index) {
                return c.data;
                //flag = true;
                //break;
            }
            position++;
            c = c.next;
        }
        return 0;
    }
        /*if(flag){
            System.out.println("Data found in Position = "+position);
        }else {
            System.out.println("Data not Found");
        }*/

    // 13. FInd node end of linked list
    // https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
    private void findNodeFromEnd(int n){
        int len = 0;
        ListNode temp = head;

        // 1) count the number of nodes in Linked List
        while (head != null) {
            head = head.next;
            len++;
        }
        // check if value of n is not more than length of
        // the linked list
        if (len < n){
            return;
        }
        //temp = head;
        // 2) get the (len-n+1)th node from the beginning
        for (int i = 1; i < len - n + 1; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    // 14. Delete linkedlist
    private void deleteLinkedList(){
        head = null;
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

    // 18. sorted insert
    // https://www.geeksforgeeks.org/given-a-linked-list-which-is-sorted-how-will-you-insert-in-sorted-way/
    private void sortedInsert(int data){
        ListNode newNode = new ListNode(data);
        ListNode current = head;
        if(head == null || head.data >= newNode.data){
            newNode.next = head;
            head = newNode;
        }else{
            while (current.next != null && current.next.data <= newNode.data){
                current = current.next;
            }
            // ListNode nextTonew = current.next;
            // newNode.next = nextTonew;
            newNode.next = current.next;
            current.next = newNode;
        }
    }
   // 20. Palindrom linkedlist
    private boolean palindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        if(head == null || head.next == null){
            return true;
        }
        while (fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next;
        }
        fast = reverse(slow);
        return compare(head,fast);
    }
    private ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null){
            next = current.next;
            current.next =previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    private boolean compare(ListNode l1, ListNode l2){
        while (l1 != null && l2 != null){
            if(l1.data != l2.data){
                return false;
            }else {
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return true;
    }

    // 21.Write a function to get the intersection point of two linked lists
    //https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
    private static ListNode insertionNode(ListNode headA, ListNode headB){
        HashSet<ListNode> hs = new HashSet<ListNode>();
        while(headA != null){
            hs.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(hs.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }



    /***********************************************************************/
    // 23. Remove duplicate from a sorted linked list
    private void removeDuplicate(){
        ListNode slow = head;
        ListNode fast = head.next;
        while( fast != null){
            if(slow.data == fast.data){
                slow.next = fast.next;
            }else {
                slow = slow.next;
            }
            fast = fast.next;
        }
    }
    // 24. Remove duplicate form unsorted list
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
    // 25. Pairwise swap elements of a given linked list
    // https://www.geeksforgeeks.org/pairwise-swap-elements-of-a-given-linked-list/
    private void swapElement(){
        if(head == null){
            return;
        }
        ListNode temp = head;
        while (temp != null && temp.next != null){
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }
    //  // 25. Pairwise swap elements of a given linked list
    private void swapElementVersion2(){
        if(head == null || head.next == null){
            return;
        }
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        // 0 5 8 6 9
        while (current.next != null && current.next.next !=null ){
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            second.next = first;
            current = current.next.next;
        }
    }
    //

    // 27. Move last element to front of a given linked list
    private void moveLastNodeToFront(){
        ListNode slow = new ListNode(0);
        slow.next = head;
        ListNode fast = head;
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = head;
        head = fast;
        slow.next = null;
    }

    // 28. Intersection of two sorted linked lists
   private static ListNode insertionSortedList(ListNode headA, ListNode headB){
        ListNode l1 = headA;
        ListNode l2 = headB;
        ListNode temp = new ListNode(0);
        //ListNode dummy = null;
        ListNode tempCopy = temp; // 0
        // 0-->null
       // 1 2 3 4 5
       // 2 4 6 8 10
        while (l1 != null && l2 != null){
            if(l1.data == l2.data){
                ListNode newNode = new ListNode(l1.data); // 2 4
                temp.next = newNode;
                temp = temp.next;
                System.out.println("l1 data :"+l1.data);
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1.data < l2.data) {
                l1 = l1.next;
            }
            else {
                l2 = l2.next;
            }
        }
        //2 4
        return tempCopy.next;
       //return temp.next;
    }
    // 29. Delete alternate nodes of a linked list
    private void DeleteAlterNode(){
        if(head == null){ return; }

        ListNode previous = head;
        ListNode current = head.next;

        while (previous != null && current != null){
            previous.next = current.next;
            current.next = null;
            //current = null;
            previous = previous.next;

            if(previous != null){
                current = previous.next;
            }
        }
    }

    // 30
  /*  private static ListNode alteringNode(ListNode head) {

    }*/
  //https://thecodingsimplified.com/split-linked-list-alternatively-into-two-lists/

ListNode firstHead, secondHead;
    public void alternateSplit(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }

        ListNode firstTemp;
        ListNode secondTemp;

        firstHead = firstTemp = head;
        secondHead = secondTemp = head.next;
        head = head.next.next;

        while(head != null && head.next != null) {
            firstTemp.next = head;
            secondTemp.next = head.next;

            firstTemp = firstTemp.next;
            secondTemp = secondTemp.next;

            head = head.next.next;
        }

        if(head != null) {
            firstTemp.next = head;
            firstTemp = firstTemp.next;
        }

        firstTemp.next = null;
        secondTemp.next = null;

        return;
    }
    ListNode headA, headB;
    private void alterNate2(ListNode head){
        if(head == null || head.next == null){
            return;
        }
        ListNode tempA;
        ListNode tempB;
        headA = tempA = head;
        headB = tempB = head.next;
        head = head.next.next;
        //1---->2----->3(h)----->4
        while (head != null && head.next != null){
            tempA.next = head;
            tempB.next = head.next;

            tempA = tempA.next;
            tempB = tempB.next;

            head = head.next.next;
        }

        if(head != null){
            tempA.next = head;
            tempA =tempA.next;
        }
        tempA.next = null;
        tempB.next = null;

        return;
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
    // 43. Rotate a linked list
    private  void rotateLinkedList(int k){
        ListNode fast = head;
        ListNode slow =  head;
        ListNode c = head;
        int len = 1;
        while(c.next != null){
            c = c.next;
            len++;
        }
        k = k% len;
        for (int i = 0; i< k; i++){
            fast = fast.next;
        }
        while (fast.next !=null ){
            slow =slow.next;
            fast = fast.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;

    }


    void printList()
    {
        ListNode temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    /***********************************************************************/
    private  void display(){
        ListNode c = head;
        while(c != null){
            System.out.print(c.data+"---->");
            c =c.next;
        }
    }
    private static void print(ListNode head){
        ListNode c = head;
        while(c != null){
            System.out.print(c.data+"---->");
            c =c.next;
        }
    }
    public static void main(String[] args) {
        Solution obj = new Solution();

        obj.insertAtBeginning(3);
        obj.insertAtBeginning(2);
        obj.insertAtBeginning(1);
        obj.insertAtBeginning(6);
        obj.insertAtBeginning(7);
        System.out.println("2. Insert At the Beginning");
        obj.display();

        obj.insertAtLast(9);
        obj.insertAtLast(9);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(10);
        obj.insertAtLast(11);
        System.out.println("\n3. Insert At the Last");
        obj.display();

        obj.deleteFromFirst();
        obj.deleteFromFirst();
        System.out.println("\n4.1. Delete from first");
        obj.display();

        obj.deleteFromLast();
        obj.deleteFromLast();
        System.out.println("\n4.2. Delete from Last");
        obj.display();


        obj.deleteByGivenPosition(4);
        System.out.println("\n5.Delete by Given Position");
        obj.display();

        System.out.println("\n7.Length of linked list:(Iterative way:");
        System.out.println(obj.length());

        System.out.println("\n08. Search an element in a linked list (iterative and recursive)");
        obj.searchElement(5);


        Solution l1 = new Solution();
        Solution l2 = new Solution();


        // Node head1 = new Node(5);
        l1.insertAtLast(5);
        l1.insertAtLast(10);
        l1.insertAtLast(15);

        // Node head2 = new Node(2);
        l2.insertAtLast(2);
        l2.insertAtLast(3);
        l2.insertAtLast(20);


        l1.head = new Solution().mergeTwoSortedLinkedList(l1.head,
                l2.head);


        System.out.println("\n16. Merge two sorted linked lists");
        l1.display();

        obj.removeDuplicate();
        System.out.println("\n23. Remove duplicate from a sorted linked list");
        obj.display();

        obj.moveLastNodeToFront();
        System.out.println("\n27. Move last element to front of a given linked list");
        obj.display();

        Solution swapobject = new Solution();
        swapobject.insertAtLast(1);
        swapobject.insertAtLast(2);
        swapobject.insertAtLast(3);
        swapobject.insertAtLast(4);
        swapobject.insertAtLast(5);
        swapobject.insertAtLast(6);
        System.out.println("\n10. Original a linked list");
        swapobject.display();

        //---------------------------------Nth Node Find---------------------------------------------------
        System.out.println("\nOriginal List");
        obj.display();
        // solution : https://coderanch.com/t/687171/java/Nth-node-Linked-List
        System.out.println("\n11.Write a function to get Nth node in a Linked List");
        int result = obj.FindNode(3);
        if(result == 0){
            System.out.println("Node is not found");
        }else{
            System.out.println("Node found ."+result);
        }
        //------------------------------------------------------------------------------------

        swapobject.swap(2,5);
        System.out.println("\n10. Swap Node  a linked list");
        swapobject.display();


        //------------------------------------------------------------------------------------
        System.out.println("\nOriginal LinkedList");
        swapobject.display();
        System.out.println("\n12. Middle of LinkedList");
        swapobject.middleOfLinkedList();
        //------------------------------------------------------------------------------------
        System.out.println("\nOriginal LinkedList");
        swapobject.display();
        System.out.println("\nProgram for nth node from the end of a linked list");
        swapobject.findNodeFromEnd(3);
//---------------------------Delete Linked list-----------------//
        Solution delObj = new Solution();
        delObj.insertAtLast(1);
        delObj.insertAtLast(4);
        delObj.insertAtLast(7);

        System.out.println("\nOriginal Linked List");
        delObj.display();

        System.out.println("\nAfter delete");
        delObj.deleteLinkedList();
        delObj.display();
//-------------------------------------------------------------
        obj.insertAtLast(1);
        // Count number of times given node
        System.out.println("\nOriginal Linked List");
        obj.display();

        System.out.println("\nWrite a function that counts the number of times a given int occurs in a linked list");
        obj.NumberOfNode(1);
       //------------------------------------inserted list sorted-----------//
        System.out.println("\n18. Given a linked list which is sorted, how will you insert in sorted way");
        Solution sortedObj = new Solution();
        sortedObj.insertAtLast(1);
        sortedObj.insertAtLast(2);
        sortedObj.insertAtLast(6);
        System.out.println("\nOriginal Linked List");
        sortedObj.display();
        System.out.println("\nAfter inserted value");
        sortedObj.sortedInsert(4);
        sortedObj.sortedInsert(7);
        sortedObj.display();
//-----------------------------------------------palindrome-----//
        Solution palObj = new Solution();
        palObj.insertAtLast(1);
        palObj.insertAtLast(2);
        palObj.insertAtLast(1);
        //palObj.insertAtLast(45);
        System.out.println("\npalindrom number ");
        palObj.display();
        boolean res = palObj.palindrome(palObj.head);
        if(res){
            System.out.println("\nPalindrom LinkedList");
        }else{
            System.out.println("\nNot Palindrom LinkedList");
        }

        //-------------. Write a function to get the intersection point of two linked lists
        System.out.println("\n21. Write a function to get the intersection point of two linked lists");
        Solution objA = new Solution();
        objA.insertAtLast(1);
        objA.insertAtLast(2);
        objA.insertAtLast(3);
        objA.insertAtLast(4);
        objA.insertAtLast(5);
        Solution objB = new Solution();
        objB.insertAtLast(10);
        objB.insertAtLast(9);
        objB.insertAtLast(8);
        objB.insertAtLast(4);
        objB.insertAtLast(5);
        objB.insertAtLast(6);
        objB.insertAtLast(7);
        System.out.println("\nLinked List A");
        objA.display();
        System.out.println("\nLinked List B");
        objB.display();
        System.out.println("\n");

        System.out.println("Insertion Node is :"+insertionNode(objA.head, objB.head));
//-------------------------------24. remove unsorted duplicated linked list-----
        Solution objUnsorted = new Solution();
        objUnsorted.insertAtLast(5);
        objUnsorted.insertAtLast(8);
        objUnsorted.insertAtLast(6);
        objUnsorted.insertAtLast(5);
        objUnsorted.insertAtLast(8);
        objUnsorted.insertAtLast(9);
        System.out.println("\nOriginal Linked list");
        objUnsorted.display();
        System.out.println("\nAfter Remove ");
        objUnsorted.removeDuplicateUnsorted();
        objUnsorted.display();
        //------------------------------------------------------------------

        //---------------------25. Pairwise swap elements of a given linked list-----//
        System.out.println("\n25.Swap pair");
        objUnsorted.swapElement();
        objUnsorted.display();
        //---------------------25. Pairwise swap elements of a given linked list-----//
        System.out.println("\n25.Swap pair version 2");
        objUnsorted.swapElementVersion2();
        objUnsorted.display();

        //--------------------
        System.out.println("\nA");
        objA.display();
        System.out.println("\nB");
        Solution obs = new Solution();
        obs.insertAtLast(2);
        obs.insertAtLast(4);
        obs.insertAtLast(6);
        obs.insertAtLast(8);
        obs.insertAtLast(10);
        obs.display();

        System.out.println("\nResult is");
        //print(insertionSortedList(objA.head, obs.head));
        print(insertionSortedList(objA.head, obs.head));

        Solution delNObj = new Solution();
        delNObj.insertAtLast(1);
        delNObj.insertAtLast(2);
        delNObj.insertAtLast(3);
        delNObj.insertAtLast(4);
       /// delNObj.insertAtLast(5);
        System.out.println("\nOriginal List");
        delNObj.display();
        delNObj.DeleteAlterNode();
        System.out.println("\nAfter Original List");
        delNObj.display();

        Solution alObj = new Solution();
        alObj.insertAtLast(1);
        alObj.insertAtLast(2);
        alObj.insertAtLast(3);
        alObj.insertAtLast(4);

        System.out.println("\nOriginal List");
        alObj.display();
        System.out.println("\nResult is");
        //print(alteringNode(alObj.head));
        //alObj.alternateSplit(alObj.head);

       /* alObj.alternateSplit(alObj.head);

        alObj.print(alObj.firstHead);
        System.out.println();

        alObj.print(alObj.secondHead);*/

// solution https://thecodingsimplified.com/split-linked-list-alternatively-into-two-lists/
        alObj.alterNate2(alObj.head);

        alObj.print(alObj.headA);

        System.out.println();

        alObj.print(alObj.headB);


//---------------------------------31. identical-----------------

        Solution list1 = new Solution();
        Solution list2 = new Solution();
        list1.insertAtLast(1);
        list1.insertAtLast(2);
        list1.insertAtLast(3);

        list2.insertAtLast(1);
        list2.insertAtLast(2);
        list2.insertAtLast(3);
        System.out.println();
        list1.display();
        System.out.println();
        list2.display();
        System.out.println();

        if(isIdentical(list1.head, list2.head)){
            System.out.println("identical");
        }else{
            System.out.println("Not identical");
        }
 //--------------------------------------------------------------
    }
}
// 1 2 3 4 5 7 8 9 10 11 12 13 14 15 16 17 18 23 24 25 26 27 28 29 30
// 31 43