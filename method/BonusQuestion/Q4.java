package method.BonusQuestion;

import java.util.Scanner;

public class Q4 {

    static boolean OddEven(int x) {
        if (x % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();
        boolean state = OddEven(num);

        if (state) {
            System.out.println(num + " is an odd number");
        } else {
            System.out.println(num + " is an even number");
        }
    }

}

/*
 * static int evennum(int x) {
 * int even = 0;
 * if (x % 2 == 0) {
 * even = x;
 * System.out.println(even + " is an even number");
 * } else {
 * System.out.println("There None");
 * }
 * return even;
 * }
 * 
 * static int oddnum(int x) {
 * int odd = 0;
 * if (x % 2 == 1) {
 * odd = x;
 * System.out.println(odd + " is an odd number");
 * } else {
 * System.out.println("There None");
 * }
 * return odd;
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int num;
 * System.out.println("Please Insert a Number");
 * num = sc.nextInt();
 * 
 * evennum(num);
 * oddnum(num);
 * 
 * }
 */