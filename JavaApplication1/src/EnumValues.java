/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drsab
 */
public class EnumValues {

    /**
     * @param args the command line arguments
     */
    enum Day{Mon, Tue, Wed, Thur, Fri, Sat, Sun}
    public static void main(String[] args) {
        // TODO code application logic here
        for(Day day : Day.values())
        {
            System.out.println(day);
        }
    }
    
}
