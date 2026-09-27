package ArrayPractice;
import java.util.*;
public class Sorting {
    static void main(String[] args) {
        int[] num={3,5,6,1,8,0,7};
        System.out.println(Arrays.toString(num));
        for(int i=0;i<num.length;i++){

            int index=i;
            for (int j = i+1; j < num.length; j++) {
                if(num[j]<num[index]) index=j;
            }
           int temp=num[i];
            num[i]=num[index];
            num[index]=temp;
        }
        System.out.println(Arrays.toString(num));
    }
}
