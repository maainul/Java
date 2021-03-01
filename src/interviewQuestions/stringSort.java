package interviewQuestions;

import java.util.Arrays;

public class stringSort {
    public static void main(String[] args) {
        String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
        bubbleSort(countries);
        insertionSort(countries);
    }

    private static void insertionSort(String[] countries) {
        for (int i = 0; i < countries.length; i++){
            int j = i;
            while (j > 0 && countries[j-1].length() > countries[j].length()){
                String temp = countries[j];
                countries[j] = countries[j-1];
                countries[j-1] = countries[j];
                j--;
            }
        }
        System.out.println(Arrays.toString(countries));
    }

    private static void bubbleSort(String[] countries) {
        for (int i = 0; i < countries.length-1; i++){
            for (int j = i+1; j < countries.length; j++){
                if (countries[i].length() > countries[j].length()){
                    String temp = countries[i];
                    countries[i] = countries[j];
                    countries[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(countries));

    }

}
