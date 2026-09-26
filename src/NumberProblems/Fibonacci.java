package NumberProblems;

public class Fibonacci {
    static void main(String[] args) {
        int num=7;
        int n1=0;
        int n2=1;
        int sum=0;
        System.out.print(n1+" ");
        while(num>0){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            num--;
            System.out.print(sum+" ");
        }
        //System.out.println(sum);
    }
}
