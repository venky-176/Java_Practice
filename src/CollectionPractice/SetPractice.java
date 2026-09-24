package CollectionPractice;
import java.util.*;
//HashSet(C) implements Set(I)<- SortedSet(I)<-NavigableSet(I) extendsTreeSet(C)
public class SetPractice {
    static void main(String[] args) {
        //Hashset uses hashmap to store internally and doesn't follow insertion order
        //LinkedHashSet follows insertion order and it follows linked hash map to add elements
        //TreeSet it follows TreeMap and the elements will be in sorted order
        //TreeSet methods are poll() to delete first(),last() 
        HashSet<Integer> hs = new HashSet<>();
        hs.add(8);
        hs.add(6);
        hs.add(8);
        hs.add(43);
        hs.add(21);
        hs.add(88);
        //add(item) to add
        System.out.println(hs);
        //remove(item) to delete
        System.out.println(hs.remove(21));
        System.out.println(hs);
        hs.clear();
        System.out.println(hs);

    }
}
