import java.util.*;
public class LeetDebug {
    static void main(String[] args) {
        String s="a a";
        char[] ch=s.toCharArray();
        Map<Character,Integer> store= new HashMap<>();
        for(char chs:ch){
            //if(store.containsKey(chs)){
                store.put(chs,store.getOrDefault(chs,0)+1);

        }
        int sum=0;
        for(Map.Entry<Character,Integer> mp:store.entrySet()){
            sum=sum+((mp.getKey()*mp.getValue())%5);
        }
        System.out.println(sum);
    }
}
