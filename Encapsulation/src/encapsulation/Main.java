/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        
        Abone abone = new Abone();
        abone.isim="abdullah";
        abone.bakiye=200;
        abone.sehir= "malatya";
        
        abone.dogalgaz_kullan(200);
        
         */

        Gelismisabone abone = new Gelismisabone("harun", 200, "malatya");
        
        
        abone.bakiye_ogren();
        
        
        
        
       
        
    }
    
}
