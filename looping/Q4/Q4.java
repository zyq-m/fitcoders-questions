package looping.Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int num = 0;

        while (num < 50) {
            num += k.nextInt();
        }

        System.out.println(num);
    }
}
