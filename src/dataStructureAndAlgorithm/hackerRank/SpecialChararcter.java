package dataStructureAndAlgorithm.hackerRank;

public class SpecialChararcter {
    public static void main(String[] args) {
        String specialCharacters = "!@#$%^&*()-+";
        System.out.println(checkString(specialCharacters));

        String Str="Java String interview questions*$%";

        for (int i = 0; i < Str.length(); i++) {

            if (specialCharacters.contains(Character.toString(Str.charAt(i))))
            {

                System.out.println(Str.charAt(i)+": is a special character");
            }
        }
    }

    private static boolean checkString(String input) {
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        char currentCharacter;
        boolean numberPresent = false;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean specialCharacterPresent = false;

        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                numberPresent = true;
            } else if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCasePresent = true;
            } else if (specialChars.contains(String.valueOf(currentCharacter))) {
                specialCharacterPresent = true;
            }
        }

        return
                numberPresent && upperCasePresent && lowerCasePresent && specialCharacterPresent;
    }
}
