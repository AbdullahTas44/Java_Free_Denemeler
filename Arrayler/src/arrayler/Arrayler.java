/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayler;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Arrayler {

    /**
     * @param args the command line arguments
     */
    
    
    
     public static double ortalamabul (int[] array){
    
        
        double toplam =0;
        double ortalama;
        
        System.out.println("*****************");
        
        System.out.println("****ortalama method çalışıyor dikkat ****");
        
        System.out.println("");
        
        for (int i =0 ; i < array.length; i++){
            
            toplam+=array[i];
            
            
        }
        
        ortalama= toplam / array.length;
        
        return ortalama;
        
     
    
    }
    
    
    public static void array_bastir(int [] array){
        
        
        System.out.println("*****************");
        
        System.out.println("****method çalışıyor dikkat ****");
        
        System.out.println("");
        
        for (int i = 0; i < array.length ; i ++){
            
            System.out.println(" gelen array " + (i+1) + ". değeri = " + array[i]);
            
        }
        
    }
    
    
   
    

        
    
        
        
    
    
    public static void main(String[] args) {
        
        
       // int a = 5;
        
       int[] a = new int[10];
              
       // double[] b;
       
       
       a[0]= 1;
       a[5]= 32;
       
       
       int[] b= {30,40,50,60,70};
       
        System.out.println(b[0]);
        System.out.println(b[2]);
        
        Scanner scanner = new Scanner(System.in);
        
        
        int[] c = new int[5];
        System.out.println("");
        System.out.println("*****************");
        
       for (int i=0; i< 5 ; i++){
           
           c[i]=i*4+2;
           
           System.out.println(c[i]);
           
           
       }
        
       
       int[] d = new int[5];
       
       for (int x=0 ; x <5 ; x++){
           
           System.out.print("lütfen " + (x + 1) + " değerimizi giriniz  ");
           d[x]=scanner.nextInt();
           
       }
       
       
        System.out.println("*********** sonuçlar **********");
       for (int x =0; x<5; x++){
           
           System.out.println((x + 1) + ". değerimizin 5 fazlası = " + (d[x]+5));
           
           
           
           
       }
       
        System.out.println("");
        System.out.println("******************");
       
       
       int[] e = {110,120,130,140,150};
       
        System.out.println("arrey uzunluğu " + e.length);
        
        
       
      
        array_bastir(e);
       
        
        System.out.println("e dizisi ortalaması = " + ortalamabul(e));
                
       
       
       
       
       
       
        
        
        
        
        
    }
}


    

