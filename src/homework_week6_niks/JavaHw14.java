package homework_week6_niks;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class JavaHw14 {
    public static void main(String[] args) {
      double a = (5.6 * 8.5);
        System.out.println("Area is 5.6 * 8.5 = " + String.format("%.2f",a,2 ));                // Formula = String.format("%.2f",output);
        System.out.println("Perimeter is 2 * (5.6 + 8.5 ) = " + String.format("%.2f",2*(5.6+8.5)));
    }
}
//INPUT         OUTPUT
// %.2f =        2 digit after Decimals
// %.3f =        3 digit after Decimals
// %.4f =