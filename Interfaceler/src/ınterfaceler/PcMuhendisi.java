/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ınterfaceler;

/**
 *
 * @author DELL
 */
public class PcMuhendisi implements IMuhendis{

    
    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
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
        
        System.out.println("bilgisayar mühendisi olarak şu şirketlerde çalıştım ");
        
        for (String i : array){
            
            System.out.println(i);
        }
        
        
    }
    
    
    
    
    
    
}
