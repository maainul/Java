package collections.List;
//Java program to demonstrate search 
//operations on List interface 

import java.util.*; 

public class _3_ListExampleSearch { 
 public static void main(String[] args) 
 { 
     // Type safe array list, stores only string 
     List<String> l = new ArrayList<String>(5); 
     l.add("Geeks"); 
     l.add("for"); 
     l.add("Geeks"); 

     // Using indexOf() and lastIndexOf() 
     System.out.println("first index of Geeks:"
                        + l.indexOf("Geeks")); 
     System.out.println("last index of Geeks:"
                        + l.lastIndexOf("Geeks")); 
     System.out.println("Index of element"
                        + " not present : "
                        + l.indexOf("Hello")); 
 	} 
} 
/*
Output:
first index of Geeks:0
last index of Geeks:2
Index of element not present : -1
*/