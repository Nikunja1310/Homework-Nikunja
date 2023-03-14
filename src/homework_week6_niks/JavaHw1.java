package homework_week6_niks;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class JavaHw1 {
    public static void main(String[] args) {                                        //Main Method
        JavaHw1 obj = new JavaHw1();                                                //Called Instance Variable using Object = obj
        obj.myVar();
    }
    int a = 10;                                                                    // 2 instance variables
    int b = 20;
    public void myVar(){                                                       //Method
        System.out.println(a);
        System.out.println(b);
    }
}
