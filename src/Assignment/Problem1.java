package Assignment;
import java.util.*;
public class Problem1 {
    static void main(String[] args) {
        //splitting the 2 lists
        List<Integer> l1= new ArrayList<>(Arrays.asList(2,5,6,4,7,3,1,8,9));
        System.out.println(l1);
        int size=l1.size()/2;
        List<Integer> l2= new ArrayList<>();
        List<Integer> l3= new ArrayList<>(l1.subList(size,l1.size()));
        l2=l1.subList(0,size);
        //l3=l1.subList(size,l1.size());
//        for (int i=0;i<size;i++){
//            l2.add(l1.get(i));
//        }
//        for (int i=size;i<l1.size();i++){
//            l3.add(l1.get(i));
//        }
//        normal function
        System.out.println("l2: "+l2);
        System.out.println("l3: "+l3);
    }
}
