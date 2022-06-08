package arrayAndString.Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String[] id = new String[3];
        String[] year = new String[3];

        for (int i = 0; i < id.length; i++) {
            id[i] = k.next();
            year[i] = k.next();
        }

        for (int i = id.length - 1; i >= 0; i--) {
            System.out.println("ID: " + id[i] + " (" + year[i] + ")");
        }
    }
}
