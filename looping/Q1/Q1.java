package looping.Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();
        int sum = 0;

        for (int i = start; i <= end; i += 3) {

            System.out.println(i);
            sum = sum + i;

        }

        System.out.println(sum);

    }
}
