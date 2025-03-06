/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drsab
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal my_animal = new Animal();
        Cat my_cat = new Cat();
        Dog my_dog = new Dog();
        Duck my_duck = new Duck();
        my_animal.talk();
        my_cat.talk();
        my_dog.talk();
        my_duck.talk();
    }
    
}
