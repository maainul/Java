/*
383. Ransom Note Easy

Given an arbitrary ransom note string and another string containing letters from all the magazines, 
write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

 */
package leetcode.String._383_RansomNote;

public class _383_RansomNote {
	 
    public static void main(String[] args) {        
        _383_RansomNote main = new _383_RansomNote();
        boolean result = main.canConstruct("sun", "aubcghimnoprsnab");
        System.out.println(result);
    }
     
    /* Solution */
    public boolean canConstruct(String ransomNote, String magazine) {
         
        char[] array = magazine.toCharArray();
         
        int[] countArray = new int[26];        
        for(char c : array){            
            countArray[c-'a']++;
        }
         
        array = ransomNote.toCharArray();
        for(char c : array){   
            if(countArray[c-'a'] > 0){
                countArray[c-'a']--;
            }else {
                return false;
            }            
        }
        return true;
    }
}