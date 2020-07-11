package dataStructureAndAlgorithms.Sorting.InsertionSort;

public class InsertionSortLinkedList {
    public static void main(String[] args) {
        int[] array = {4,3,2,1};
        System.out.println("\nUnsorted List:");
        printArray(array);

        System.out.println("\nSorted List");
        printArray(array);

    }
    /*
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0); // -1
        ListNode cur = dummy; // 0
        // 4 3 2 1
        while (head != null) { // 4
            ListNode t = head.next; // 3
            cur = dummy; // 0
            while (cur.next != null && cur.next.val <= head.val) { // 4<= 4 //
                cur = cur.next;
            }
            head.next = cur.next;
            cur.next = head;
            head = t;
        }
        return dummy.next;
    }
/*
    public ListNode insertionSortList(ListNode head) {
        if( head == null ){
            return head;
        }
// 6 5 3 1 8

        ListNode helper = new ListNode(0); //new starter of the sorted list
        ListNode cur = head; //the node will be inserted // 0
        ListNode pre = helper; //insert node between pre and pre.next //0
        ListNode next = null; //the next node will be inserted // null
        //not the end of input list
        while( cur != null ){
            next = cur.next; // 5 // 6 // 3 //1 //8
            //find the right place to insert
            while( pre.next != null && pre.next.val < cur.val ){ // 6 < 6 // 5 <6 // 6 < 6 // 5 < 3 //3 <1 // 5 < 8
                pre = pre.next; // 5
            }
            //insert between pre and pre.next
            cur.next = pre.next; // 0--->5 //5--->6 // 0--->3 // 0-->1 // 6-->8
            pre.next = cur; // 5//6 // 3// 1 // 8
            pre = helper; // 0 // 0 // 0 // 0 // 0 //
            cur = next; // 5 // 3 // 1 // 8 // null
        }

        return helper.next;
    }


    public ListNode insertionSortList(ListNode head) {
        ListNode ret = new ListNode(-1);
        while(head!= null)
        {
            ListNode node = ret;
            while(node.next!=null && node.next.val<head.val)
            {
                node = node.next;
            }
            ListNode temp = head.next;
            head.next = node.next;
            node.next = head;
            head = temp;
        }
        return ret.next;

    }
    */



    private static void printArray(int[] array) {
        for (int i = 0; i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
