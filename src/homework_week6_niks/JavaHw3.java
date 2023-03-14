package homework_week6_niks;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class JavaHw3 {
    int a = 10;                                             // Instance Variable
    static int b = 20;                                      // Static Variable

    public static void main(String[] args) {                // Main Method
        JavaHw3 obj = new JavaHw3();                        // called Instance Variable using Object =obj
        obj.myVariable();                                   //print object
        myStaticVar();                                      //directly called Static
    }

    public void myVariable() {                                // Instance Variable "method" = myVariable
        System.out.println(a);                                //print
    }

    public static void myStaticVar() {                         //Static Variable "Method" = myStaticVar
        System.out.println(b);                                 //print
    }
}
