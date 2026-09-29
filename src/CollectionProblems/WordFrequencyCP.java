package CollectionProblems;
import java.util.*;
public class WordFrequencyCP {
    static void main(String[] args) {
        String sg="java is easy java is powerful";
        String[] sg1=sg.split(" ");
        Map<String,Integer> mp1= new LinkedHashMap<>();
        for(String s:sg1){
            mp1.put(s, mp1.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> val:mp1.entrySet() ){
            System.out.println(val.getKey()+"--"+val.getValue());
        }
    }
}
