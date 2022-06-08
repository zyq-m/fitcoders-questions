package arrayAndString.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String text = k.next();
        String newText = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(1)) {
                newText += "*";
            } else {
                newText += text.charAt(1);
            }
        }

        System.out.println(newText);
    }
}
