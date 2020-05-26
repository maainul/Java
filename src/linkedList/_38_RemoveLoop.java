package linkedList;
/********************************************************************
 Detect and Remove Loop in a Linked List
 Write a function detectAndRemoveLoop()
 that checks whether a given Linked List contains loop and
 if loop is present then removes the loop and returns true.

 If the list doesn’t contain loop then it returns false.
 Below diagram shows a linked list with a loop.
 detectAndRemoveLoop() must change the below list to 1->2->3->4->5->NULL.

*************************************************************************/
public class _38_RemoveLoop {

// Java program to detect and remove loop in linked list
        static Node head;
        static class Node {
            int data;
            Node next;

            Node(int d)
            {
                data = d;
                next = null;
            }
        }

        // https://stackoverflow.com/questions/5607292/interview-remove-loop-in-linked-list-java
    public void findLoopInList() {
        Node fastNode = head;
        Node slowNode = head;
        boolean isLoopExist = false;
        while (slowNode != null && fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (slowNode == fastNode) {
                System.out.print("\nLoop Found");
                isLoopExist = true;
                break;
            }
        }
        if (isLoopExist) {
            slowNode = head;
            Node prevNode = null;
            while (slowNode != fastNode) {
                prevNode = fastNode;
                fastNode = fastNode.next;
                slowNode = slowNode.next;
            }
            System.out.print("Loop Found Node : " + slowNode.data);
            prevNode.next = null; //Remove the Loop
        }
    }
    // Function to print the linked list
        void printList(Node node)
        {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        // Driver program to test above functions
        public static void main(String[] args)
        {
            _38_RemoveLoop list = new _38_RemoveLoop();
            list.head = new Node(1);
            list.head.next = new Node(2);
            list.head.next.next = new Node(3);
            list.head.next.next.next = new Node(4);
            list.head.next.next.next.next = new Node(5);
            list.printList(head);
            // Creating a loop for testing
            head.next.next.next.next.next = head.next;
            list.findLoopInList();
            //list.detectCycle(head);
            System.out.println("\nLinked List after removing loop : ");
            list.printList(head);
        }
    }

// This code has been contributed by Mayank Jaiswal
