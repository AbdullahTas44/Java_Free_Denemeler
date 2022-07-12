/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurtdisicikisprogrami;

import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Yolcu implements IYurtDisiKurallari{
    
    private int harc;
    private boolean siyasi_yasak;
    private boolean vize_durumu;

    public Yolcu() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("yatırdığınız harç bedeli : ");
        this.harc=scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Siyasi yasağınız var mı ?  :");
        String cevap = scanner.nextLine();
        
        if (cevap.equals("evet")){
           
            this.siyasi_yasak= true;
      
        }
        else{
            
            this.siyasi_yasak=false;
            
        }
        
        System.out.print("vizeniz varmı ? : ");
        String cevap2 = scanner.nextLine();
        
        if (cevap2.equals("evet")){
            
            this.vize_durumu= true;
      
        }
        else{
            
           this.vize_durumu=false;
            
        }
        
        
    }

    
    
    @Override
    public boolean yurt_disi_harci_kontrol() {
        
        if (this.harc<15){
            
            System.out.println("lütfen yurt dışı çıkış harcını tam yatırın");
            return false;
        }
        else {
            
            System.out.println("Yurt dışı harcı işlemini tamamdır");
            return true;
            
        }
        
    }

    @Override
    public boolean siyasi_yasak_kontrol() {
        
        if (this.siyasi_yasak==true){
            
            System.out.println("siyasi yasağınız var çıkamazsınız");
            return false;
            
        }
        else{
            
            System.out.println("Siyasi yasağınız yok yolunuz açık olsun");
            return true;
            
        }
    }

    @Override
    public boolean vize_durumu_kontrol() {
        
        if (this.vize_durumu==true){
            
            System.out.println("vize işlemleriniz tamamdır yolunuz açık olsun");
            return true;
        }
        else {
            
            System.out.println("gideceğiniz ülkeye vizeniz yok");
            return false;
             
        }
    }
    
    
    
    
    
    
    
}
