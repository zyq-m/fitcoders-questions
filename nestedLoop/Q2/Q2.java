package nestedLoop.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        String word = sc.next();

        for (int i = 1; i <= rows; i++) {
            System.out.print(i + ".");
            for (int j = 0; j < cols; j++) {
                System.out.print(word);
            }
            System.out.println();
        }
    }
}
