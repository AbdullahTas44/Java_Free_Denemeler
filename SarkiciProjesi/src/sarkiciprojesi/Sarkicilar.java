/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sarkiciprojesi;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Sarkicilar {
    
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();
    
    public void sarkicilari_bastir (){
        
        
        System.out.println("Şarkıcı Listesinde " + sarkici_listesi.size() + "kadar şarkıcı var.");
        
        for (int i = 0 ; i< sarkici_listesi.size(); i++){
        
        
            System.out.println((i+1) + "Şarkıcı" + sarkici_listesi.get(i));
            
              }
 
    }

    public void sarkici_ekle (String isim){
        
        sarkici_listesi.add(isim);
        
        System.out.println("Şarkıcı listeye eklendi");
        
    }
    
    public void sarkici_guncele(String yeni_isim, int yer){
        
        sarkici_listesi.set(yer, yeni_isim);
        System.out.println("şarkıcı listesi güncellendi");
        
    }
    
    public void sarkic_sil (int yer){
        
        
        String isim = sarkici_listesi.get(yer);
        sarkici_listesi.remove(yer);
        
        System.out.println(isim + " ismli şarkıcı listeden silindi...");
        
       
    }
    
    
    public void sarkici_ara (String sarkici_ismi){
        
        int yer=sarkici_listesi.indexOf(sarkici_ismi);
        
        if ( yer >= 0){
            
            System.out.println(" şarkıcı bulundu ");
            System.out.println(sarkici_ismi + " isimli şarkıcı " + (yer+1) + "pozisyonda ");
            
            
        }
        else {
            
            System.out.println("bu şarkıcı bulunamadı");
            
        }
        
        
        
        
        
        
    }
    
    
    
}
