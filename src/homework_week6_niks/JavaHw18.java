package homework_week6_niks;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
import java.util.Scanner;
public class JavaHw18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number : ");
        System.out.println("Input second number : ");
        int a=scanner.nextInt();
        int b = scanner.nextInt();

        JavaHw18 object = new JavaHw18();
        object.addition(a,b);
        object.subtraction(a,b);
        object.multiplication(a,b);
        object.division(a,b);
        object.modify(a,b);
        scanner.close();
    }
   public void addition (int a, int b){
       int sum = a + b;
       System.out.println(a +" + " + b + " = " +  sum);
   }
    public void subtraction (int a,int b){
        int minus = a - b;
        System.out.println(a +" - " + b + " = "+ minus );
    }
    public void multiplication (int a, int b ){
        int multi = a * b;
        System.out.println(a +" x " + b + " = " + multi);
    }
    public void division (int a, int b){
        int divide = a / b;
        System.out.println(a + " / " + b + " = " + divide);
    }
    public void modify (int a, int b){
        int mod = a/b;
        System.out.println(a + " mod " + b + " = " + mod );
    }

}
