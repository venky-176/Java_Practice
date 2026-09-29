package CollectionProblems;
import java.util.*;
public class FrequencyCP {
    static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(3,6,7,1,0,4,3,7,9,1,6,3,7,9,0,1));
        System.out.println(l1);
        Map<Integer,Integer> m1= new LinkedHashMap<>();
        for(int num:l1){
            m1.put(num,m1.getOrDefault(num,0)+1);
//            if(m1.containsKey(num)){
//                m1.put(num,m1.get(num)+1);
//            }else {
//                m1.put(num,1);
//            }
        }

        System.out.println(m1);
        for(Map.Entry<Integer,Integer> k1: m1.entrySet()){
            System.out.println(k1.getKey()+"-"+k1.getValue());
        }
    }
}
