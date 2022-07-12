/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticolmayanınnerclasslar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class StaticOlmayanInnerClasslar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        
        Matematik.Factorial factorial = new Matematik().new Factorial();
        
        Matematik.Asal asal = new Matematik().new Asal();
        
        Matematik.Alan alan = new Matematik().new Alan();
        
        Matematik.Alan.Daire_Alan daire_alan = new Matematik().new Alan().new Daire_Alan();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayı giriniz");
        int sayi = scanner.nextInt();
        scanner.nextLine();
        
        if(asal.asal_mi(sayi)){
            
            System.out.println("bu sayı asaldır");
            
        }else {
            
            System.out.println("bu sayı asal değildir");
        }
        
        factorial.faktoriyel();
        //alan.daire_alan(5);
        
        daire_alan.daire_alan(6);
                
        
        
        
        
        
        
    }
    
}
