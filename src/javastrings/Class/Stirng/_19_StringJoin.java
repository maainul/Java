package javastrings.Class.Stirng;

public class _19_StringJoin {

	public static void main(String[] args) {
		String dateString = String.join("/", "12","12","2019");
		System.out.println(dateString);
		String timeString = String.join(":", "12","10","30");
		System.out.println(timeString);
				
		 // delimiter is "->" and elements are "Wake up",  
        // "Eat", "Play", "Sleep", "Wake up" 
  
        String gfg3 = String.join("-> ", "Wake up", "Eat", 
                      "Play", "Sleep", "Wake up"); 
  
        System.out.println(gfg3); 
        
        // delimiter is "  " and elements are "My", 
        // "name", "is", "Niraj", "Pandey" 
        String gfg2 = String.join("  ", "My", "name", "is", "Niraj", "Pandey"); 
  
        System.out.println(gfg2);
        
        // delimiter is "<" and elements are "Four", "Five", "Six", "Seven" 
        String gfg1 = String.join(" < ", "Four", "Five", "Six", "Seven"); 
  
        System.out.println(gfg1);
	}

}
/*
12/12/2019
12:10:30
Wake up-> Eat-> Play-> Sleep-> Wake up
My  name  is  Niraj  Pandey
Four < Five < Six < Seven
*/

