/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ınheritance;

/**
 *
 * @author DELL
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Yonetici yonetici1 = new Yonetici("ABDULLAH", 6000, "BILGI ISLEM",10);
        
        Calisan calisan1 = new Calisan("ABDULLAH",6000,"BILGI ISLEM");
        
        
        calisan1.bilgilerigoster();
       
        System.out.println("");
        System.out.println(" *** ARADAKİ FARKLAR *** ");
        System.out.println("");
        
        yonetici1.bilgilerigoster();
        
        yonetici1.zamyap(200);
        
        
        
        
        
        
        
        
        
    }
    
}
