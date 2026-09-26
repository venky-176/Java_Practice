package NumberProblems;
import java.util.*;
public class Armstrong {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int org=num;
        int org1=num;
        int sum=0;
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        while (org>0){
            int a=org%10;
            sum += (int) Math.pow(a, count);
            org/=10;
        }

        System.out.println(sum==org1?"saame":"not same");
    }
}
