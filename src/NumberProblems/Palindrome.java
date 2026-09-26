package NumberProblems;
import java.util.*;
public class Palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int org= num;
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        System.out.println(org==rev?"same":"not same");
    }
}
