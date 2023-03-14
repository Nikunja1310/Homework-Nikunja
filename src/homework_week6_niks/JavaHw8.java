package homework_week6_niks;

/**
 *Write a program to calculate the area of a triangle.
 */
import java.util.Scanner;
public class JavaHw8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Base of the Triangle.");
        System.out.println("Please Enter Height of the Triangle");
        double b = scanner.nextInt();
        double h = scanner.nextInt();
        double a = 0.5 * (b * h);                                             // we can also use Object
                                                                             //JavaHw8 object = new JavaHw8();
        System.out.println("Area of a Triangle is "+a+"sq mtrs");            //object.areaOfTriangle(a);
        scanner.close();
    }

}