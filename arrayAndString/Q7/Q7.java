package arrayAndString.Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String text = k.next();
        char letter1 = k.next().charAt(0);
        char letter2 = k.next().charAt(0);
        int letter1Counter = 0;
        int letter2Counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter1) {
                letter1Counter++;
            }

            if (text.charAt(i) == letter2) {
                letter2Counter++;
            }
        }

        System.out.println(letter1 + " = " + letter1Counter);
        System.out.println(letter2 + " = " + letter2Counter);
    }
}
