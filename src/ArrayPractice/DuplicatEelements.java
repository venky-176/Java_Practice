package ArrayPractice;

import java.util.Arrays;

public class DuplicatEelements {
    static void main(String[] args) {
        int[] num={3,5,6,1,8,0,7,3,6,1,7,3,7,3};
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]) {
                    System.out.println(num[i]);}
            }
        }
    }
}
