/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drsab
 */


import java.util.Scanner;  

public class TextToHexadecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the plain text: ");
            String input = scanner.nextLine();  
            
            
            StringBuilder hexString = new StringBuilder();
            for (char ch : input.toCharArray()) {
                hexString.append(String.format("%02X", (int) ch));  
            }
            
           
            System.out.println("The entered plain text in hexadecimal is: " + hexString);
        }
    }
}

        
    
