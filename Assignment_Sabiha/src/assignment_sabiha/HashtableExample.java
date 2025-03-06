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

import java.util.Hashtable;
public class HashtableExample {
    public static void main(String[] args) {
       Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Mango");
        hashtable.put(4, "Orange");

        // Display the Hashtable elements
        System.out.println("Hashtable elements: " + hashtable);

        // Access an element by key
        System.out.println("Value for key 3: " + hashtable.get(3));

        // Remove an element by key
        hashtable.remove(2);
        System.out.println("After removing key 2: " + hashtable);

        // Check if a key exists
        System.out.println("Is key 4 present? " + hashtable.containsKey(4));

        // Check if a value exists
        System.out.println("Is value 'Apple' present? " + hashtable.contains("Apple"));
    }
    
}
