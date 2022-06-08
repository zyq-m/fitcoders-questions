package arrayAndString.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String text = k.nextLine();
        int aCounter = 0;
        int iCounter = 0;
        int uCounter = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == 'A') {
                aCounter++;
            }
            if (text.charAt(i) == 'I') {
                iCounter++;
            }
            if (text.charAt(i) == 'U') {
                uCounter++;
            }
        }

        System.out.println("A=" + aCounter);
        System.out.println("I=" + iCounter);
        System.out.println("U=" + uCounter);
    }
}
