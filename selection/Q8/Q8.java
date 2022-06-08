package selection.Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[6];
        int totalEven = 0;

        for (int i = 0; i < num.length; i++) {

            num[i] = input.nextInt();

            // determine even number
            if (num[i] % 2 == 0) {
                totalEven++;
                System.out.println(num[i]);
            }
        }

        System.out.println("Total = " + totalEven);

    }
}
