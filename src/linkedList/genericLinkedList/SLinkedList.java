package linkedList.genericLinkedList;

public class SLinkedList<T> {
    private ListNode<T> head;

    private SLinkedList(){
        head = null;
    }
    class ListNode<T>{
        private T data;
        private ListNode<T> next;

        ListNode(){}
        public ListNode(T data){
            this.data = data;
            this.next = null;
        }
    }
    private void insertAtBeginning(T data){
        ListNode<T> newNode = new ListNode<T>(data);
        newNode.next = head;
        head = newNode;
    }

    private void insertAtLast(T data){
        ListNode<T> newNode = new ListNode<T>(data);
        ListNode<T> c = head;
        while (c.next != null){
            c = c.next;
        }
        c.next = newNode;
    }
    private void display(){
        ListNode<T> c = head;
        while (c != null){
            System.out.print(c.data+"-->");
            c = c.next;
        }
    }
    private int length(){
        ListNode<T> c= head;
        int count = 0;
        while (c != null){
            count++;
            c = c.next;
        }
        return count;
    }



    public static void main(String[] args) {
        SLinkedList<Integer> obj = new SLinkedList<Integer>();

        obj.insertAtBeginning(3);
        obj.insertAtBeginning(2);
        obj.insertAtBeginning(1);
        obj.insertAtLast(5);
        System.out.println("\nInteger Type:");
        obj.display();
        System.out.println("\nLength of Integer LinkedList :"+obj.length());

        System.out.println("\nString type");
        SLinkedList<String> stringObj = new SLinkedList<String>();
        stringObj.insertAtBeginning("anik");
        stringObj.insertAtLast("hasan");
        stringObj.insertAtBeginning("mainul");
        stringObj.display();
        System.out.println("\nLength of String LinkedList :"+stringObj.length());




    }
}
