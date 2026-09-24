package Assignment;
import java.util.*;
public class Problem3 {
    //highest no.of duplicated element
    static void main(String[] args) {
        List<Integer> l1= new ArrayList<>(Arrays.asList(3,4,5,2,3,4,8,7,4,3,9,1));
        Integer num1=null;
        int highest=0;
        for (int num:l1){
            int count=0;
            for (int num2:l1){
                if(num2==num) count++;
            }
            if(count>highest) {highest=count;num1=num;}
        }
        System.out.println(num1);
    }
}
