package intervieQuestions.String._3_TotalNumberofPunctionCharacterOfAString;

public class _3_TotalNumberofPunctionCharacterOfAString {

	public static void main(String[] args) {
		String s = "Hey, !!You:come here!;Were' ' are You going?";
	    int periodCount = 0;
	    int commaCount = 0;
	    int semicolonCount = 0;
	    int colonCount = 0;
	    int exclamationCount = 0;
	    int questionCount = 0;
	    int quatation = 0;
	    int total = 0;
	    for (int i = 0; i < s.length(); i++) {
	    	if(s.charAt(i) == 33)
	        {
	    		 exclamationCount++;
		         total++;
	        }
	    	if(s.charAt(i) == 34)
	        {
	    		 quatation++;
		         total++;
	        }
	        if(s.charAt(i) == 44)
	        {
	            commaCount++;
	            total++;
	        }
	        if(s.charAt(i) == 59)
	        {
	            semicolonCount++;
	            total++;
	        }
	        if(s.charAt(i) == 58)
	        {
	            colonCount++;
	            total++;
	        }
	        if(s.charAt(i) == 39)
	        {
	        	periodCount++;
	            total++;
	        }
	        if(s.charAt(i) ==34)
	        {
	            questionCount++;
	            total++;
	        }

	    }

	    System.out.println("There are " + periodCount + " periods in this String.");
	    System.out.println("There are " + quatation + " quatation in this String.");
	    System.out.println("There are " + commaCount + " commas in this String.");
	    System.out.println("There are " + semicolonCount + " semicolons in this String.");
	    System.out.println("There are " + colonCount + " colons in this String.");
	    System.out.println("There are " + exclamationCount + " exclamation marks in this String.");
	    System.out.println("There are " + questionCount + " quesiton marks in this String.");


	    System.out.println(total);
	}
}


