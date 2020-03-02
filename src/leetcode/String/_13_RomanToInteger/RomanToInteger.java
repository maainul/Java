package leetcode;

public class RomanToInteger 
{ 
	// This function returns value of a Roman symbol 
	int number(char c) 
	{ 
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'M':
			return 1000;
			default:
				return 0;
			
	}
}	

	int romanToDecimal(String s) 
	{ 
		int result = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if( i> 0 && number(s.charAt(i)) > number(s.charAt(i-1))) {
				result = result + number(s.charAt(i))- 2*number(s.charAt(i-1));
			}
			else {
				result = result+ number(s.charAt(i));
			}	
		}
		return result;
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		RomanToInteger ob = new RomanToInteger(); 

		// Considering inputs given are valid 
		String s = "XXIV"; 
		System.out.println("Integer form of Roman Numeral" + 
						" is " + ob.romanToDecimal(s)); 
	} 
} 
