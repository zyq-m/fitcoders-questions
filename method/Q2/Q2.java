package method.Q2;

import java.util.Scanner;

public class Q2 {
    static int findMaxNum(int a, int b, int c) {
        int maxNum = 0;

        if (a > b && a > c) {
            maxNum = a;
        }

        if (b > a && b > c) {
            maxNum = b;
        }

        if (c > a && c > b) {
            maxNum = c;
        }

        return maxNum;
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num1 = k.nextInt();
        int num2 = k.nextInt();
        int num3 = k.nextInt();
        int maxNum = findMaxNum(num1, num2, num3);

        System.out.println("Maximum is " + maxNum);
    }
}
