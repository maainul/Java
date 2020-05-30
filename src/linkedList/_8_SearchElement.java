package linkedList;

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


    public static void main(String[] args) {
        _8_SearchElement obj = new _8_SearchElement();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display();
        System.out.println();
        obj.searchElement(5);

    }
}

