/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author DELL
 */
public class Gelismisabone {
    
    
    private String abone_isim;
    private int bakiye=120;
    private String sehir;

    public Gelismisabone(String isim,int bakiye, String sehir) {
        this.abone_isim = isim;
        
        if (bakiye >0 && bakiye <=120){
            
            this.bakiye=bakiye;
            
            
        }
       
        this.sehir = sehir;
        
        
    }
    
    
    public void dogalgaz_kullan (int miktar){
        
        if (this.bakiye- miktar < 0 ){
            
            System.out.println("paran yok bebek");
            
            
        }
        
        else {
            
            this.bakiye-= miktar;
            
            if (this.bakiye <= 0 ){
                
                System.out.println("bakiye bitti git para yükle limit 120 TL");
                
                
            }
            else {
                
                System.out.println("yeni bakiye = " + bakiye);
            }
            
            
        }
        
        
        
        
    }
    
    
    
    public void bakiye_ogren (){
        
        System.out.println("bakiyeniz = " + bakiye);
        
        
        
    }
    
    
    
    
}
