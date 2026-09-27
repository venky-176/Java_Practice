package ArrayPractice;
import java.util.*;
public class LargestSmallest {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the siE of the array: ");
        int n= sc.nextInt();
        int[] num= new int[n];
        //int[] num={3,5,6,1,8,0,7}
        System.out.println("enter the elements:");
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        int largest=largestNum(num);
        int small=smallest(num);
        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+small);
        sc.close();
    }
    static int largestNum(int[] num){
        int max=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
    static int smallest(int[] num){
        int min=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        return min;
    }
}
