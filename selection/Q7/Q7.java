package selection.Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // find smallest
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}
