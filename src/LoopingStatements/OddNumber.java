package LoopingStatements;
import java.util.Scanner;
public class OddNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        System.out.print("Min:");
        int min= sc.nextInt();
        System.out.print("Max:");
        int max=sc.nextInt();
        while(min<max){
            if(min%2!=0) System.out.println(min);
            min++;
        }
        sc.close();
    }
}
