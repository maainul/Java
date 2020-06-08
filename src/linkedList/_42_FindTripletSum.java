package linkedList;
/*
Find a triplet from three linked lists with sum equal to a given number
Given three linked lists,
say a, b and c, find one node from each list such that the sum of the values of the nodes is equal to a given number.
For example, if the three linked lists are 12->6->29, 23->5->8 and 90->20->59, and the given number is 101,
the output should be triple “6 5 90”.

In the following solutions, size of all three linked lists is assumed same for simplicity of analysis. The following solutions work for linked lists of different sizes also.

A simple method to solve this problem is to run three nested loops.
The outermost loop picks an element from list a,
the middle loop picks an element from b and the innermost loop picks from c.
The innermost loop also checks whether the sum of values of current nodes of a, b and c
is equal to given number.
Sorting can be used to reduce the time complexity to O(n*n). Following are the detailed steps.
1) Sort list b in ascending order, and list c in descending order.
2) After the b and c are sorted,
    one by one pick an element from list a and find the pair by traversing both b and c.
    See isSumSorted() in the following code.

The time complexity of this method will be O(n^3).

 /* Create Linked List llist1                           100->15->5->20 */
 /*ascending order/
        /*create a sorted linked list 'b'               2->4->9->10 */

/* descending order /
        /*create another sorted linked list 'c'          8->4->2->1 */



// Java program to find a triplet from three linked lists with
// sum equal to a given number
// https://www.geeksforgeeks.org/find-a-triplet-from-three-linked-lists-with-sum-equal-to-a-given-number/
public class _42_FindTripletSum
{
    Node head; // head of list

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    /* A function to chech if there are three elements in a, b
    and c whose sum is equal to givenNumber. The function
    assumes that the list b is sorted in ascending order and
    c is sorted in descending order. */
    boolean isSumSorted(_42_FindTripletSum la, _42_FindTripletSum lb, _42_FindTripletSum lc,
                        int givenNumber)
    {
        Node a = la.head;

        // Traverse all nodes of la
        while (a != null)
        {
            Node b = lb.head;
            Node c = lc.head;

            // for every node in la pick 2 nodes from lb and lc
            while (b != null && c!=null)
            {
                int sum = a.data + b.data + c.data;
                if (sum == givenNumber)
                {
                    System.out.println("Triplet found " + a.data +
                            " " + b.data + " " + c.data);
                    return true;
                }

                // If sum is smaller then look for greater value of b
                else if (sum < givenNumber)
                    b = b.next;

                else
                    c = c.next;
            }
            a = a.next;
        }
        System.out.println("No Triplet found");
        return false;
    }

    private static void triplesum(Node headA, Node headB, Node headC, int givenNumber){
        Node a =headA;

        // Traverse all nodes of la
        while (a != null)
        {
            Node b = headB;
            Node c = headC;

            // for every node in la pick 2 nodes from lb and lc
            while (b != null && c!=null)
            {
                int sum = a.data + b.data + c.data;
                if (sum == givenNumber)
                {
                    System.out.println("Triplet found " + a.data +
                            " " + b.data + " " + c.data);
                    return;
                }

                // If sum is smaller then look for greater value of b
                else if (sum < givenNumber)
                    b = b.next;

                else
                    c = c.next;
            }
            a = a.next;
        }
        System.out.println("No Triplet found");
    }


    /* Given a reference (pointer to pointer) to the head
    of a list and an int, push a new node on the front
    of the list. */
    void push(int new_data)
    {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        _42_FindTripletSum llist1 = new _42_FindTripletSum();
        _42_FindTripletSum llist2 = new _42_FindTripletSum();
        _42_FindTripletSum llist3 = new _42_FindTripletSum();

        /* Create Linked List llist1 100->15->5->20 */
        llist1.push(20);
        llist1.push(5);
        llist1.push(15);
        llist1.push(100);

        /*ascending order/
        /*create a sorted linked list 'b' 2->4->9->10 */
        llist2.push(10);
        llist2.push(9);
        llist2.push(4);
        llist2.push(2);

        /* descending order /
        /*create another sorted linked list 'c' 8->4->2->1 */
        llist3.push(1);
        llist3.push(2);
        llist3.push(4);
        llist3.push(8);


        int givenNumber = 25;
        //llist1.isSumSorted(llist1,llist2,llist3,givenNumber);


        triplesum(llist1.head, llist2.head, llist3.head, givenNumber);


    }
}
