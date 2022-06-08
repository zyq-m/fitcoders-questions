package selection.Q6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
            // even
            if (num[i] % 2 == 0) {
                System.out.print("Zaara");
            } else {
                System.out.print("Sherry");
            }
        }
    }
}
