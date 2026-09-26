package NumberProblems;
import  java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Factorial of "+num+" is "+factorial(num));
        sc.close();
    }
    public static int factorial(int num){
        if(num>0){
            return num*factorial(num-1);
        }
        return 1;
    }
}
