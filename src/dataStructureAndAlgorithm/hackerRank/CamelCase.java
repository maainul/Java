package dataStructureAndAlgorithm.hackerRank;

public class CamelCase {
    public static void main(String[] args) {
        String str = "oneTwoThree";
        System.out.println(countCamel(str));
        System.out.println(countCamel2(str));
    }

    private static int countCamel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count + 1;
    }


    private static int countCamel2(String str) {
        int count = 0;
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++){
            if (c[i] > 64 && c[i] < 91){
                count++;
            }
        }
        return count +1;
    }
}