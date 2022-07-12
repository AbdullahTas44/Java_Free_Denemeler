/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calısanlarprogramı;

/**
 *
 * @author DELL
 */
public class Yazilimci extends Calisan{
    
    
    private String diller;
    
    public Yazilimci(String ad, String soyad, int id, String diller){
        
        
        super(ad, soyad, id);
        this.diller=diller;
        
       
        
    }
    
    
    public void formatat(String isletim_sistemi){
        
        System.out.println(getAd()+ " " + isletim_sistemi + "ni yüklüyor... ");
        
        
    }

    @Override
   
    
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        System.out.println("yazılımcının bildiği diller " + diller);
    
        }
}