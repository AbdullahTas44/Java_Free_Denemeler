/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringler;

/**
 *
 * @author DELL
 */
public class Stringler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String a ="abdullah";
        
        String b= new String("ali recai");
        
        System.out.println(b);
        
        System.out.println("harf sayisi = " + b.length());
        
        System.out.println("0. index =" + b.charAt(0));
        System.out.println("4. index =" + b.charAt(4));
        System.out.println("son harf =" + b.charAt(b.length()-1));
 
        System.out.println(b.startsWith("al"));  // b stringi al ile mi başlar 
        System.out.println(b.endsWith("cai"));  // b stringi cai ile mi bitiyor 
        
        System.out.println(b.indexOf("a"));  //b stringi içinde a harfi var mı varsa kaçıncı sırada 
        
        System.out.println(b.toLowerCase());  // b stringini küçük harflere dönüştürme 
        System.out.println(b.toUpperCase());  // b stringini büyük harflere dönüştürme
        
        
        
        String c = "1905";
        
        int sayi = Integer.parseInt(c);  // string integer çevirme 
        
        System.out.println(sayi+5);
        
        String c1 = String.valueOf(sayi);   // integer string çevirme 
        
        System.out.println(c1);
        
        
        
        
        
        
        
        
        
    }
    
}
