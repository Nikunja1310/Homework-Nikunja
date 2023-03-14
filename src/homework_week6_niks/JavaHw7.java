package homework_week6_niks;
import java.util.Scanner;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class JavaHw7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature value in Degree Fahrenheit. ");
        int d = scanner.nextInt();

        JavaHw7 object = new JavaHw7();
        int c = ((d-32)*5/9);
        object.degreeCelsius(c);
        scanner.close();
    }
    public void degreeCelsius(int c){
        System.out.println("Converted to Degree Celsius = "+c+"°C");
    }
}
