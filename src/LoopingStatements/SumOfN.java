package LoopingStatements;
import java.util.Scanner;
public class SumOfN {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range:");
        System.out.print("Min:");
        int min= sc.nextInt();
        System.out.print("Max:");
        int max=sc.nextInt();
        int sum=0;
        while(min<max){
            if(min%2==0) sum+=min;
            min++;
        }
        System.out.println(sum);
        sc.close();
    }
}
