package looping.Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int S = k.nextInt();
        int E = k.nextInt();

        for (int i = S; i >= E; i--) {
            System.out.println(i);
        }
    }
}
