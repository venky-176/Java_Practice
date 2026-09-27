package ArrayPractice;
import java.util.*;
public class ReverseArray {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the siE of the array: ");
        int n= sc.nextInt();
        int[] num= new int[n];
        //int[] num={3,5,6,1,8,0,7};
        System.out.println(Arrays.toString(num));
        System.out.println("enter the elements:");
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        int l=0;
        int r=num.length-1;
        while(l!=r && l<r){
           int lef=num[l];
           int rig=num[r];
           num[l]=rig;
           num[r]=lef;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(num));
    }
}
