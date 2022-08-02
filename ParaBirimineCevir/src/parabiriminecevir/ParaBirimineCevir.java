/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parabiriminecevir;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ParaBirimineCevir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir miktar giriniz : ");
        double payment = input.nextDouble();
    
      
    
    
        Locale indiaLocale = new Locale("en","IN");
        Locale turkeyLocale = new Locale("en","TR");
        
       
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat turkey = NumberFormat.getCurrencyInstance(turkeyLocale);
        
        
        
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
        System.out.println("Türkiye: " + turkey.format(payment));
        
    
        
    
    
    
    }
    
}
