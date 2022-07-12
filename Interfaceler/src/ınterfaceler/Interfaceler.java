/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ınterfaceler;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Interfaceler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PcMuhendisi muhendis1= new PcMuhendisi(false, false);
        MakineMuhendisi muhendis2 = new MakineMuhendisi(true, false);
        
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.1));
        
        String[] tecrube = {"vestel","havelsan","turksat"};
        
        muhendis1.is_tecrubesi(tecrube);
        
        
        System.out.println("**********************");
        System.out.println("makine mühendisi bilgileri");
        String[] tecrube2 = {};
        String[] referanslar={"mustafa murat","abdullah taş","milletvekli"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(tecrube2);
        muhendis2.referans_getir(referanslar);
        muhendis2.calisma();
        
    
        
        
        
   
    
        
        
        
    
    }
}
