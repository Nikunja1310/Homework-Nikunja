package homework_week6_niks;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
import java.sql.SQLOutput;
import java.util.Scanner;
public class JavaHw16 {
    public static void main(String[] args) {                                //Main- Method
    Scanner scanner = new Scanner (System.in);                              //Standar-Scanner
        System.out.println("Input first binary number:  ");                 //sout for 2 binary number
        String a = scanner.nextLine();                                      // Binary are String and NOT INT
        System.out.println("Enter second binary number: ");
        String b = scanner.nextLine();

        JavaHw16 object = new JavaHw16();                                   //object to call Instance
        int c = Integer.parseInt(a,2);                                 //Convert String to INT
        int d = Integer.parseInt(b,2);                                 // have to add ",2"  Binary means 2 and not in decimal
        int sum = c+d;

        String sumbin = Integer.toBinaryString(sum);                        // formaula to convert to Binary
        object.myBinary(sumbin);                                            //call the Instance method - myBinary
        scanner.close();
    }
    public void myBinary(String submin){                                    // Instance Method
        System.out.println("Sum of two binary number : " +submin );         //sout for Output
    }
}
