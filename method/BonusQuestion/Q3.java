package method.BonusQuestion;

import java.util.Scanner;

public class Q3 {
    static int Sum() {
        Scanner scan = new Scanner(System.in);
        int sum;

        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        sum = num1 + num2;
        System.out.println("Sum of two numbers = " + sum);

        return sum;
    }

    public static void main(String[] args) {
        Sum();
    }
}
