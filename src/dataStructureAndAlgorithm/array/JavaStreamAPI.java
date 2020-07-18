package dataStructureAndAlgorithm.array;

import java.util.Arrays;
import java.util.stream.Stream;

public class JavaStreamAPI {

	public static<T> Object[] megedArray(T[]arr1, T[]arr2) {
		return Stream.of(arr1, arr2).flatMap(Stream::of).toArray();   
	}
	
	public static void main(String[] args) {
		Integer[] firstArray = new Integer[]{13,12,11,6,9,3}; //source array  
		Integer[] secondArray = new Integer[]{78,34,56,67,2,11,7}; //destination array  
		Object[] mergedArray = megedArray(firstArray,secondArray); //merged array  
		System.out.println("Merged array: "+ Arrays.toString(mergedArray));   
	}

}
