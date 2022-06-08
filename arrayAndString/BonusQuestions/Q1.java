package arrayAndString.BonusQuestions;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int arrSize = k.nextInt();
        int[] num = new int[arrSize];

        // initialize
        for (int i = 0; i < num.length; i++) {
            num[i] = k.nextInt();
        }

        // sort in ascending order
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int temp = 0;

                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println("After sort:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
