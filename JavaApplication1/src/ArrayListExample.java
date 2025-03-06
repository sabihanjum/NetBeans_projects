/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drsab
 */

//---ArrayList Program------
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating an ArrayList of string type
        ArrayList<String> fruits = new ArrayList<>();
        
        //Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); //Allows duplicate
        
        //Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); //output : APple
        
        //Iterating over the ArrayList
        System.out.println("List of fruits: ");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        //Sorting the ArrayList
        Collections.sort(fruits);
        System.out.println("Sorted fruits: " + fruits);
        
        //Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Bananas: " + fruits);
    }
    
}
