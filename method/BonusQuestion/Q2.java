package method.BonusQuestion;

import java.util.Scanner;

public class Q2 {
    static void CheckAge() {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("You are elligible to vote.");
        } else {
            System.out.println("You are not elligible to vote.");
        }
    }

    public static void main(String[] args) {
        CheckAge();
    }
}
