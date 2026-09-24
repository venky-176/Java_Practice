package List;

import java.util.*;

public class Arraylist {
    //default capacity will be 0
    //initial capacity after initializing a object is 10after-wards it will 1.5x itself
    //add() to add elements
    //addAll() to add another collection/ more elements at a time
    //get(index) to retrieve a object
    //remove(object)/remove(index) to remove an element
    //removeAll(Collection) to remove another collection.
    //clear() to remove an entire VectorList.
    //contains("object") to verify whether the object is there or not.(boolean)
    //set(index,obj) to update a list
    //toArray() to convert into an array
    // .sublist(index,index) to split a list.
    static void main(String[] args) {
        ArrayList<String> A= new ArrayList<>();
        A.add("ven");
        A.add("kal");
        A.add(0,"balu");// we can add at the index we want
        System.out.println(A);
        ArrayList<String> A2 = new ArrayList<>();
        A2.add("sri");
        A2.add("gna");
        A.addAll(A2);
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println(A);
        System.out.println( "first: "+A.getFirst());
        System.out.println("3 object: "+A.get(2));
        System.out.println("removing gna");
        A.set(2,"dil");
        System.out.println("before removing a collection: "+A);
        A.removeAll(A2);
        System.out.println("After removing a collection: "+A);
    }
}
