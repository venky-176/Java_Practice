package List;
import java.util.*;
//size-no.of elements in a list; capacity-total memory of list
public class VectorList {
    //Initial and default capacity will be 10 after-wards it will double itself
    //add() to add elements
    //addAll() to add another collection/ more elements at a time
    //get(index) to retrieve a object
    //remove(object)/remove(index) to remove an element
    //removeAll(Collection) to remove another collection.
    //clear() to remove an entire VectorList.
    //contains("object") to verify whether the object is there or not.(boolean)
    //set(index,obj) to update a list
    //toArray() to convert into an array
    static void main(String[] args) {
        Vector<String> v= new Vector<>();
        v.add("ven");
        v.add("kal");
        v.add(0,"balu");// we can add at the index we want
        System.out.println(v);
        Vector<String> v2 = new Vector<>();
        v2.add("sri");
        v2.add("gna");
        v.addAll(v2);
        System.out.println(v);
        System.out.println( "first: "+v.getFirst());
        System.out.println("3 object: "+v.get(2));
        System.out.println("removing gna");
        v.set(2,"dil");
        System.out.println("before removing a collection: "+v);
        v.removeAll(v2);
        System.out.println("After removing a collection: "+v);
    }
}
