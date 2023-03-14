package homework_week6_niks;

/**
 * 15. Write a Java program to swap two variables.
 */
import java.util.Scanner;
public class JavaHw15 {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers below to Swap two variables.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Original numbers : a = " + a + "," + " b = " + b);
        System.out.println("Swapped numbers : a = "+ b + " ," + " b =" + a);

        scanner.close();
    }
}