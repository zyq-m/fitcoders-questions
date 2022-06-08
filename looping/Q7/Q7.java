package looping.Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int multiplier = k.nextInt();
        int i = 1;
        int result = multiplier;

        while (result <= 50) {
            System.out.println(i + "x" + multiplier + "=" + result);
            result += multiplier;
            i++;
        }
    }
}
