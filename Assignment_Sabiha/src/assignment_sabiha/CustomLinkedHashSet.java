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
import java.util.LinkedHashSet; // Import the LinkedHashSet class from the java.util package
public class CustomLinkedHashSet { // Renamed to avoid conflict

    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(20); // Duplicate element (will not be added)

        // Display the elements in the LinkedHashSet
        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        // Remove an element from the LinkedHashSet
        linkedHashSet.remove(20);
        System.out.println("After removing 20: " + linkedHashSet);

        // Check if an element exists
        if (linkedHashSet.contains(30)) {
            System.out.println("LinkedHashSet contains 30");
        } else {
            System.out.println("LinkedHashSet does not contain 30");
        }

        // Get the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());
    }
}

