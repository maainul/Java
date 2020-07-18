package dataStructureAndAlgorithm.LinkedList;
/*
Given a sorted linked list, delete all nodes that have duplicate numbers,
leaving only distinct numbers from the original list.

Return the linked list sorted as well.

Example 1:

Input: 1->2->3->3->4->4->5
Output: 1->2->5
Example 2:

Input: 1->1->1->2->3
Output: 2->3
*/

public class _82_LeetcodeRemoveDuplicateII {

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
    private  void display(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode pre = temp;
        ListNode cur = head;

        while(cur != null && cur.next != null){
            if(head == null || head.next == null){
                return head;
            }
            ListNode nextNode = cur.next;
            if(cur.data == nextNode.data){
                while(cur.next != null && cur.data == nextNode.data){
                    cur = cur.next;
                    nextNode = nextNode.next;
                }
                pre.next = nextNode;
                cur = nextNode;
            }else{
                pre = pre.next;
                cur = cur.next;
            }
        }
        return temp.next;
    }

    public static void main(String[] args) {
        _82_LeetcodeRemoveDuplicateII obj = new _82_LeetcodeRemoveDuplicateII();
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(4);
        obj.insertAtLast(5);
        obj.insertAtLast(5);
        obj.insertAtLast(5);
        obj.insertAtLast(6);

        obj.display(obj.head);
        System.out.println();

        obj.head = obj.deleteDuplicates(obj.head);
        obj.display(obj.head);

    }
}


