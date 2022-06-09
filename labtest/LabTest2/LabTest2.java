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

        // check the first character
        if (input.charAt(0) == character) {
            secretCode += 0;
        }

        // check the rest of character
        for (int i = 1; i < input.length(); i++) {
            // merged letter position with dashed
            if (input.charAt(i) == character) {
                secretCode += "-" + i;
            }
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
