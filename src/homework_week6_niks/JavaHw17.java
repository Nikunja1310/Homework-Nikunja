package homework_week6_niks;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class JavaHw17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input a Decimal number");
        int a = scanner.nextInt();

        JavaHw17 object = new JavaHw17();
        String result = Integer.toBinaryString(a);                  //formula to convert in Binary  = no ",2"
        object.intToBin(result);
        scanner.close();
            }
    public void intToBin (String result){
        System.out.println("Binary number is : " + result);
    }
}
