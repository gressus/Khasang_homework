package lesson2;

import java.util.Scanner;

/**
 * Created by Jedai86 on 09.10.2016.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter first number: ");
        System.out.print("> ");
        a = getIntegerFromUser();
        System.out.println("Enter second number: ");
        System.out.print("> ");
        b = getIntegerFromUser();
        calculate(a, b);
    }

    static int getIntegerFromUser() {
        int num = 0;
        boolean notExit = true;
        do {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                notExit = false;
            } else {
                System.out.println("You entered invalid number, try once more");
                System.out.print("> ");
            }
        } while (notExit);
        return num;
    }

    static void calculate(int a, int b) {
        boolean otherCase = true;
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            System.out.println("Multiple of numbers: " + (a*b));
            otherCase = false;
        }
        if (a > b) {
            System.out.println("Difference of numbers: " + (a - b));
            otherCase = false;
        }
        if (a < 0 && b < 0) {
            System.out.println("Sum of numbers: " + (a + b));
            otherCase = false;
        }
        if (otherCase) {
            System.out.println("a Mod b: " + (a % b));
        }
    }

}
