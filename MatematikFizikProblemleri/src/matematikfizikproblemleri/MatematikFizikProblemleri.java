/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematikfizikproblemleri;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author DELL
 */
public class MatematikFizikProblemleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // daire alan - Matematik
        // üçgen çevresi  - Matematik
        // 3 boyutlu vektör çarğımı - fizik
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("matematik ve fizik problemleri programına hoş geldiniz");
        
        String islemler = "islemler ...  \n"
                + "1.Daire Alanı Hesapla \n"
                + "2.Ucgen Çevresi Hesapla \n"
                + "3.İki vektörün iç çarpımını hesaplama \n"
                + "Çıkış için q basın";
        
        while(true){
            
            System.out.println(islemler);
            System.out.println("işleminizi seçiniz");
            
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("programdan çıkıyoruz");
                break;
                
                
                
            }
            else if ( islem.equals("1")){
                
                
                System.out.print("yaricap degeri giriniz: ");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.daire_alan(yaricap);
                
            }
            
            else if ( islem.equals("2")){
                
                System.out.println("üçgen kenarlarını giriniz");
                System.out.print("kenar1 : ");
                int kenar1= scanner.nextInt();
                System.out.print("kenar2 : ");
                int kenar2= scanner.nextInt();
                System.out.print("kenar3 : ");
                int kenar3= scanner.nextInt();
                scanner.nextLine();
                
                
                Problem.Matematik.ucgen_cevresi(kenar1, kenar2, kenar3);
                 
                
            }
            
            else if (islem.equals("3")){
                
               Vec vec1=new Vec("vektör 1");
               Vec vec2=new Vec("vektör 2");
               
               Problem.Fizik.ic_carpim(vec1, vec2);
               
               
                
            }
            else {
                
                System.out.println("geçersiz işlem girdiniz");
                
                
            }
        }
        
        
        
    }
    
}
