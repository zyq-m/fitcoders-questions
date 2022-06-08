package method.Q1;

import java.util.Scanner;

public class Q1 {
    static void displayGrade(int mark) {
        if (mark >= 91 && mark <= 100) {
            System.out.println("AA");
        }

        if (mark >= 81 && mark <= 90) {
            System.out.println("AB");
        }

        if (mark >= 71 && mark <= 80) {
            System.out.println("BB");
        }

        if (mark >= 61 && mark <= 70) {
            System.out.println("BC");
        }

        if (mark <= 60) {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int marks = 0;

        for (int i = 0; i < 3; i++) {
            marks = k.nextInt();
            displayGrade(marks);
        }
    }
}
