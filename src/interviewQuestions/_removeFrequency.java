package interviewQuestions;

public class _removeFrequency {
    public static void main(String[] args) {
        String s = "mainulhasan";
        countMaxstring(s);
    }

    public static void countMaxstring(String string) {
        char[] freq = string.toCharArray();
        System.out.println(freq);
        int index = 0, count = 0;
        for (int i = 0; i < freq.length; i++){
            if (freq[i] != 'a'){
                freq[index++] = freq[i];
            }else {
                count++;
            }
        }
        System.out.println(index);
        while (count > 0){
            freq[index++] = '\0';
            count--;
        }
        System.out.println(freq);


    }
}
