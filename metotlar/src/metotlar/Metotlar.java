/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metotlar;

import com.sun.jndi.url.iiop.iiopURLContext;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Metotlar {

  
    
    
   public static boolean asalbulma (int sayi){
       
       for (int i=2 ; i<sayi; i++){
           
           if (sayi % i == 0){
               
               return false;
             
           }
        }
    
       return true;
       
       
       
   }
    
    
    
    
    public static void selamlama() {
        
        System.out.println("merhabalar");
        System.out.println("selamlar...");
        
        
    }
    
    
    public static void selamla_2(String isim)
    {
        
        System.out.println("selamlar " + isim);
        
    }
    
  
    
    
    public static void toplama( int a,int b, int c)
    {
        
        
      
        
        System.out.println("toplama sonucu =" + (a+b+c));
        
        
        
    }
    
    
    public static int toplam_2 (int a, int b, int c)
    {
        
        int toplam= a+b+c;
        
        
       // System.out.println("toplam sonucu = " + toplam);
        
       return (toplam);
       
        
        
        
    }
    
    
    public static int ikiilecarp (int a)
    {
        
        return (a*2);
        
        
    }
    
    
    public static int ikiiletopla (int a)
    {
        
        return (a+2);
        
    }
    
    public static int dortilecarp (int a)
    {
        return (a*4);
        
    }
    
    
    public static void faktroriyel(){
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("bir sayı giriniz");
        
        int sayi = scanner.nextInt();
        
        
        int faktoriyel=1;
        
        while (sayi>0)
        {
            faktoriyel=faktoriyel*sayi;
            
            sayi--;
            
            
        }
        
        
        System.out.println("faktöriyel=" + faktoriyel);
        
        
        
    }
    
    
   
       
    public static int ebob(int sayi1, int sayi2){
        
        int ebob=1;
        
        for (int i = 1; i<= sayi1 && i<=sayi2; i++){
            
            if ((sayi1 % i==0 ) && (sayi2 % i ==0)){
                
                System.out.println("bölenler= " + i );
                
                ebob=i;
                
                
            }
            
        }
        return ebob;
        
        
    }
   
       
    
   
   
    
    public static void main(String[] args) {
       
        
        
        /*
        selamlama();
        
        selamla_2("murat");
        
        
        toplama(3, 6, 10);
        
       
        
        
        
        System.out.println("çıktı değerimiz = " + toplam_2(3, 4, 5));
        
        */
        
        
        // faktroriyel();
        
        /*
        int sonuc= dortilecarp(ikiiletopla(ikiilecarp(10)));
       
        
        System.out.println("sonuç = " + sonuc);
        
        */
        
        /* 
        
        asl sayı bulma 
        
        for (int i =2 ; i < 1000; i++)
        {
            
           
            
            if (asalbulma(i)){
                
                System.out.println(i);
                
            }
            
        }
        */
        
        
        // ebob metodu 
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("birinci sayı giriniz= ");
        int a = scanner.nextInt();
        System.out.print("ikinci sayi giriniz= ");
        
        int b = scanner.nextInt();
        
        System.out.println("iki sayının ebobu = " + ebob(a, b));
        
       
                
        
        
    }
    
}
