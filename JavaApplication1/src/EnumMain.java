/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drsab
 */
public class EnumMain {

    /**
     * @param args the command line arguments
     */
    enum Rank{
        FCD,
        FC,
        SC,
        FAIL
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Rank r1 = Rank.FC;
        System.out.println(r1);
    }
    
}
