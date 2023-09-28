import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;

        System.out.print("Please enter your first number: ");
        if (scan.hasNextDouble()) {
            num1 = scan.nextDouble();
            System.out.print("Please enter your second number: ");
            if (scan.hasNextDouble()) {
                num2 = scan.nextDouble();
                if (num1 > num2) {
                    System.out.println(num1 + " is greater than " + num2);
                } else if (num1 < num2) {
                    System.out.println(num2 + " is greater than " + num1);
                } else {
                    System.out.println(num1 + " is equal to " + num2);
                }
            } else {
                System.out.println("You entered an invalid value for your second number.  Please enter a number.");
                System.exit(0);
            }
        } else {
            System.out.println("You entered an invalid value for your first number.  Please enter a number.");
            System.exit(0);
        }

    }
}