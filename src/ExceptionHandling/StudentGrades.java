package ExceptionHandling;
import java.util.Scanner;
public class StudentGrades {
    public static void excephand(int a, String ed){

    }
    static void main (String[] args)   {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total marks: ");
        int totalmarks= sc.nextInt();
        System.out.println("enter obtained marks: ");
        try {
            int obtmarks= sc.nextInt();
            if (obtmarks>totalmarks){
                throw new Exception("rtyghjhg");
            }
            System.out.println("in try block");
        }catch (ArithmeticException e){
            System.out.println("enter marks lower");
        }
        catch (Exception e) {
            System.out.println("in Exception");
        }
         finally {
            System.out.println("calculation complete");
        }


    }
}