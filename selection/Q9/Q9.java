package selection.Q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price1 = input.nextDouble();
        double price2 = input.nextDouble();
        double price3 = input.nextDouble();

        if (price2 < price1) {
            System.out.println(price2 + " is cheaper than " + price1);
        } else {
            System.out.println(price1 + " is cheaper than " + price2);
        }

        if (price3 < price1) {
            System.out.println(price3 + " is cheaper than " + price1);
        } else {
            System.out.println(price1 + " is cheaper than " + price3);
        }

    }
}
