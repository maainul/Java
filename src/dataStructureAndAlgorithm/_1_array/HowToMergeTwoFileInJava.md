# How to Merge Two Arrays in Java

```
Merging two arrays in Java is similar to concatenate or combine two arrays in a single array object. 
We have to merge two arrays such that the array elements maintain their original order 
in the newly merged array. 
The elements of the first array precede the elements of the second array in the newly merged array
```

```
int[] arr1={1, 2, 3, 4, 5, 6};  //first array  
int[] arr2={7, 8, 9, 0};    //second array  
int[] arr3={1, 2, 3, 4, 5, 6, 7, 8, 9, 0}   //resultant array 

```
```
There are following ways to merge two arrays:

	Java arraycopy() method
	Without using arraycopy() method
	Java Collections
	Java Stream API
```
## Parameters
```
source: It is a source array.
source_position: Starting point in the source array.
destination: It is a destination array.
destination_position: Starting position in the destination array.
length: The number of array elements to be copied
It throws NullPointerException if the source or destination array is null. 
It also throws ArrayIndexOutOfBoundsException if:

source_position or destination_position or length is negative.
source_position+length is greater than the length of the source array, 
or destination_position+length is greater than the length of the destination array.
```