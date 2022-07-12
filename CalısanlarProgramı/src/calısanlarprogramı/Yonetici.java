/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calısanlarprogramı;

/**
 *
 * @author DELL
 */
public class Yonetici  extends Calisan{
    
    
    private int sorumlu_kisi_sayisi;
    
    public Yonetici (String ad,String soyad, int id , int sorumlu_kisi_sayisi){
        
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
        
        
        
        
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        
        System.out.println("yöneticinin sorumlu olduğu kişi sayısı : " + sorumlu_kisi_sayisi);
        
        
  
    }
  
    
    public void zamyap (int zammiktari){
        
        System.out.println(getAd() + " çalışanlara " + zammiktari + " kadar zam yapılıyor...");
        
        
    }
    
    
    
}
