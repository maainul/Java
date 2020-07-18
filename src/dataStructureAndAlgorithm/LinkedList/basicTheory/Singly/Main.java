package dataStructureAndAlgorithm.LinkedList.basicTheory.Singly;

public class Main {
    public static void main(String agrs[]){
    	SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtLast(1);
        list.insertAtLast(10);
        list.insertAtLast(12);
        list.insertAtLast(21);

        list.insertAtLast(6);

		/*
		 * list.insertAtLast(17); list.insertAtLast(8); list.insertAtLast(56);
		 * list.insertAtLast(8); list.insertAtLast(8);
		 */
        list.display();
        //list.insertAtBeginning(10);
        //list.insertAt(3, 21);
        //list.deleteByPosition(0);
       list.search(1);
       list.display();
        
        // delete from first
       // list.deleteFirst();
       // list.display();
       // list.deleteFirst();
       // list.display();
        
        // delete from last
      //  list.deleteLast();
      //  list.display();
        
        // sorted value
		/*
		 * System.out.println("After sorted value : "); list.sorted(); list.display();
		 * System.out.println("After find dupicate value : "); list.deleteDuplicates();
		 * list.display();
		 */
	    //list.deleteValueDuplicates();
		/*
		 * list.display(); System.out.println("dup 2"); list.deleteDuplicates2();
		 * list.display(); list.deleteDuplicates2(); list.display();
		 */
	    System.out.println("delete duplicate ");
	    list.deleteDuplicatevalue(1);
	    //list.deleteDuplicatevalue(6);
	    list.display();
	    
	    System.out.println("\nAfter deleting an element:(reverse) ---- 2");
		list.deleteNode2(2);
		list.display();
		
		System.out.println("\nLength of LinkedList");
		System.out.println(list.length());
	    
    }
}
/*
Output:
	delete not posible
	Element is the present in the list at position:2
	10-->7-->21-->8-->6-->null
	7-->21-->8-->6-->null
	21-->8-->6-->null
	21-->8-->null
*/
