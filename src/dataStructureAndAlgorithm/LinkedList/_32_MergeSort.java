package dataStructureAndAlgorithm.LinkedList;

public class _32_MergeSort {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }

    private void insertAtLast(int data){
        Node newNode = new Node(data);
        Node c = head;
        if(c == null){
            head = newNode;
        }else{
            while (c.next != null){
                c = c.next;
            }
            c.next = newNode;
        }
    }

    public void display(){
        Node c = head;
        while (c != null){
            System.out.print(c.data+"-->");
            c = c.next;
        }
    }

    private Node mergeSort(Node head){
        if(head== null || head.next == null){
            return head;
        }
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);
        Node sortedlist = merge(left,right);
        return sortedlist;
    }
    // it will return middle value
    private Node getMiddle(Node head){
        if (head== null){
            return  head;
        }
        Node first = head.next;
        Node slow = head;
        while (first != null && first.next != null){
            slow = slow.next;
            first = first.next.next;
        }
        return slow;
    }
    private Node merge(Node left, Node right){
        if (left == null){ return right; }
        if (right == null){ return left; }
        Node result = null;

        if(left.data <= right.data){
            result = left;
            result.next = merge(left.next, right);
        }else {
            result = right;
            result.next = merge(left, right.next);
        }
        return result;
    }

    public static void main(String[] args) {
        _32_MergeSort mergeSort = new _32_MergeSort();
        mergeSort.insertAtLast(5);
        mergeSort.insertAtLast(9);
        mergeSort.insertAtLast(19);
        mergeSort.insertAtLast(3);
        mergeSort.insertAtLast(15);
        mergeSort.insertAtLast(12);
        mergeSort.display();
        System.out.println("After Merge sort");
        mergeSort.mergeSort(mergeSort.head);
        mergeSort.display();

    }
}
