package intervieQuestions.String;

public class _16_FindMaximumAndMinimumOccurringCharacterInaString {

	public static void main(String[] args) {
		String str = "Mohammad";
		str =str.toLowerCase();
		int[] freq = new int[str.length()];
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		int i;
		int j;
		
		char string[] = str.toCharArray();
		
		for ( i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i+1; j < str.length(); j++) {
				if(string[i] == string[j]) {
					freq[i]++;
					string[j] = '0';
				}
				
			}
		}
		
		 //Displays the each character and their corresponding frequency    
        System.out.println("Characters and their corresponding frequencies");    
        for(i = 0; i <freq.length; i++) {    
            if(string[i] != ' ' && string[i] != '0')    
                System.out.println(string[i] + "-" + freq[i]);    
        }    
        
       
        
		int min,max;
		min =max = freq[0];
		
		for ( i = 0; i < freq.length; i++) {
			//System.out.println(freq[i]);
			if(min > freq[i]) {
				min = freq[i];
				minChar = string[i];
			}
			if(max < freq[i]) {
				max = freq[i];
				maxChar = string[i];
			}
		}
		
		System.out.println(min+"---Minimun occuring character:"+minChar);
		System.out.println(max+"---Maximun occuring Character:"+maxChar);
		
		
	}

}
