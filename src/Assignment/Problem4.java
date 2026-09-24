package Assignment;
import java.util.*;
public class Problem4 {
    //Remove duplicates from alist
    static void main(String[] args) {
        List<Integer> l1= new ArrayList<>(Arrays.asList(3,4,5,2,3,4,8,7,3,9,1));
        List<Integer> Unique = new ArrayList<>();
        //l1.remove(Integer.valueOf(3));
        System.out.println(l1);
        for(int un: l1){
            if(!Unique.contains(un)) Unique.add(un);
        }
        System.out.println(Unique);
        for(Integer num : Unique) {
            int count = 0;
            for (Integer num1 : l1) {
                if (num.equals(num1)) count++;
            }
            if (count > 1) {
                while(l1.contains(num)){
                l1.remove(num);}
            }
        }
        System.out.println(l1);
    }
}
