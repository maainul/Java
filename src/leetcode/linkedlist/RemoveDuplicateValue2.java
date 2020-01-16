package leetcode.linkedlist;
/*
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
         
        ListNode dummyNode = new ListNode(Integer.MIN_VALUE);
        dummyNode.next = head;
         
        ListNode prev = dummyNode;
        ListNode curr = head;
         
        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            if (curr.val == next.val) {
                while (curr.next != null && curr.val == next.val) {
                    curr = curr.next;
                    next = next.next;
                }
             
                prev.next = next;
                curr = next;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }
         
        return dummyNode.next;
    }
}
*/