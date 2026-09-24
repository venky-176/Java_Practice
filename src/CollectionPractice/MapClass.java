package CollectionPractice;

import java.util.*;

//Map is an interface provided by a collections framework
//-> put(key,value) to add into a map
//-> get(key) to get value from a map
//-> remove(key), remove(key,value) to delete an entry from a map
//-> contains(key),contains(value) to check whether the key, value or present or not.
//-> size() gives the total size of map
//-> clear() to delete the map
//-> we use keySet, valueSet to retrieve keys and values
//-> hashtable is synchronized implementation w/o null key,values.
//-> entrySet() returns set of keyvalue pairs. Uses Map.Entry<K,V>
//-> getOrDefault(K,V)
public class MapClass {
    static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        //hashmap uses (array and nodes) internally to store elements.
        product.put("laptop",100);
        product.put("phones",500);
        product.put("headphones",250);
        product.put("Cables",550);
//        System.out.println(product);
        printProduct(product);
        product.put("phones", 280);
        System.out.println();
        printProduct(product);
        String search="laptop";
        if(product.containsKey(search)) {
            System.out.println("Stock: "+search+"-"+product.get(search));
        }
        product.remove("cables");
        printProduct(product);
    }
    public static void printProduct(Map<String,Integer> mp){
        for(Map.Entry<String,Integer> va: mp.entrySet()){
            System.out.println("Product: " + va.getKey() + " | Quantity: " + va.getValue());
        }
    }
}
