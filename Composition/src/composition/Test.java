/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composition;

/**
 *
 * @author DELL
 */
public class Test {  // HES - A ilişkisi vardır bigisayar anakartı kapsar 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Resolution resolution = new Resolution(1920, 1820);
        Monitor monitor = new Monitor("HF12", "ASUS", "18.5", resolution);
        Kasa kasa = new Kasa("MH432", "SHADOW", "temperli kasa");
        Anakart anakart = new Anakart("B250", "ASUS", 10, "WINDOWS 10");
        
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        
        
       pc.getKasa().bilgisayari_ac();
       
       pc.getMonitor().monitoru_kapat();
       
       pc.getAnakart().isletim_sistemi("UBUNTU 5.0");
       
       
        
    
    
       
        
        
    }
    
}
