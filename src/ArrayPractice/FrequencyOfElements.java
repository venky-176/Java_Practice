package ArrayPractice;
import java.util.*;
public class FrequencyOfElements {
    static void main(String[] args) {
        int[] num={3,5,6,1,8,0,7,3,6,1,7,3,7,3};
        System.out.println(Arrays.toString(num));
        boolean[] bool = new boolean[num.length];
        for (int i=0;i<num.length;i++){
            int count=1;
            if(bool[i]){
                continue;
            }
            for (int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    count++;
                    bool[j]=true;
                }
            }
            System.out.println(num[i]+"-"+count);
        }
    }
}
