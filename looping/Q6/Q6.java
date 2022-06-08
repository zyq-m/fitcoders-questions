package looping.Q6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int N = k.nextInt();
        String word = k.next();
        String simbol = "";

        for (int i = 0; i < N; i++) {
            simbol += "$";
        }

        System.out.println(simbol + word + simbol);
    }
}
