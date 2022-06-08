package looping.Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int N = k.nextInt();
        int multiplier = 5;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            if (i <= multiplier) {
                sum += i;
            }

            if (i == multiplier) {
                multiplier += multiplier;
                System.out.print("(" + sum + ")");
                System.out.println();
                sum = 0;
            }
        }
        System.out.print("(" + sum + ")");
    }
}
