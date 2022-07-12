/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticolmayanınnerclasslar;

import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class Matematik {
    
    
    private double PI = Math.PI;
    
    public class Factorial{
        
        public void faktoriyel(){
            
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("bir sayı giriniz");
            
            int sayi = scanner.nextInt();
            scanner.nextLine();
            int fakt=1;
            
            for( int i =1 ; i <= sayi ; i++){
                
              fakt= fakt*i;
              
                
                
            }
            
            System.out.println("faktöriyel = " + fakt);
            
            
            
        }
        
        
    }
    
    
    public class Asal {
        
        
        public boolean asal_mi (int sayi ){
            
            int i=2;
            
            while (i<sayi){
                
         
                if (sayi % i == 0){
                    
                    return false;
                    
                    
                
                
            }
            i++;
            
            
        }
            
           return true;
           
           
            
            
            
        
    }
    
    
    
    
    
}
    
    
    public class Alan{
        
        
        public class Daire_Alan {
            
            
            
      
        
        public void daire_alan(int yaricap){
            
            System.out.println("dairenin alanı : " + (yaricap*yaricap*PI));
            
            
        }
          }
        
        
    }

}

