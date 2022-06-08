package looping.Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String word = input.next();

        for (int i = num; i >= 1; i--) {

            System.out.print(i + word);

        }
    }
}
