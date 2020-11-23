package dataStructureAndAlgorithm._1_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class UsingCollections {

	public static void main(String[] args) {
		String str1[] = {"A","E","I",};
		String str2[] = {"O","U"};
		
		List<String> list = new ArrayList<String>(Arrays.asList(str1));
		list.addAll(Arrays.asList(str2));
		Object[] str3 = list.toArray();
		System.out.println(Arrays.toString(str3));

	}

}
