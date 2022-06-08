package selection.Q1;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // num1
        if (num1 >= 80) {
            System.out.println("Exellent");
        } else if (num1 >= 50 && num1 <= 79) {
            System.out.println("Good");
        } else {
            System.out.println("Satisfactory");
        }

        // num2
        if (num2 >= 80) {
            System.out.println("Exellent");
        } else if (num2 >= 50 && num2 <= 79) {
            System.out.println("Good");
        } else {
            System.out.println("Satisfactory");
        }

        // num3
        if (num3 >= 80) {
            System.out.println("Exellent");
        } else if (num3 >= 50 && num3 <= 79) {
            System.out.println("Good");
        } else {
            System.out.println("Satisfactory");
        }
    }
}