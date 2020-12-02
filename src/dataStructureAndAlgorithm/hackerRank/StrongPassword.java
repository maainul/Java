package dataStructureAndAlgorithm.hackerRank;

public class StrongPassword {
    public static void main(String[] args) {
        String str = "#HackerRank";
        strongPass(str,6);
    }

    private static void strongPass(String input, int n) {

        String specialCharacters = "!@#$%^&*()-+";

        char currentCharacter;
        boolean numberPresent = false;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean specialCharacterPresent = false;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                numberPresent = true;
            } else if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCasePresent = true;
            } else if (specialCharacters.contains(String.valueOf(currentCharacter))) {
                specialCharacterPresent = true;
            }
        }

        if (!numberPresent) count++;
        if (!upperCasePresent) count++;
        if (!lowerCasePresent) count++;
        if (!specialCharacterPresent) count++;

        if (input.length() + count < 6) {
            count =  ((6 - (input.length() + count)) + count);
        }

        System.out.println(count);
        }



    }

