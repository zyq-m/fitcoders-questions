package arrayAndString.Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int arrSize = k.nextInt();

        if (arrSize > 10) {
            arrSize = 10;
        }

        int[] num = new int[arrSize];

        for (int i = 0; i < num.length; i++) {
            num[i] = k.nextInt();
        }

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

    }
}
