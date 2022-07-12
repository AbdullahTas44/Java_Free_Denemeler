/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraycopyvesort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ArrayCopyveSort {

    /**
     * @param args the command line arguments
     */
    
    
    public static int[] arrayi_doldur (int sayi){
        
        
        
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int [sayi];
        
        System.out.println("");
        System.out.println("array alma metodumuz çalışıyor");
        System.out.println("");
        
        
        for (int i =0 ; i<sayi ; i++){
            
            
            System.out.print("arraye " + (i+1) + ". değerimizi girelim  ");
            cikti[i]= scanner.nextInt();
            
            
            
        }
        
        return cikti;
        
        
        
    }
    
    
     public static void arrayi_bastir ( int[] array){
            
          
         System.out.println("");
         System.out.println("bastır metodumuz çalışıyor");
         System.out.println("");
         
            for (int i =0; i<array.length; i++){
                
                System.out.println("arrayımız " + (i+1) + ". değerimiz = " + array[i]);
                
       
                
                
            }
            
            
            
        }
     
     
     public static void array_sort(int []  array){
         
          // arrays sınıfı içerisinde sort methodu

          
         System.out.println("");
         System.out.println("array sıralayıp bastır metodumuz çalışıyor");
         System.out.println("");
         
         
          Arrays.sort(array);
          
          arrayi_bastir(array);
          
          
          
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        int[] a= arrayi_doldur(5);
        
        arrayi_bastir(a);
        
        array_sort(a);
        
        
      int b[] = {1,2,3,4,5,6};
      int c[] = {1,2,3,4,5,8};
      
      /*
        if (b == c){
          
          System.out.println("eşitler");
          
      }
      else {
          
          System.out.println("eşit değiller");
      }

      */
      
      
      if (Arrays.equals(b, c)){
          
          System.out.println("eşitler");
          
      }
      else {
          
          System.out.println("eşit değiller");
          
          
      }
        
      // çok boyutlu array tanımı yapalım 
     
      
      int [][] d = new int [2][2];
      
      
     d[0][0]=5;
     d[0][1]=2;
     d[1][0]=10;
     d[1][1]=4;
     
     
     
     
     
     
     
        
        
        
        
    }
    
}
