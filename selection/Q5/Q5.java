package selection.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;

        // collect input and initialize into array
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();

            if (num[i] % 2 == 0) {
                sum = sum + num[i];
            }
        }

        System.out.println(sum);
    }
}
