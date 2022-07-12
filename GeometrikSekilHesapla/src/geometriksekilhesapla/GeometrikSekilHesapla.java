/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometriksekilhesapla;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class GeometrikSekilHesapla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "işlemler ....  \n"
                + "1. Kare Alanı Hesapla \n"
                + "2. Üçgen Alanı Hesapla \n"
                + "3. Daire Alanı Hesapla \n"
                + "4. Çıkış için q bas";
        
        while (true){
            System.out.println(islemler);
            System.out.println("hangi şeklin alanını hesaplamak istiyorsunuz");
            String sekil_turu= scanner.nextLine();
            Sekil sekil= null;
            
            if (sekil_turu.equals("q")){
                
                System.out.println("Programdan çıkılıyor"); 
               break;
                
            }else if ( sekil_turu.equals("1")){
                
                System.out.println("Karenin kenarı ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Kare(kenar, "kare1");
                sekil.alanhesapla();

            }
            else if ( sekil_turu.equals("2")){
                
                System.out.println("Ucgenin kenarlarını giriniz ");
                System.out.print("kenar1  ");
                int a = scanner.nextInt();
                  System.out.print("kenar2  ");
                int b = scanner.nextInt();
                  System.out.print("kenar3  ");
                int c = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Ucgen(a, b, c, "Üçgen1");
                sekil.alanhesapla();

            }
            else if ( sekil_turu.equals("3")){
                
                System.out.println("Dairenin yarıçapını giriniz");
                
                int yaricap = scanner.nextInt();
                  
                scanner.nextLine();
                
                sekil = new Daire(yaricap, "Daire1");
                sekil.alanhesapla();

            }
            else {
                
                System.out.println("geçersiz işlem girdiniz");
                
            }
            
            
        }
        
   
    
    }
}


