package ExceptionHandling;
//-> Exception is a event which disrupts the flow of a program or instructions.
//
/*
Checked exception( Compile-time) and unchecked exception(runtime)
-> throw= Used to explicitly throw a single exception.
-> throws= The throws keyword is used in a method declaration to indicate that the method may throw one or more exceptions.
 */
public class Exception1 {
    static void main(String[] args) throws ArithmeticException{
        System.out.println(" execution start");
        int a=6;
        int b=0;
        int res=0;
        try {
            res=a/b;
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
            //throw ae;
        }finally {
            // it executes whether there's a exception or not
            System.out.println("finally block");
        }
        System.out.println("result: "+res);
        System.out.println("execution end");
    }
}
