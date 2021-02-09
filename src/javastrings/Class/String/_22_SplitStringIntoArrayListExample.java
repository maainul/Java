package javastrings.Class.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _22_SplitStringIntoArrayListExample {

	public static void main(String[] args) {
		String string = "Hardships often prepare ordinary people for an extraordinary destiny";

		String[] splitStrings = string.split(" ");
		List<String> itemList = Arrays.asList(splitStrings);

		System.out.println(itemList);

		List<String> itemlist = new ArrayList<String>(Arrays.asList(splitStrings));
		System.out.println(itemlist);

	}

}
