package CollectionProblems;
import java.util.*;
public class DuplicatesCP {
    static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(3,6,7,1,0,4,3,7,9));
        System.out.println(l1);
       // Set<Integer> s1 = new LinkedHashSet<>(l1); here we use linked hashset cause it maintains insertion order.
        List<Integer> l2 = new ArrayList<>();
        for(int num:l1){
            if(!l2.contains(num)){
                l2.add(num);
            }
        }
        System.out.println(l2);

    }
}
