package nestedLoop.Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int cols = k.nextInt();
        String word = k.next();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ".");
            for (int j = 0; j < cols; j++) {
                System.out.print(word);
            }
            System.out.println();
        }
    }
}