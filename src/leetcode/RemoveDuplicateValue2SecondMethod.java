package leetcode;
/*
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode previousTohead = new ListNode(-1);
        previousTohead.next = head;
        ListNode currentNode = previousTohead;
        
        while(currentNode.next != null && currentNode.next.next != null){
            if(currentNode.next.val == currentNode.next.next.val){
                int val = currentNode.next.val;
                while(currentNode.next != null && currentNode.next.val == val){
                    currentNode.next = currentNode.next.next;
                }
            } 
            else {
                currentNode = currentNode.next;
            }
        }
        
        return previousTohead.next;
    }
}
*/