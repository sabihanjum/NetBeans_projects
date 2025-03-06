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
import java.util.Vector; // Importing the built-in Vector class

public class Vectorinteger {
    public static void main(String[] args) {
        // Create a vector to store integers
        Vector<Integer> vector = new Vector<>(); // Correct declaration with generics

        // Add elements to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        // Display the vector elements
        System.out.println("Vector elements:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        // Remove an element from the vector
        vector.remove(2); // Removes element at index 2 (30)

        // Display the vector after removal
        System.out.println("Vector after removal:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        // Access an element at a specific index
        System.out.println("Element at index 1: " + vector.get(1));

        // Check if a value exists in the vector
        if (vector.contains(20)) {
            System.out.println("Vector contains 20");
        } else {
            System.out.println("Vector does not contain 20");
        }

        // Get the size and capacity of the vector
        System.out.println("Size of the vector: " + vector.size());
        System.out.println("Capacity of the vector: " + vector.capacity());
    }
}

