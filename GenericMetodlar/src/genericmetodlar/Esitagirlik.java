/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericmetodlar;

/**
 *
 * @author DELL
 */
public class Esitagirlik extends Aday{

    public Esitagirlik(int Turkce, int Matematik, int Edebiyat, int Fizik) {
        super(Turkce, Matematik, Edebiyat, Fizik);
    }

    
    
    
    @Override
    public int puan_hesapla() {
       
        
        return (getTurkce()*5) + (getMatematik() * 5) + (getFizik()*1) + (getEdebiyat()*4);
        
   
    
    
    }
    
    
    
    
}
