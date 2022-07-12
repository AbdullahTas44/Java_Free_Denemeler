/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author DELL
 */
public class Abone {
    
    
    public String isim;
    public int  bakiye;
    public String sehir;
    
    
    
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
