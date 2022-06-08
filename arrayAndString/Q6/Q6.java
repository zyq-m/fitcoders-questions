package arrayAndString.Q6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String firstName = k.next();
        String lastName = k.next();
        char newLastName = lastName.charAt(0);

        System.out.println(newLastName + ". " + firstName);
    }
}
