package method.BonusQuestion;

import java.util.Scanner;

public class Q4 {
    static int OddEven() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = scan.nextInt();

        int odd;
        int even;

        if (num % 2 == 1) {
            odd = num;
            System.out.println(odd + " is an odd number");
            return odd;
        } else {
            even = num;
            System.out.println(even + " is an even number");
            return even;
        }
    }

    public static void main(String[] args) {
        OddEven();
    }
}
