/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calısanlarprogramı;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CalısanlarProgramı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("çalışanlar programına hoşgeldin canım");
        
        String islemler = "İşlemler \n"
                + "1. Yazılımcı İşlemleri\n"
                + "2. Yönetici İşlemleri\n"
                + "çıkış için q ya bas";
        
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");
        
        
        while (true){
            
            System.out.println("islemi seçiniz");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
            
                System.out.println("programdan çıkıyoruz");
                break;
            
        }
            else if (islem.equals("1")){
                
                Yazilimci yazilimci = new Yazilimci("ABDULLAH", "TAŞ", 1, "JAVA,C,C++,C#");
                
                String yazilimciislem = "1. Format At\n"
                        + "2. Bilgileri Göster\n"
                        + "çıkış için q basın";
                
                System.out.println("*************************");
                System.out.println(yazilimciislem);
                System.out.println("*************************");
                
                
                while (true){
                    System.out.println("işlemi seçiniz");
                    String yislem= scanner.nextLine();
                    
                    if (yislem.equals("q")){
                        
                        System.out.println("yazılımcı işlemlerden çıkılıyor");
                        break;
                    }
                    else if (yislem.equals("1")){
                        
                        System.out.println("yazılımcının işletim sistemi");
                        String isletimsistemi= scanner.nextLine();
                        yazilimci.formatat(isletimsistemi);
                        
                    }
                    else if (yislem.equals("2")){
                        
                        yazilimci.bilgilerigoster();
                        
                    }
                    else {
                        
                        System.out.println("geçersiz yazılımcı işlemi ");
                    }
                    
                    
                }
                
                
                
            }
            
            else if (islem.equals("2")){
                
                Yonetici yonetici = new Yonetici("HARUN", "IYI", 2, 100);
                
                String yonetici_islem = "Yönetici işlemleri \n"
                        + "1. zam yap\n"
                        + "2. bilgileri göster\n"
                        + "çıkış için q bas";
                System.out.println("*************************");
                System.out.println(yonetici_islem);
                System.out.println("*************************");
                
                while (true){
                    
                    System.out.println("işlem seçiniz");
                    String yislem = scanner.nextLine();
                    
                    if (yislem.equals("q")){
                        
                        System.out.println("yönetici işleminden çıkış yapılıyor");
                        break;
                        
                        
                    }
                    
                    else if (yislem.equals("1")){
                        
                        System.out.println("ne kadar zam yapsın");
                        
                         int zammiktari= scanner.nextInt();
                         scanner.nextLine();
                         
                         yonetici.zamyap(zammiktari);
                         
                        
                    }
                    
                    else if (yislem.equals("2")){
                        
                        
                        yonetici.bilgilerigoster();
                        
                    }
                    
                    else {
                        
                        System.out.println("geçersiz yönetici işlemi ");
                    }
                    
                }
                        
                        
            }
            
            else {
                System.out.println("geçersiz işlem...");
                
                
            }
            
        }
        
        
    }
    
}
