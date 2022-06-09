package labtest.LabTest2;

import java.util.Scanner;

// receive string input & char character
// string contain secrete code
// method crack(input, character) to get the code
// method will get all position of specified character
// merged letter position with dashed - in string sequence "String secretCode"

public class LabTest2 {

    static String crack(String input, char character) {
        String secretCode = "";

        // get all postion
        // check wether it is same as character

        // check the rest of character
        for (int i = 0; i < input.length(); i++) {
            // merged letter position with dashed
            if (input.charAt(i) == character) {
                secretCode += i + "-";
            }
        }

        // remove last dashed
        String filterLastDashed = "";
        int lastCharacter = secretCode.length() - 1;

        if (secretCode.charAt(lastCharacter) == '-') {
            for (int j = 0; j < lastCharacter; j++) {
                filterLastDashed += secretCode.charAt(j);
            }

            // reintiliaze
            secretCode = filterLastDashed;
        }

        return secretCode;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String text = k.nextLine();
        char letter = k.next().charAt(0);
        String secretCode = crack(text, letter);

        System.out.println(secretCode);
    }
}