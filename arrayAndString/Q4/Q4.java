package arrayAndString.Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int arrSize = k.nextInt();
        int[] num = new int[arrSize];
        int biggest = 0;

        for (int i = 0; i < arrSize; i++) {
            num[i] = k.nextInt();

            if (biggest < num[i]) {
                biggest = num[i];
            }
        }

        System.out.println("BIGGEST:" + biggest);
        for (int i = 0; i < arrSize; i++) {
            System.out.println(num[i]);
        }

    }
}
