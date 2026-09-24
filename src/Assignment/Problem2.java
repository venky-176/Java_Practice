package Assignment;
import java.util.*;
public class Problem2 {

    //count of duplicates in a list
    static void main(String[] args) {
        List<Integer> l1= new ArrayList<>(Arrays.asList(3,4,5,2,3,4,8,7,3,9,1));
        List<Integer> Unique= new ArrayList<>();
        for(int un: l1){
            if(!Unique.contains(un)) Unique.add(un);
        }
        //Set<Integer> s1 = new HashSet<>(l1);
        for(int num : Unique){
            int count=0;
            for (int num1:l1){
                if(num==num1) count++;
            }
            if(count>1){
                System.out.println(num+":"+count);
            }
        }

    }
}
