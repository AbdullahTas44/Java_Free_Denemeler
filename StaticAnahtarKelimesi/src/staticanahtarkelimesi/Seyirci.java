/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticanahtarkelimesi;

/**
 *
 * @author DELL
 */
public class Seyirci {
    
   private static  int seyirci_sayisi=0;
    
    
    
    private String  isim;

    public Seyirci(String isim) {
        this.isim = isim;
        seyirci_sayisi++;
        
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
    
    public void oyun_seyret(){
        
        System.out.println(isim + " oyun seyrediyor ");
        
        
    }

    public static int getSeyirci_sayisi() {
        return seyirci_sayisi;
    }

    public static void setSeyirci_sayisi(int seyirci_sayisi) {
        Seyirci.seyirci_sayisi = seyirci_sayisi;
    }
    
    
    
}
