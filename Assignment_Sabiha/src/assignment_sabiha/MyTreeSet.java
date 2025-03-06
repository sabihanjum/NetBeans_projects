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
import java.util.TreeSet;
public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Mango");

        // Display the elements (they will be sorted in natural order)
        System.out.println("TreeSet elements: " + treeSet);

        // Trying to add a duplicate element
        treeSet.add("Apple");
        System.out.println("After trying to add duplicate 'Apple': " + treeSet);

        // Access the first and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Remove an element
        treeSet.remove("Orange");
        System.out.println("After removing 'Orange': " + treeSet);
    }
    
}
