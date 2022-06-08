package arrayAndString.BonusQuestions;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int arrSize = k.nextInt();
        int[] num = new int[arrSize];
        int sumArr = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = k.nextInt();
            sumArr += num[i];
        }

        System.out.println("Sum values: " + sumArr);
    }
}
