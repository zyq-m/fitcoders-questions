package labtest.LabTest2Max;

import java.util.Scanner;

public class LabTest2Max {
    static int count_below(int[] nums, int x) {
        int totalOfBelow = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < x) {
                totalOfBelow++;
            }
        }

        return totalOfBelow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int x = sc.nextInt();
        int countBelow = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        countBelow = count_below(nums, x);

        System.out.println("There are " + countBelow + " numbers that are BELOW than " + x);
    }
}
