package homework_week6_niks;

/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class JavaHw2 {

    public static void main(String[] args) {                        //Main method
        nikMethod();
    }

    static int a = 1;                                               // 2 static variables
    static int b = 2;
    public static void nikMethod(){                                 // Static method = nikMethod
        System.out.println(a);
        System.out.println(b);

    }
}
