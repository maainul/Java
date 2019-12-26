class Solution {
    public ListNode sortList(ListNode head) {
       ListNode current = head, nextNodeToCurrent = null;
        int temp;

    
            while(current != null){
                nextNodeToCurrent = current.next; // next node..
                while (nextNodeToCurrent !=null){
                    if(current.val >nextNodeToCurrent.val){
                        temp = current.val;
                        current.val = nextNodeToCurrent.val;
                        nextNodeToCurrent.val = temp;
                    }
                    nextNodeToCurrent = nextNodeToCurrent.next;
                }
                current = current.next;
            }
        return head;
        }
    }
