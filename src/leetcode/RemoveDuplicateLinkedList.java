package leetcode;

// Full solution : https://github.com/maainul/DataStructureAndAlgorithm/tree/master/src/DSsinglyLinkedList
/*
 * class Solution { public ListNode deleteDuplicates(ListNode head) { if(head ==
 * null || head.next == null){ return head; } ListNode previous = head; ListNode
 * nextTohead = head.next;
 * 
 * while(previous.next != null){ if(previous.val == nextTohead.val){
 * previous.next = nextTohead.next; nextTohead = nextTohead.next;
 * 
 * } else{ previous = previous.next; nextTohead = nextTohead.next; } } return
 * head; } }
 */