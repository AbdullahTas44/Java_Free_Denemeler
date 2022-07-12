/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticanahtarkelimesi;

/**
 *
 * @author DELL
 */
public class StaticAnahtarKelimesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Seyirci seyirci1= new Seyirci("Abdullah Taş");
       Seyirci seyirci2 = new Seyirci("Harun bey");
        
        seyirci1.oyun_seyret();
        
        
        System.out.println("seyirci sayisi " + Seyirci.getSeyirci_sayisi());
        System.out.println("seyirci sayisi " + seyirci1.getSeyirci_sayisi());
        System.out.println("seyirci sayisi " + seyirci2.getSeyirci_sayisi());
        
        
    }
    
    
    
}
