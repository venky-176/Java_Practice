package ArrayPractice;

import java.util.Scanner;

public class MissingNumber {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the siE of the array: ");
        int n= sc.nextInt();
        int total=(n *(n+1))/2;
        System.out.println(total);
        int[] num={3,5,6,1,0,2,7};
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        int miss=total-sum;
        System.out.println("missing: "+miss);
    }
}
