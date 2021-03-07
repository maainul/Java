package new_100_Problems;

public class _12_RotationOfEachOther {
    public static void main(String[] args) {
        String input = "test";
        String rotation = "tets";
        if (checkRotatation(input, rotation)) {
            System.out.println(input + " and " + rotation + " are rotation of each other");
        } else {
            System.out.println("Sorry, they are not rotation of another");
        }

        // Read more: https://www.java67.com/2017/07/string-rotation-in-java-write-program.html#ixzz6oPE3fXur
    }

    private static boolean checkRotatation(String original, String rotation) {
        if (original.length() != rotation.length()) {
            return false;
        }
        String concatenated = original + original;
        return concatenated.contains(rotation);

        // Read more:https: //www.java67.com/2017/07/string-rotation-in-java-write-program.html#ixzz6oPDb0vSG
    }
}
