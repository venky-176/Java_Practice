package CollectionProblems;
import java.util.*;
public class MergeUniqueCP {
    static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(6,3,7,1,0,4));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(6,3,7,9,0,8));
        int n=Collections.max(l1);
        List<Integer> l3 = new ArrayList<>(l1);
        //set<Integer> s1= new LinkedHashSet<>();
        //set.addAll(l1);
        //set.addAll(l2);
        // LinkedHashset will follow insertion order.
        for(int num:l2){
            if(!l3.contains(num)){
                l3.add(num);
            }
        }
        System.out.println(l3);
    }
}
