package CollectionProblems;
import java.util.*;
public class CommonElementsCP {
    static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(6,3,7,1,0,4));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(6,3,7,9,0,8));
        List<Integer> l3 = new ArrayList<>();
        for(int num : l1){
            if(l2.contains(num)){
                l3.add(num);
            }
        }
        System.out.println(l3);
    }
}
