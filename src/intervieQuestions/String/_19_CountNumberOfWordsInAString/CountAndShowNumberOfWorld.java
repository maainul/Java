package intervieQuestions.String._19_CountNumberOfWordsInAString;

public class CountAndShowNumberOfWorld {
	public static void main(String[] args){     
	      String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
	     
	      String word = "";    
	      String[] words = new String[10];    
	      int length = 0;    
	          
	      //Add extra space after string to get the last word in the given string    
	      string = string + " ";    
	          
	      for(int i = 0; i < string.length(); i++){    
	          //Split the string into words    
	          if(string.charAt(i) != ' '){    
	              word = word + string.charAt(i);    
	          }    
	          else{    
	              //Add word to array words    
	              words[length] = word;    
	              //Increment length    
	              length++;    
	              //Make word an empty string    
	              word = "";    
	          }
	         
	      }
	      
	      
	      for (int i = 0; i <length; i++) {
			System.out.println(words[i]);
		}
	      System.out.println(length);
	  }
}
