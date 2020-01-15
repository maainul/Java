/******************************************************************************

ava TreeSet Example: Book

Let's see a TreeSet example where we are adding books to set and printing all the books. 
The elements in TreeSet must be of a Comparable type. 
String and Wrapper classes are Comparable by default. 
To add user-defined objects in TreeSet, you need to implement the Comparable interface.

Output:

101 Data Communications & Networking Forouzan Mc Graw Hill 4
121 Let us C Yashwant Kanetkar BPB 8
233 Operating System Galvin Wiley 6

*******************************************************************************/

import java.util.*;

class Book implements Comparable<Book>{  
    int id;  
    String name,author,publisher;  
    int quantity; 
    
    public Book(int id, String name, String author, String publisher, int quantity) {  
        this.id = id;  
        this.name = name;  
        this.author = author;  
        this.publisher = publisher;  
        this.quantity = quantity;  
}
    public int compareTo(Book b) {  
        if(id>b.id){  
            return 1;  
        }else if(id<b.id){  
            return -1;  
        }else{  
        return 0;  
        }  
    }  
}

public class Main {  
    public static void main(String[] args) {  
        Set<Book> set=new TreeSet<Book>();  
        //Creating Books  
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
        //Adding Books to TreeSet  
        set.add(b1);  
        set.add(b2);  
        set.add(b3);  
        //Traversing TreeSet  
        for(Book b:set){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
    }  
} 
