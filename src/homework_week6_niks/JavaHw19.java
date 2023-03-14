package homework_week6_niks;

/**
 * 19. Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  Output: the quick brown fox jumps over the lazy dog.
 */
import java.util.Scanner;
public class JavaHw19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);                               // FIRST 3 LINES ALWAYS FOR INPUT
        System.out.println("Sample Input (Uppercase) : "+ ".");
        String upperto = scanner.nextLine();

        JavaHw19 object = new JavaHw19();
        String lower =  upperto.toLowerCase();                                   // "input.toLowercase()" = FORMULA
        object.convertToLower(lower);
        scanner.close();
    }
    public void convertToLower (String lower){
        System.out.println("Output (Lowercase) : " + lower );
    }
}
