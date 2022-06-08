package labtest.LabTest1;

import java.util.Scanner;

/**
 * Labtest
 */
public class Labtest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSet = input.nextInt();
        int num1 = 0;
        int num2 = 0;
        String op = null;
        int result = 0;

        for (int i = 0; i < totalSet; i++) {
            num1 = input.nextInt();
            op = input.next();
            num2 = input.nextInt();

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
                    double convertNum1 = num1;
                    double convertNum2 = num2;
                    double convertResult = result;
                    convertResult = convertNum1 / convertNum2;

                    // format & round off
                    convertResult = Math.round(convertResult * 100.0) / 100.0;
                    System.out.println(num1 + "/" + num2 + " = " + convertResult);
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