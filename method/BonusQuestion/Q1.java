package method.BonusQuestion;

import java.util.Scanner;

public class Q1 {

    static int min(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    static int max(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // cari minimum & maximum value pakai method
        Scanner k = new Scanner(System.in);
        int arrSize = k.nextInt();
        int[] num = new int[arrSize];

        for (int i = 0; i < num.length; i++) {
            num[i] = k.nextInt();
        }

        int maxNum = max(num);
        int minNum = min(num);

        System.out.println("Min number: " + minNum);
        System.out.println("Max number: " + maxNum);
    }
}
