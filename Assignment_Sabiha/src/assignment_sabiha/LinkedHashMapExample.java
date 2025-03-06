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
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        linkedHashMap.put(3, "Mango");
        linkedHashMap.put(4, "Orange");

        // Display the LinkedHashMap elements
        System.out.println("LinkedHashMap elements: " + linkedHashMap);

        // Access an element by key
        System.out.println("Value for key 3: " + linkedHashMap.get(3));

        // Remove an element by key
        linkedHashMap.remove(2);
        System.out.println("After removing key 2: " + linkedHashMap);

        // Iterate through the LinkedHashMap
        System.out.println("Iterating through LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
    
}
}
