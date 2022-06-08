package nestedLoop.Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num = k.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
