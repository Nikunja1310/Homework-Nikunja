package homework_week6_niks;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class JavaHw4 {
    int a = 10;                                            //instance variable1
    int b = 20;                                             //instance variable2
    static int c = 30;                                      // Static variable1
    static int d = 40;                                       // Static variable1

    public void myMethod(){                                 //call all 4 variable in Instance method=myMethod
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void hisMethod(){                         //call all 4 variables in Static method
        JavaHw4 object1 = new JavaHw4();                    // using OBJECT2 called Instance variables "a" & "b"
        System.out.println(object1.a);
        System.out.println(object1.b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        JavaHw4 object3 = new JavaHw4();
        object3.myMethod();
        hisMethod();

    }
}
