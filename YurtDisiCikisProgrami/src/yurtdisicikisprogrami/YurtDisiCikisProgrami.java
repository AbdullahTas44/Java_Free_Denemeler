/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yurtdisicikisprogrami;

/**
 *
 * @author DELL
 */
public class YurtDisiCikisProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
       
        
        
        
        System.out.println("sabiha gökçen havalimanına hoşgeldiniz sayın yolcu");
        
        String sartlar = "yurt dışı çıkış kuralları\n"
                + "herhangi bir siyasi yasağını bulunmamalı\n"
                + "15 TL harç bedelinizi yatırmış olmanız lazım\n"
                + "gideceğiniz ülkeye vizeniz olmalı";
        
      
        
        String message= "yurt dışı şartlarından hepsini sağlamanız lazım";
        
        while(true){
            
            System.out.println("****************************");
            System.out.println(sartlar);
            System.out.println("****************************");
            
             Yolcu yolcu = new Yolcu();
             
             System.out.println("harç bedeli kontrol ediliyor");
             Thread.sleep(3000);
             
             if(yolcu.yurt_disi_harci_kontrol()==false){
                 
                 System.out.println(message);
                 continue;
                 
             }
             
             System.out.println("siyasi yasak kontrol ediliyor");
             Thread.sleep(3000);
             
             if(yolcu.siyasi_yasak_kontrol()==false){
                 
                 System.out.println(message);
                 continue;
                 
             }
             System.out.println("vize durumunuz kontrol ediliyor");
             Thread.sleep(3000);
             if (yolcu.vize_durumu_kontrol()== false){
                 
                 System.out.println(message);
                 continue;
                 
             }
             System.out.println("işlemleriniz tamamdır iyi yolculuklar dilerim...");
             break;
            
            
        }
        
        
        
        
    }
    
}
