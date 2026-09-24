package DecisonMaking;
import java.util.Scanner;
public class Prog2 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the marks:");
        int marks=sc.nextInt();
        if(marks<=35){
            System.out.println("failed");
        } else if (marks >35 && marks<=50) {
            System.out.println("Passed");
        } else if (marks>50 && marks <=70) {
            System.out.println("Grade B");
        } else if (marks > 70 && marks <89) {
            System.out.println("Grade A");
        }else{
            System.out.println("Grade A+");
        }
        sc.close();
    }
}
