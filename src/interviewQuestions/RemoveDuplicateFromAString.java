package interviewQuestions;

public class RemoveDuplicateFromAString {
    public static void main(String[] args) {
        String string = "geeksforgeeks";

        int[] freq = new int[256];

        char[] arr = string.toCharArray();
        for(int i = 0; i <string.length(); i++){
            if (freq[arr[i]] > 0){
                freq[arr[i]] = 1;
            }else {
                freq[arr[i]]++;
            }
        }


        for(int i = 0; i < string.length(); i++){
            if (freq[arr[i]] == 1){
                System.out.print(arr[i]);
                freq[arr[i]] = 0;
            }
        }

    }


}
