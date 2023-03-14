package homework_week6_niks;
/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;
public class JavaHw6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);             //Standard
        System.out.println("Enter any Radius value : ");     //Question for User Sout
        int r = scanner.nextInt();                           //User inputs R = value of Radius

        JavaHw6 radius1 = new JavaHw6();                    // object = radius1---- called Instance Variable
        int a = 22/7*r*r;                                    // formula A = Area of a Circle
        radius1.printArea(a);
        scanner.close();                                    //to save memory

    }

    public void printArea(int a) {
        System.out.println("Are of a circle is equal to = " + a);
                                                                         //sout for output

    }
}