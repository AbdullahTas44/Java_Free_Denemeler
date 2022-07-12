/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractclasslar;

/**
 *
 * @author DELL
 */
public class AbstractClasslar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Sekil sekil;
       
       sekil = new Kare(10, "kare2");
       
       sekil.alan_hesapla();
        
       Kare kare1 = new Kare(5, "kare1");
       Daire daire1 = new Daire(3, "daire1");
       
       kare1.alan_hesapla();
       daire1.alan_hesapla();
       kare1.cevre_hesapla();
       
      
       
       
       
        
        
    }
    
}
