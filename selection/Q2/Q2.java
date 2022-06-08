package selection.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println(num1 + " is the highest.");
        }

        if (num2 > num3 && num2 > num4 && num2 > num5 && num2 > num1) {
            System.out.println(num2 + " is the highest.");
        }

        if (num3 > num4 && num3 > num5 && num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is the highest.");
        }

        if (num4 > num5 && num4 > num1 && num4 > num2 && num4 > num3) {
            System.out.println(num4 + " is the highest.");
        }

        if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
            System.out.println(num5 + " is the highest.");
        }
    }
}
