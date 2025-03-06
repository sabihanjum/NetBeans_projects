/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drsab
 */
public class Constructor {
    int p;
    
    Constructor(){ //default constructor
        p=45;
    }
    Constructor(int Q){
        p=Q;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Constructor ce1=new Constructor(); //using the default constructor
        Constructor ce2=new Constructor(44); // using the parameterized constructor
        System.out.println(ce1.p);   //prints 45
        System.out.println(ce2.p);   //prints 44
    }
    
}
