/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autoboxing;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Autoboxing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> arraylist = new ArrayList<String>();
       
        ArrayList<Integer> arraylist2 =new ArrayList<Integer>();
        
        for( int i =0; i<10;i++){
            
            arraylist2.add(i*2);  // autoboxing 
            
            
            System.out.println(arraylist2.get(i)); // unboxing 
            
        }
    
    }
    
}
