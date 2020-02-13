# Array Copy in Java

```
Given an array, we need to copy its elements in a different array.
```
# Method 1 (Simple but Wrong)

```.java
int a[] = {1, 8, 3}; 
 
// Create an array b[] of same size as a[] 
int b[] = new int[a.length]; 
 
// Doesn't copy elements of a[] to b[], only makes 
// b refer to same location 
b = a;     
However it’s incorrect!
```
```
When we do “b = a”, we actually assigning reference of array. 
Hence if we make any change to one array, it would be reflected in other array 
as well because both a and b refer to same location.
```

```.java
// A Java program to demonstrate that simply assigning one array 
// reference is incorrect. 
public class Test 
{ 
    public static void main(String[] args) 
    { 
        int a[] = {1, 8, 3}; 
  
        // Create an array b[] of same size as a[] 
        int b[] = new int[a.length]; 
  
        // Doesn't copy elements of a[] to b[], only makes 
        // b refer to same location 
        b = a;     
  
        // Change to b[] will also reflect in a[] as 'a' and  
        // 'b' refer to same location. 
        b[0]++; 
  
        System.out.println("Contents of a[] "); 
        for (int i=0; i<a.length; i++) 
            System.out.print(a[i] + " "); 
  
        System.out.println("\n\nContents of b[] "); 
        for (int i=0; i<b.length; i++) 
            System.out.print(b[i] + " "); 
    } 
} 
Output:

Contents of a[] 
2 8 3 

Contents of b[] 
2 8 3 
```

# Method 2: (Easy and correct)
```
We might iterate each element of the given original array and copy one element at a time. 
Using this method guarantees that any modifications to b, will not alter the original array a.
```
```.java
// A Java program to demonstrate copying by one by one 
// assigning elements of a[] to b[]. 
public class Test 
{ 
    public static void main(String[] args) 
    { 
        int a[] = {1, 8, 3}; 
  
        // Create an array b[] of same size as a[] 
        int b[] = new int[a.length]; 
  
        // Copy elements of a[] to b[] 
        for (int i=0; i<a.length; i++) 
            b[i] = a[i]; 
  
        // Change b[] to verify that b[] is different 
        // from a[] 
        b[0]++; 
  
        System.out.println("Contents of a[] "); 
        for (int i=0; i<a.length; i++) 
            System.out.print(a[i] + " "); 
  
        System.out.println("\n\nContents of b[] "); 
        for (int i=0; i<b.length; i++) 
            System.out.print(b[i] + " "); 
    } 
} 
Output:

Contents of a[] 
1 8 3 

Contents of b[] 
2 8 3 
```

# Method 3: ( Using Clone() )
```
In the previous method we had to iterate over the entire array to make a copy, can we do better? The answer is YES!
We can use clone method in Java.
```
```.java
// A Java program to demonstrate array copy using clone() 
public class Test 
{ 
    public static void main(String[] args) 
    { 
        int a[] = {1, 8, 3}; 
  
        // Copy elements of a[] to b[] 
        int b[] = a.clone(); 
  
        // Change b[] to verify that b[] is different 
        // from a[] 
        b[0]++; 
  
        System.out.println("Contents of a[] "); 
        for (int i=0; i<a.length; i++) 
            System.out.print(a[i] + " "); 
  
        System.out.println("\n\nContents of b[] "); 
        for (int i=0; i<b.length; i++) 
            System.out.print(b[i] + " "); 
    } 
} 
Output:

Contents of a[] 
1 8 3 

Contents of b[] 
2 8 3 
```

# Method 4: ( Using System.arraycopy() )
```
We can also use System.arraycopy() Method. System is present in java.lang package. Its signature is as :
public static void arraycopy(Object src, int srcPos, Object dest, 
                             int destPos, int length)

Where src denotes the source array, srcPos is the index from which copying starts. 
Similarly, dest denotes the destination array, 
destPos is the index from which the copied elements are placed in the destination array. 
length is the length of subarray to be copied. The below program illustrates the same:

```
```.java
// A Java program to demonstrate array copy using 
// System.arraycopy() 
public class Test 
{ 
    public static void main(String[] args) 
    { 
        int a[] = {1, 8, 3}; 
  
        // Create an array b[] of same size as a[] 
        int b[] = new int[a.length]; 
  
        // Copy elements of a[] to b[] 
        System.arraycopy(a, 0, b, 0, 3); 
  
        // Change b[] to verify that b[] is different 
        // from a[] 
        b[0]++; 
  
        System.out.println("Contents of a[] "); 
        for (int i=0; i<a.length; i++) 
            System.out.print(a[i] + " "); 
  
        System.out.println("\n\nContents of b[] "); 
        for (int i=0; i<b.length; i++) 
            System.out.print(b[i] + " "); 
    } 
} 
Output:

Contents of a[] 
1 8 3 

Contents of b[] 
2 8 3 
```