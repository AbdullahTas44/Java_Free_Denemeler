/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ınheritance;

/**
 *
 * @author DELL
 */
public class Yonetici extends Calisan { // subclass
    
    
    private int sorumlu_kisi; //ekstra özellik
    
    
    public Yonetici ( String isim,int maas,String departman,int sorumlu_kisi){
        
       /*
        this.isim=isim;
       this.maas=maas;
       this.departman=departman;
       */
       
       
       super(isim,maas,departman);
       
       
       this.sorumlu_kisi=sorumlu_kisi;
       
    
                
    }
    
    
    public void zamyap(int zam_miktari){
        
        System.out.println("çalışanlara " + zam_miktari + " TL zam yapıldı");
        
        
    }
    
    
   public void bilgilerigoster(){
        
        /*
        System.out.println("İsim : " + getIsim());
        System.out.println("Maas : " + getMaas());
        System.out.println("Depertman : " + getDepartman());
        */
        
        super.bilgilerigoster();
        
        System.out.println("Sorumlu olunan kişi : " +  sorumlu_kisi);
        
        
        
    }
    
    
    
    
    
    
    
}
