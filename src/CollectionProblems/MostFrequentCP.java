package CollectionProblems;
import java.util.*;
public class MostFrequentCP {
    static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(3,6,7,1,0,4,3,7,9,1,6,3,7,9,0,1));
        System.out.println(l1);
        int max=0;
        int mosfrq=0;
        for(int num:l1){
            int count=0;
            for(int j=0;j<l1.size()-1;j++){
                if(num==l1.get(j)){
                    count++;
                }
            }
            if(count>max) {max=count;
                mosfrq=num;}
        }
        System.out.println(mosfrq+"-"+max);
    }
}
