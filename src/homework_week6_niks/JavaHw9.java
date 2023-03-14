package homework_week6_niks;

/**
 * 9. Write a program to convert the upper case to lower case.
 */

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Scanner;
class JavaHw9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                               //Standard
        System.out.println("Enter Upper case string to convert =  ");           //SOUT to ask user to INPUT in UPPER CASE
        String upper = scanner.nextLine();                                      // next line

        JavaHw9 object = new JavaHw9();                                         //call object
        String lower = upper.toLowerCase();                                     //formula
        object.convertUpper(lower);                                             //call method
        scanner.close();                                                        //memory saver
    }
    public void convertUpper(String lower) {                                    //String
        System.out.println("Result in Lower case = " + lower);                  //sout for output
    }
}
