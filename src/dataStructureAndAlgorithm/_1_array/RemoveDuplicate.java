package dataStructureAndAlgorithm._1_array;

// it will remove all the duplicate value of array.
//1 2 2 2 3 3 4 5 6 6
// 1 2 3 4 5 6
public class RemoveDuplicate {

    public static void main(String[] args) {

        boolean flag = false;
       
        
        int array[] = {2,5,66,7,2,3,1,7,8,9,4,3,2,66};
        System.out.println("Value Before sorting sorted : ");
        for (int i = 0; i < array.length; i++) {
        	  System.out.print(array[i]+" ");
        }

// sort the unsorted elements.
        
        for (int i = 0; i < array.length; i++) {
        	for (int j = i; j < array.length; j++) {
        		if(array[i] > array[j]) {
        			int temp = array[i];
        			array[i] = array[j];
        			array[j] = temp;
        		}
        	}
        }
        
        // sorted elements       
        System.out.println("\n\nAfter sorting : ");
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i]+ " ");
        }
        
		int current = array[0];
	       
        System.out.println("\n\nAfter removing");
        for (int i = 1; i < array.length; i++) {
           if (current != array[i]) {
        	   System.out.print(current+ " ");
               current= array[i];
            }
           
        }
        System.out.print(current+" ");
   
		if(flag) {
			System.out.println("\nDelete successfully");
		}
		else {
			System.out.println("\nElemnet is not found...");		
		}
                
    }
}


