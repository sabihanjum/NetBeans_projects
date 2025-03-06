/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment_sabiha;

/**
 *
 * @author drsab
 */
import java.util.TreeMap;
public class TreeMapExample {
public static void main(String[] args) {
       TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put(3, "Banana");
        treeMap.put(1, "Apple");
        treeMap.put(4, "Mango");
        treeMap.put(2, "Orange");

        // Display the TreeMap elements (they will be sorted by keys)
        System.out.println("TreeMap elements: " + treeMap);

        // Access an element by key
        System.out.println("Value for key 2: " + treeMap.get(2));

        // Remove an element by key
        treeMap.remove(3);
        System.out.println("After removing key 3: " + treeMap);

        // Display the first and last keys in the TreeMap
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());
    }
    
}


