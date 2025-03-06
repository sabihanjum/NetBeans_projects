/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drsab
 */
public class childClass extends Speak{

    /**
     * @param args the command line arguments
     */
    class Man extends Speak {
    @Override
    public void speak() {
        System.out.println("English");
    }
}

class Dog extends Speak {
    @Override
    public void speak() {
        System.out.println("Bow");
    }
}

class Duck extends Speak {
    @Override
    public void speak() {
        System.out.println("Quack");
    }
}

class Cat extends Speak {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
    public static void main(String[] args) {
        // TODO code application logic here
         
        

        for (Speak animal : animals) {
            animal.speak();
        }
    
    }
    
}
