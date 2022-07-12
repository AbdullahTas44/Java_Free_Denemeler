/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ınterfaceler;

import jdk.internal.dynalink.DefaultBootstrapper;

/**
 *
 * @author DELL
 */
public class MakineMuhendisi implements IMuhendis, ICalisma{

    private boolean askerlik;

    @Override
    public void calisma() {
        
        
        System.out.println("Makine mühendisi işe alındı");

    }
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    
    
    @Override
    public void askerlik_durumu_sorgula() {
        
         if (askerlik){
            
            System.out.println("askerliğimi yaptım");
            
        }
        else {
            
            System.out.println("askerliğimi henüz yapmadım");
        }
        
        
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        
        
        return "ortalamam : " + derece;
        
        
    }
    

    @Override
    public void adli_sicil_sorgula() {
        
         if (adli_sicil){
            
            System.out.println("adli sicil kaydım vardır");
            
        }
        else{
            
            System.out.println("adli sicil kaydım yoktur");
        }
         
    }

    @Override
    public void is_tecrubesi(String[] array) {
        
        if(array.length==0){
            
            System.out.println("herhangi bir tecrübem yok");
            
        }
        else {
            
            System.out.println("makine mühendisi olarak şu şirketlerde çalıştım ");
            
            for ( String i : array){
                
                System.out.println(i);
                
                
            }
            
        }
        
        
    }
    
    
    
    
    public void referans_getir(String[] array){
        
        if (array.length==0){
            
            System.out.println("herhnagi bir iş tecrübem yok");
            
        }
        else {
            
            System.out.println("referanslarım");
            for ( String i : array){
                
                System.out.println(i);
            }
            
        }
        
    }
    
    
}
