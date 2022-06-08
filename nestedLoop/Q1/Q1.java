package nestedLoop.Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int row = k.nextInt();
        String word = k.next();
        String star = "*";

        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print("*");
            }

            for (int l = 0; l <= i; l++) {
                System.out.print(word);
            }
            System.out.println("");
        }
    }
}