package looping.Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int firstInput = k.nextInt();
        int[] num = new int[firstInput + 1];
        int sum = 0;

        for (int i = 1; i < num.length; i++) {
            num[0] = firstInput;
            num[i] = k.nextInt();
            sum += num[i];
        }

        System.out.println(sum);
    }
}
