/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericmetodlar;

/**
 *
 * @author DELL
 */
public class GenericMetodlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
        
        Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);
        
        Sayisal birinci = birinci(sayisal1, sayisal2);
        
      
        
        
        Esitagirlik esitagirlik1 = new Esitagirlik(30, 20, 40, 2);
        
        Esitagirlik esitagirlik2 = new Esitagirlik(40, 10, 50, 0);
        
        Esitagirlik birinci2 = birinci(esitagirlik1, esitagirlik2);
        
        System.out.println("birinci sayisal öğrenci puanı : " + birinci.puan_hesapla());
        
        System.out.println("birinci eşitağırlık öğrenci puanı : " + birinci2.puan_hesapla());
        
        /*
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"java", "Pyhton", "C++","Php"};
        
        Ogrenci[] ogrenci_dizi = {new Ogrenci("mustafa"), new Ogrenci("Mehmet"), new Ogrenci ("cemal")};
        
        
        yazdir(char_dizi);
        yazdir(string_dizi);
        yazdir(integer_dizi);
        yazdir(ogrenci_dizi);
        */
        
        
        
        
        
    }
    
    public static <E extends Aday>E birinci(E e1, E e2){
        
        if (e1.puan_hesapla()> e2.puan_hesapla()){
            
            return e1;
            
        }else{
            
            return e2;
            
        }
        
        
    }
    
    
    
    /*
        public static <E> void yazdir( E[] dizi) {
        
        for ( E e : dizi){
            
            System.out.println(e);
            
            
        }
   
    
    
    
}
    
 */
    
    
}
