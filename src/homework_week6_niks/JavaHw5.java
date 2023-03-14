package homework_week6_niks;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class JavaHw5 {
    public static void main(String[] args) {
        JavaHw5 object = new JavaHw5();
        object.addition();                                              // called object for Instance Variable
        object.subtraction();
        multiplication();                                               // called directly
        division();
    }

    int a = 10;
    int b = 20;

    public void addition() {
        int equals = a + b;
        System.out.println(equals);
    }

    public void subtraction() {
        int equals = b - a;
        System.out.println(equals);
    }

    public static void multiplication() {
        int a = 10;
        int b = 20;
        int equals = a * b;
        System.out.println(equals);
    }

    public static void division() {
        int a = 10;
        int b = 20;
        int equals = b / a;
        System.out.println(equals);
    }
}
