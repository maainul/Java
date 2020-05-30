package linkedList;
/*
Swap nodes in a linked list without swapping data
Given a linked list and two keys in it, swap nodes for two given keys. Nodes should be swapped by changing links. Swapping data of nodes may be expensive in many situations when data contains many fields.
It may be assumed that all keys in linked list are distinct.

Examples:

Input:  10->15->12->13->20->14,  x = 12, y = 20
Output: 10->15->20->13->12->14

Input:  10->15->12->13->20->14,  x = 10, y = 20
Output: 20->15->12->13->10->14

Input:  10->15->12->13->20->14,  x = 12, y = 13
Output: 10->15->13->12->20->14
 */
public class _10_SwapNodes {
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

    public static void main(String[] args) {
        _10_SwapNodes obj = new _10_SwapNodes();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        System.out.println("\nBefore Swapping:");
        obj.display();

        System.out.println("\n\nAfter Swapping:");
        obj.swap(2, 4);
        obj.display();

    }
}
