package labtest.LabTest1Max;

import java.util.Scanner;

public class LabTest1Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalLoop = sc.nextInt();
        double num1 = 0;
        double num2 = 0;
        double output = 0;

        for (int i = 0; i < totalLoop; i++) {
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();

            // first condition
            if (num1 > num2 && num2 != 0) {
                output = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + output);
            }

            // second condition
            if (num2 == 0) {
                output = num1 * 2;
                System.out.println(num1 + "*2=" + output);
            }

            // third condition
            if (num1 < num2 && num1 != 0) {
                output = num2 / num1;
                System.out.println(num2 + "/" + num1 + "=" + output);
            }

            // fourth condition
            if (num1 == 0) {
                break;
            }
        }
    }
}
