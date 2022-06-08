package arrayAndString.BonusQuestions;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String text = k.nextLine();

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}
