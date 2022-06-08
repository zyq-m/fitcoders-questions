package labtest.LabTest1;

import java.util.Scanner;

/**
 * Labtest
 */
public class Labtest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSet = input.nextInt();
        double num1 = 0;
        double num2 = 0;
        String op = null;
        double result = 0;

        for (int i = 0; i < totalSet; i++) {
            num1 = input.nextDouble();
            op = input.next();
            num2 = input.nextDouble();

            // addition operation
            if (op.equals("+")) {
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + " = " + result);
            }

            // multiplication operation
            if (op.equals("*")) {
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + " = " + result);
            }

            // division operation
            if (op.equals("/")) {
                if (num2 == 0) {
                    System.out.println(num1 + "/" + num2 + " = Cannot divide");
                } else {
                    result = num1 / num2;
                    // format & round off
                    result = Math.round(result * 100.0) / 100.0;
                    System.out.println(num1 + "/" + num2 + " = " + result);
                }
            }

            // minus operation
            if (op.equals("-")) {
                if (num2 > num1) {
                    result = num2 - num1;
                    System.out.println(num1 + "-" + num2 + " = " + result);
                } else {
                    result = num1 - num2;
                    System.out.println(num1 + "-" + num2 + " = " + result);
                }
            }
        }
    }
}