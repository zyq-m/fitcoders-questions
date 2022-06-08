package selection.Q11;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        String operation = k.next();
        int b = k.nextInt();

        if (operation.equals("CAMPUR")) {
            int result = a + b;
            System.out.println(a + " + " + b + " is " + result);
        }

        if (operation.equals("TOLAK")) {
            int result = a - b;
            System.out.println(a + " - " + b + " is " + result);
        }
    }
}
