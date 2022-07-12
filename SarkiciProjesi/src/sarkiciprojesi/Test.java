/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sarkiciprojesi;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
    private static Sarkicilar sarkicilar = new Sarkicilar();
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleri_bastir(){
        
        
        System.out.println("\t  0- İslemleri Göster");
        System.out.println("\t  1- Şarkıcıları Görüntüle");
        System.out.println("\t  2- Şarkıcı Ekle");
        System.out.println("\t  3- Şarkıcı Güncelle");
        System.out.println("\t  4- Şarkıcı Sil");
        System.out.println("\t  5- Şarkıcı Ara");
        System.out.println("\t  6- Uygulamadan ÇIk");
        
        
        
    }
    
    public static void sarkicilari_goruntule(){
        
        sarkicilar.sarkicilari_bastir();
        
    }
    
    public static void sarkici_ekle(){
        
        System.out.println("eklemek istediğiniz şarkıcı ismi nedir ?");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
        
        
    }
    
    
     public static void sarkici_guncelle(){
        
        System.out.println("hangi sıradaki şarkıcıyı güncellemek istersiniz ?");
        int yer = scanner.nextInt();
        scanner.nextLine();
        
        String yeni_isim = scanner.nextLine();
        sarkicilar.sarkici_guncele(yeni_isim, (yer-1));
        
        
        
    }
    
     public static void sarkici_sil(){
        
        System.out.println("Silmek istediğiniz şarkıcı numarsını giriniz");
        int yer=scanner.nextInt();
        sarkicilar.sarkic_sil((yer-1));
        
    }
     
      public static void sarkici_ara(){
        
        System.out.println("Aramak istediğiniz şarkıcı isimi nedir?");
        
        String aranan_isim= scanner.nextLine();
        
        sarkicilar.sarkici_ara(aranan_isim);
        
        
    }
      
      
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz");
        
        islemleri_bastir();
        
        
        boolean cikis= false;
        
        int islem;
        
        while(!cikis){
            
            System.out.println("bir işlem seçiniz");
            islem = scanner.nextInt();
            scanner.nextLine();
            
            switch (islem) {
                
                case 0: 
                    islemleri_bastir();
                    break;
                  
                case 1 : 
                    sarkicilari_goruntule();
                    break;
                    
                case 2 :
                    sarkici_ekle();
                    break;
                    
                case 3 :
                    sarkici_guncelle();
                    break;
                case 4 :
                    sarkici_sil();
                    break;
                case 5: 
                    sarkici_ara();
                    break;
                case 6: 
                    System.out.println("uygulamadan çıkıyoruz ....");
                    
                    cikis=true;
                    break;
             
            }

        }
        
        
        
    
    
    }
    
    
    
}
