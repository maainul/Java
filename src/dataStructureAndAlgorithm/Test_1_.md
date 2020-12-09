
## Print the Elements of a Linked List

```.java
 static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

```

## Insert Node At Tail

```.java
static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head,int data){

        SinglyLinkedListNode current=head;

        SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);

        if(head==null){
            head=newNode;
        }else{
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;

        }
        return head;
}

```
## Insert a node at the head of a linked list

```.java

  static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = llist;
        llist = newNode;
        return llist;
    }
```
## Insert a node at a specific position in a linked list

```.java
 static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        int count = 0;
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        while(current != null && count < position){
            previous = current;
            current = current.next;
            count++;
        }
        previous.next = newNode;
        newNode.next = current;
            
        return head;
    }
```

## Delete A Node

```.java
 static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        int count = 0;
        SinglyLinkedListNode previous = null;
        SinglyLinkedListNode current = head;
       if(position == 0){
           head = head.next;
       }else{
            while(current != null && count < position){
            previous = current;
            current = current.next;
            count++;
        }
       current = current.next;
       previous.next = current;
       }
       
            
        return head;

}
```

## Print in Reverse (Recursion )

```.java

 static void reversePrint(SinglyLinkedListNode head) {
        if(head == null){
            return;
        }
        reversePrint(head.next);
        System.out.println(head.data);
    }
```
## Print in Reverse (Without Recursion)
```.java
 static void reversePrint(SinglyLinkedListNode head) {
       int count = 0;
       SinglyLinkedListNode temp = head;
       while(temp != null){
           count++;
           temp = temp.next;
       } 
       int n = count;
       
       for(int i = n; i >=1; i--){
           System.out.println(getNth(head,i));
       }
    }
    static int getNth(SinglyLinkedListNode head, int n){
        SinglyLinkedListNode cur = head;
        for(int i = 0; i <n-1 && cur != null; i++){
            cur = cur.next;
        }
        return cur.data;
    }
```

## Reverse A LinkedList

```.java
 static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode cur = head,pre = null,next = null;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
```
## Compare two linked lists
```.java
 static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
      
        SinglyLinkedListNode temp1 = head1;
        int fCount = 0;
        while(temp1 != null){
            fCount++;
            temp1 = temp1.next;
        }
        
        SinglyLinkedListNode temp2 = head2;
        int sCount = 0;
        while(temp2 != null){
            sCount++;
            temp2 = temp2.next;
        }
        
        if(fCount != sCount){
            return false;
        }
        
        
        SinglyLinkedListNode l1 = head1;
        SinglyLinkedListNode l2 = head2;
        while(l1 != null && l2 != null){
                
        if(l1.data != l2.data){
            return false;
        }
        l1 = l1.next;
        l2 = l2.next;
        }
        
        return true;
    }
```
## Merge two sorted linked lists
```.java
static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode result = null;
        SinglyLinkedListNode head = null;
        SinglyLinkedListNode l1 = head1;        
        SinglyLinkedListNode l2 = head2;
        int val = 0;
        while(l1 != null || l2 != null){
            if(l1 == null){
                val = l2.data;
                l2 = l2.next;
            }
            else if(l2 == null){
                val = l1.data;
                l1 = l1.next;
            }
            
            else if(l1.data <= l2.data){
                val = l1.data;
                l1 = l1.next;
            }
            else {
                val = l2.data;
                l2 = l2.next;
            }
            
           if(result == null){
               result = head = new SinglyLinkedListNode(val);
           }else{
               result.next = new SinglyLinkedListNode(val);
               result = result.next;
           }
        }        
        return head;
    }
```

## Get Node Value

```.java
 static int getNode(SinglyLinkedListNode head, int n) {
    int count = 0;
    SinglyLinkedListNode cur = head;
    
    while(cur != null){
        cur = cur.next;
        count++;
    }
    
    count -= n;
    while(--count > 0){
        head = head.next;
       
    }
    return head.data;
    
}
```

## Delete duplicate-value nodes from a sorted linked list

```.java

 static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode p = head;
        while(p != null && p.next != null){
            if(p.data == p.next.data){
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
        return head;
    }

```
## Cycle Detection

```.java
  static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }
    return false;
    }
```
## Find Merge Point of Two Lists
```.java
  static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        HashSet<SinglyLinkedListNode> hs = new HashSet<SinglyLinkedListNode>();
        
        while(head1 != null){
            hs.add(head1);
            head1 = head1.next;
        }
        
        while(head2 != null){
            if(hs.contains(head2)){
                return head2.data;
            }
            head2 = head2.next;
        }
        return 0;
    }
```

## Inserting a Node Into a Sorted Doubly Linked List

```.java

static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
           DoublyLinkedListNode current = head;

    DoublyLinkedListNode previous = null;
    
    while (current != null && current.data < data) {
        previous = current;
        current = current.next;
    }

    DoublyLinkedListNode node = new DoublyLinkedListNode(data);


    if (previous == null) {
        head = node;
    } else {
        // re-link previous node
        previous.next = node;
        node.prev = previous;
    }

    if (current != null) {
        // re-link next node
        current.prev = node;
        node.next = current;
    }

    return head;
}
```

##  Reverse a doubly linked list

```.java
 static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        
        DoublyLinkedListNode tempNode = null;
        DoublyLinkedListNode current = head;

        while (current != null) {
            tempNode = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
 
        if (tempNode != null) {
            head = tempNode.prev;
        }
        return head;
    }

```