package arrayAndString.BonusQuestions;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String text = k.nextLine();
        String newText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            newText += text.charAt(i);
        }

        System.out.println(newText);
    }
}
