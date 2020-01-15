/******************************************************************************
  44                                                                                                                          
  24                                                                                                                          
  2                                                                                                                           
  Hight Value:2                                                                                                               
  Hight Value:44                                                                                                              
  24  
*******************************************************************************/


// Let's see an example to retrieve and remove the highest and lowest Value.


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(2);
		set.add(44);
		
		// print all value 
		Iterator i=set.descendingIterator();  
        while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }
         
        //retrieve and remove the highest and lowest Value.
		System.out.println("Hight Value:"+set.pollFirst());
		System.out.println("Hight Value:"+set.pollLast());
		
		// print all value 
		Iterator ii=set.descendingIterator();  
         while(ii.hasNext())  
         {  
             System.out.println(ii.next());  
         }  
		
	}
}
