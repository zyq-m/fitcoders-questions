package nestedLoop.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num = k.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
