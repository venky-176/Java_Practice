package CollectionProblems;
import java.util.*;
public class FirstRepeatedCP {
    static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(6,3,7,1,0,4,3,7,9,1,6,3,7,9,0,1));
        Map<Integer,Integer> m1= new LinkedHashMap<>();
        for(int num:l1){
            m1.put(num,m1.getOrDefault(num,0)+1);
        }
        for(int num:l1){
            if(m1.get(num)>1){
                System.out.println(num);
                break;
            }
        }
    }
}
