package homework_week6_niks;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
import java.util.Scanner;
public class JavaHw13 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number1 = ");
        int a = scanner.nextInt();
        System.out.println("Enter number2 = ");
        int b = scanner.nextInt();
        System.out.println("Enter number3 = ");
        int c = scanner.nextInt();

        JavaHw13 object = new JavaHw13();
        object.average3Result(a,b,c);
        scanner.close();

    }
    public void average3Result (int a,int b, int c){
        int ans = a+b+c;
        System.out.println("Average of the numbers is = "+ ans/3);
    }
}
