package NumberProblems;
import java.util.*;
public class PrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();
        boolean bl= true;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                bl=false;
                break;
            }
        }
        System.out.println(bl? "is prime":"not prime");
    }
}
