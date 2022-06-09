package method.BonusQuestion;

import java.util.Scanner;

public class Q3 {
    static int sum(int x, int y) {
        int result = x + y;

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        sum = sum(num1, num2);

        System.out.println("Sum of two numbers: " + sum);
    }
}
