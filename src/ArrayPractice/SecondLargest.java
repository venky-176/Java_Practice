package ArrayPractice;
import java.util.*;
public class SecondLargest {
    static void main(String[] args) {
        int[] num={3,5,6,1,8,0,7};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {

            if (num[i] > max) {
                max2 = max;
                max = num[i];
            }
            else if (num[i] > max2 && num[i] != max) {
                max2 = num[i];
            }
        }
        System.out.println(max2);
    }
}
