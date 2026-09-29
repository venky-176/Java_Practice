package CollectionProblems;
import java.util.*;
public class DuplicatePrintCP {
    static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(3,6,7,1,0,4,3,7,9,1,6,3,7,9,0,1));
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new LinkedHashSet<>();

        for (int num : l1) {
            if (!seen.add(num)) {
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);
    }
}
