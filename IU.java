import java.util.Scanner;

public class IU {
    public static void main(String[] args) {
        // Create the scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Taking the input from the user");

        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close(); // Good practice to close the scanner
    }
}