package nov25._2_insertionOfTwoLinkedList;

import java.util.HashSet;

public class LinkedList {
	Node headNode;
	static Node head1;
	static Node head2;
	 private static Node insertionNode(Node headA, Node headB){
	        HashSet<Node> hs = new HashSet<Node>();
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

	public static void main(String[] args) {

        // list 1
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);
        n1.next.next.next.next.next.next = new Node(7);
        // list 2
        Node n2 = new Node(10);
        n2.next = new Node(9);
        n2.next.next = new Node(8);
        n2.next.next.next = n1.next.next.next;
       
       // System.out.println(MegeNode(n1, n2).data);

		
		System.out.println(insertionNode(head1,head2));
		
		
	}

}
