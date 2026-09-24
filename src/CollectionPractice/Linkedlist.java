package CollectionPractice;
import java.util.*;
//Linkedlist implements List and deque interface. here deque extends queue interface
//default size is 0, now we implement only List methods
//default capacity will be 0
//initial capacity after initializing a object is 0
//add() to add elements
//addAll() to add another collection/ more elements at a time
//get(index) to retrieve a object
//remove(object)/remove(index) to remove an element
//removeAll(Collection) to remove another collection.
//clear() to remove an entire VectorList.
//contains("object") to verify whether the object is there or not.(boolean)
//set(index,obj) to update a list
public class Linkedlist {
    static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("ven");
        l1.add("kal");
        l1.add(0,"balu");// we can add at the index we want
        System.out.println(l1);
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("sri");
        l2.add("gna");
        l2.add("cha");
        l1.addAll(l2);// we can add Arraylist also to the linked list
        System.out.println(l1);
        l1.remove(3);
        l1.remove("cha");
        System.out.println(l1);
        System.out.println(l1.get(2));
        System.out.println(l1);
        l1.set(2,"dil");
        System.out.println(l1);

    }
}
