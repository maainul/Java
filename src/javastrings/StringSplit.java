package javastrings;

public class StringSplit {
	public static void main(String args[]) {
		String s1="java string split method by javatpoint";  
		String[] wordStrings = s1.split("\\s");
		String capitalizeString = "";
		for(String wString:wordStrings) {
			String firString = wString.substring(0,1);
			String afterString = wString.substring(1);
			capitalizeString+=firString.toUpperCase()+afterString.toLowerCase()+" ";
			System.out.println(capitalizeString.trim());
		}
		String s2="java string split method by javatpoint";  
		
		System.out.println("--------Method of split------");
		
		for(String w:s2.split("\\s",6)) {
			System.out.println(w);
		}
		
		System.out.println();
		
		String str = "Javatpointtt";  
        System.out.println("Returning words:");  
        String[] arr = str.split("t", 0);  
        for (String w : arr) {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length);  
	}
}
/*
java
string
split
method
by
javatpoint
--------Method of split------
java
string
split
method
by
javatpoint

Returning words:
Java
poin
Split array length: 2
*/