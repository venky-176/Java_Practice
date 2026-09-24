package ExceptionHandling;

import java.util.Scanner;

public class Checked {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        if(!sc.hasNextInt()){
            throw new ArithmeticException("Please enter a integer value");
        }
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        try {
            if(b ==0){
                throw new ArithmeticException("enter a integer value other than 0");}
        } catch (ArithmeticException e){
           // e.getMessage();
            System.out.println(e);
        }


        //int b = sc.nextInt();
       // System.out.println(a/b);
    }


}
