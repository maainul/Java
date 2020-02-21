package intervieQuestions.String._21_FindLargestAndSmallestWordInAstring;


public class Method2 {

	public static void main(String[] args) {
		   String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
		   String small = "", large="";      
		   String word = "";
		   int index = 0;
		   int n = string.length();
		   
		   String[] words = new String[100];
		      for (int i = 0; i < n; i++) {
					if(string.charAt(i) != ' ') {
						word = word + string.charAt(i);
					}
					else {
						words[index] = word;
						index++;
						
						word = "";
					}
				}
		      
		      //Initialize small and large with first word in the string    
		      small = large = words[0];    
		          
		      for (int i = 1; i < index; i++) {
				if(words[i].length() > words[i-1].length()) {
					small = words[i];
				}
				if(words[i].length() > words[i-1].length()) {
					large = words[i-1];
				}
				
			}
		     
		      System.out.println("Smallest word: " + small);    
		      System.out.println("Largest word: " + large); 
		      
		      System.out.println("Number of words :"+index);
		   
		      
		     
		      
		    
		  }
		

	}


