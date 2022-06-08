package selection.Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        int num1 = k.nextInt();
        int num2 = k.nextInt();
        int num3 = k.nextInt();
        
        if (num1 < 100) {
            System.out.println(num1 + " is less than 100");
        } else if (num1 == 100) {
            System.out.println("This is the same number");
        } else if (num1 > 100) {
            System.out.println(num1 + " is greater than 100");
        }
        
        if (num2 < 100) {
            System.out.println(num2 + " is less than 100");
        } else if (num2 == 100) {
            System.out.println("This is the same number");
        } else if (num2 > 100) {
            System.out.println(num2 + " is greater than 100");
        }

        if (num3 < 100) {
            System.out.println(num3 + " is less than 100");
        } else if (num3 == 100) {
            System.out.println("This is the same number");
        } else if (num3 > 100) {
            System.out.println(num3 + " is greater than 100");
        }
    }
}
