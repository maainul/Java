package dataStructureAndAlgorithm.LinkedList;

public class _8_SearchElement {
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

    private void search(int searchVal){
        ListNode current = head;
        boolean flag = false;
        int count = 0;
        while (current != null && current.data != searchVal){
            flag = true;
            count++;
            current = current.next;
        }
        if (flag){
            System.out.println("Data found in index "+count);
        }else{
            System.out.println("Data not found");
        }
    }

    private boolean searchElement(int searchVal){
        ListNode current = head;
        while (current != null){
            if (current.data == searchVal){
                return true;
            }
            current = current.next;
        }
        return false;
    }


    // Recursive solution
    private boolean searchRecursive(ListNode head,int x){

        // Base case
        if (head == null)
            return false;

        // If key is present in current node,
        // return true
        if (head.data == x)
            return true;

        // Recur for remaining list
        return searchRecursive(head.next, x);
    }




    public static void main(String[] args) {
        _8_SearchElement obj = new _8_SearchElement();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();

        int v = 4;
        System.out.println("\nSearch value :"+v);
        obj.search(v);

        if(obj.searchElement(v)){
            System.out.println("Search key found.");
        }else{
            System.out.println("Search Key Not found.");
        }

        if (obj.searchRecursive(obj.head, 4)){
            System.out.println("YES");
        }else{
            System.out.println("False");
        }



    }
}

